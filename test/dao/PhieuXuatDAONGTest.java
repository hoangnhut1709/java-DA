/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Date;
import java.util.List;
import model.PhieuXuat;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Asus
 */
public class PhieuXuatDAONGTest {
    PhieuXuatDAO dao;
    PhieuXuat px;
    
    public PhieuXuatDAONGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        dao = new PhieuXuatDAO();
        px = new PhieuXuat();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of insert method, of class PhieuXuatDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
//        Date ngay = new Date();
        String MaXuat = "Vte";
        PhieuXuat px1 = new PhieuXuat(MaXuat, "SP1", "K01", "can", "ND2", 10.2, 10);
        dao.insert(px1);
        PhieuXuat rs = dao.findById(MaXuat);
        assertEquals(rs.getMaXuat(), MaXuat);
    }

    /**
     * Test of update method, of class PhieuXuatDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
            String MaXuat = "vll";
            dao.delete(MaXuat);
            PhieuXuat rs = dao.findById(MaXuat);
    }
//
//    /**
//     * Test of select method, of class PhieuXuatDAO.
//     */
    @Test
    public void testSelect() {
        System.out.println("select");
        List rs = dao.select();
        assertTrue(rs.size() >0);
    }

//    /**
//     * Test of selectByKeyword method, of class PhieuXuatDAO.
//     */
    @Test
    public void testSelectByKeyword() {
        
        System.out.println("selectByKeyword");
        String keyword = "Xq";
        PhieuXuatDAO px = new PhieuXuatDAO();
        List<PhieuXuat> rs = px.selectByKeyword(keyword);
        assertTrue(rs.size()>0, keyword);    
        
        
    }
//
//    /**
//     * Test of findById method, of class PhieuXuatDAO.
//     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        String MaXuat = "Xc1";
        PhieuXuatDAO px = new PhieuXuatDAO();
        PhieuXuat result = px.findById(MaXuat);
        assertEquals(result.getMaXuat(), MaXuat);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}