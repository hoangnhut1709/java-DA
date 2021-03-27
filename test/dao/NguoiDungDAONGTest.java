/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.NguoiDung;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Hai Au
 */
public class NguoiDungDAONGTest {
    
    NguoiDungDAO instance;
    
    public NguoiDungDAONGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        instance = new NguoiDungDAO();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of insert method, of class NguoiDungDAO.
     */
    @Test(priority = 0)
    public void testInsert() {
        
        System.out.println("Insert");
        
        String MaND = "ND6";
        NguoiDung model = new NguoiDung(MaND, "Nguyen Van C", "989898", "N01");
        instance.insert(model);
        NguoiDung result = instance.findById(MaND);
        assertEquals(result.getMaND(), MaND);
    }

    /**
     * Test of update method, of class NguoiDungDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("Update");
        
        String MaND = "ND6";
        String TenND = "Nguyen Van C";
        NguoiDung model = new NguoiDung(MaND, TenND, "979899", "N03");
        instance.update(model);
        NguoiDung result = instance.findById(MaND);
        assertEquals(result.getTenND(), TenND);
        System.out.println("Nguoi Dung: "+result.getPassword());
    }

    /**
     * Test of delete method, of class NguoiDungDAO.
     */
    @Test(expectedExceptions = NullPointerException.class, priority = 1)
    public void testDelete(){
        System.out.println("Delete");
        String MaND = "ND6";
        instance.delete(MaND);
        NguoiDung result = instance.findById(MaND);
        assertEquals(result.getMaND(), MaND);
    }

    /**
     * Test of select method, of class NguoiDungDAO.
     */
    @Test
    public void testSelect() {
        System.out.println("select");
        
        List result = instance.select();
        assertTrue(result.size()>0);
        System.out.println("Số lượng người dùng: "+ result.size());
    }

    /**
     * Test of findById method, of class NguoiDungDAO.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        String MaND = "ND1";
        NguoiDung result = instance.findById(MaND);
        assertEquals(result.getMaND(), MaND);
        System.out.println("Kết quả tìm kiếm: "+result.getMaND());
    }
    
}
