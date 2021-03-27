/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Date;
import java.util.List;
import model.SanPham;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Admin
 */
public class SanPhamDAONGTest {
    SanPham sp;
    SanPhamDAO spd;
    
    public SanPhamDAONGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        spd = new SanPhamDAO();
        sp = new SanPham();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of insert method, of class SanPhamDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
       Date nsx = new Date();
        Date hsd = new Date();
        String maSP = "SP02";
        SanPham sp = new SanPham(maSP,"banhluamach","ML01","N01","MNCC01",nsx,hsd);
        spd.insert(sp);
        SanPham rs = spd.findById(maSP);
        assertEquals(rs.getMaSP(), maSP);
    }
    @Test
    public void testUpdate() {
        Date nsx = new Date();
        Date hsd = new Date();
        String maSP = "SP1";
        SanPham m = new SanPham(maSP,"BanhMi","ML01","N01","MNCC01",nsx,hsd);
        spd.update(m);
        SanPham rs = spd.findById(maSP);
        assertEquals(rs.getMaSP(), maSP);
    
    }
    /**
     * Test of update method, of class PhieuXuatDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
            String maSP = "SP02";
            spd.delete(maSP);
        SanPham rs = spd.findById(maSP);
    }
//
//    /**
//     * Test of select method, of class PhieuXuatDAO.
//     */
    @Test
    public void testSelect() {
        System.out.println("select");
        
        List rs = spd.select();
        assertTrue(rs.size() >0);
    }
//
//    /**
//     * Test of selectByKeyword method, of class PhieuXuatDAO.
//     */
    @Test
    public void testSelectByKeyword() {
        
        System.out.println("selectByKeyword");
        String keyword = "Sua";
      SanPhamDAO sp0 = new SanPhamDAO();
        List<SanPham> rs = sp0.selectByKeyword(keyword);
        assertTrue(rs.size()>0, keyword);    
        
        
    }

    @Test
    public void testFindById() {
        System.out.println("findById");
        String maSP = "SP3";
        SanPhamDAO sp1 = new SanPhamDAO();
        SanPham result = sp1.findById(maSP);
        assertEquals(result.getMaSP(), maSP);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}