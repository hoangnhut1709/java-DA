/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.LoaiNhaCC;
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
public class LoaiNhaCCDAONGTest {

    private LoaiNhaCCDAO instance;

    public LoaiNhaCCDAONGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        instance = new LoaiNhaCCDAO();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test load dữ liệu
     */
    @Test
    public void testSelect() {
        System.out.println("select");
        List result = instance.select();
        assertTrue(result.size() > 0);
        System.out.println("Du lieu"  + result.size());
    }

    @Test
    public void test_Insert() {
        System.out.println("Insert");
        String MaLoaiCC = "MLCC06";
        LoaiNhaCC model = new LoaiNhaCC(MaLoaiCC,"Thai Lan");
        instance.insert(model);
        LoaiNhaCC result = instance.findById(MaLoaiCC);
        assertEquals(result.getMaLoaiCC(), MaLoaiCC);

    }

    /**
     * Test update đơn hàng
     */
    @Test
    public void test_Update() {
        System.out.println("update");
        String MaLoaiCC = "MLCC02";
        LoaiNhaCC model = new LoaiNhaCC(MaLoaiCC,  "Trung Quoc");
        instance.update(model);
        LoaiNhaCC result = instance.findById(MaLoaiCC);
        assertEquals(result.getMaLoaiCC(), MaLoaiCC);
        System.out.println("QuocGiaCC " + result.getMaLoaiCC());
    }
//
//    /**
//     * Test xóa đơn hàng
//     */
    @Test(expectedExceptions = NullPointerException.class)
    public void test_Delete() throws NullPointerException {
        System.out.println("delete");
        String MaLoaiCC = "MLCC06";
        instance.delete(MaLoaiCC);
        LoaiNhaCC rs = instance.findById(MaLoaiCC);
        assertEquals(rs.getMaLoaiCC(), rs.getMaLoaiCC());
    }
//
//    /**
//     * Test thêm trùng mã
//     */
    @Test(expectedExceptions = RuntimeException.class)
    public void test_Exists() throws RuntimeException {
        System.out.println("Exists");
        String MaLoaiCC = "MLCC01";
       
        LoaiNhaCC model = new LoaiNhaCC(MaLoaiCC, "VietNam");
        instance.insert(model);
    }
}
