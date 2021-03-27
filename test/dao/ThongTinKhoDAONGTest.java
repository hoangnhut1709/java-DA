/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.ThongTinKho;
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
public class ThongTinKhoDAONGTest {
    ThongTinKho pn;
    ThongTinKhoDAO dao;
    private ArrayList<String> list;

    public ThongTinKhoDAONGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        dao = new ThongTinKhoDAO();
        pn = new ThongTinKho();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of insert method, of class ThongTinKhoDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        ThongTinKho pn1 = new ThongTinKho("K013","Kho Q","Cái Nước");
        dao.insert(pn1);
        ThongTinKho result = dao.findById("K013");

        assertEquals(result.getMaKho(), "K013");
       
    }

    /**
     * Test of update method, of class ThongTinKhoDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        ThongTinKho pn1 = new ThongTinKho("K07","Kho M","Cà Mau");
        dao.update(pn1);
        ThongTinKho result = dao.findById("K07");

        assertEquals(result.getMaKho(), "K07");
        
    }

    /**
     * Test of delete method, of class ThongTinKhoDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        dao.delete("K013");
        ThongTinKho rs = dao.findById("K013");
       
        
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
        ThongTinKhoDAO instance = new ThongTinKhoDAO();
        ThongTinKho result = instance.findById("K01");
        assertEquals(result.getMaKho(), "K01");
        
    }
    
}
