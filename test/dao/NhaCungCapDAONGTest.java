/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.NhaCungCap;
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
public class NhaCungCapDAONGTest {
    NhaCungCap ncc;
    private NhaCungCapDAO dao;
    private ArrayList<String> list;
    public NhaCungCapDAONGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
         dao = new NhaCungCapDAO();
        ncc = new NhaCungCap();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of isert method, of class NhaCungCapDAO.
     */
    @Test(priority = 0)
    public void testInsert() {
        System.out.println("insert");
        ncc = new NhaCungCap("MNCC06","MLCC05","Cong ty F","Cà Mau");
        dao.insert(ncc);
        NhaCungCap result = dao.findById("MNCC06");

        assertEquals(result.getMaNhaCC(), "MNCC06");
       
    }

    /**
     * Test of update method, of class ThongTinKhoDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        NhaCungCap ncc = new NhaCungCap("MNCC05","MLCC05","Cong ty G","Đồng Tháp");
        dao.update(ncc);
        NhaCungCap result = dao.findById("MNCC06");

        assertEquals(result.getMaNhaCC(), "MNCC06");
        
    }

    /**
     * Test of delete method, of class ThongTinKhoDAO.
     */
    @Test(priority = 1)
    public void testDelete() {
        System.out.println("delete");
        dao.delete("MNCC06");
        NhaCungCap rs = dao.findById("MNCC06");
    }
    
    /**
     * Test of select method, of class ThongTinKhoDAO.
     */
    @Test
    public void testSelect() {
        System.out.println("select");
        List result = dao.select();
            assertTrue(result.size() > 0);
       
    }

    /**
     * Test of findById method, of class ThongTinKhoDAO.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        NhaCungCapDAO instance = new NhaCungCapDAO();
        NhaCungCap result = instance.findById("MNCC01");
        assertEquals(result.getMaNhaCC(), "MNCC01");
        
    }
    
}
