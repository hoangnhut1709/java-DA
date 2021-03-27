/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.PhieuNhap;
import static org.junit.Assert.assertEquals;
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
public class PhieuNhapDAONGTest {

    PhieuNhap pn;
    PhieuNhapDAO dao;
    private ArrayList<String> list;

    public PhieuNhapDAONGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        dao = new PhieuNhapDAO();
        pn = new PhieuNhap();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of insert method, of class PhieuNhapDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Date dt = new Date();
        String MaNhap = "N10";
        PhieuNhap pn1 = new PhieuNhap(MaNhap, "SP1", "K01", "ND1", dt, 5, 10);
        dao.insert(pn1);
        PhieuNhap result = dao.findById(MaNhap);

        assertEquals(result.getMaNhap(), MaNhap);
    }

    /**
     * Test of delete method, of class PhieuNhapDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String MaNhap = "N10";
        dao.delete(MaNhap);
        PhieuNhap rs = dao.findById(MaNhap);
       

    }

    /**
     * Test of select method, of class PhieuNhapDAO.
     */
    @Test
    public void testSelect() {
        System.out.println("select");
    
            List result = dao.select();
            assertTrue(result.size() > 0);


    }

    /**
     * Test of findById method, of class PhieuNhapDAO.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        String MaNhap = "N01";
        PhieuNhapDAO instance = new PhieuNhapDAO();
        PhieuNhap result = instance.findById(MaNhap);
        assertEquals(result.getMaNhap(), MaNhap);

    }

}
