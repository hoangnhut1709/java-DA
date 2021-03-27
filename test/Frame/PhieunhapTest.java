/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class PhieunhapTest {

    Phieunhap pn;

    public PhieunhapTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        pn = new Phieunhap();
    }

    @After
    public void tearDown() {
    }

    //Kiểm tra mã không hợp lệ
    @Test
    public void Insert_TC1() {
        pn.setTxtMaNhap("");
        pn.setTxtGia(5);
        pn.setTxtSoLuong(4);
        pn.doClickInsert();
        assertFalse(pn.test);
    }

    //Mã nhập sai định dạng
    @Test
    public void Insert_TC2() {
        pn.setTxtMaNhap("N1");
        pn.setTxtGia(5);
        pn.setTxtSoLuong(4);
        pn.doClickInsert();
        assertFalse(pn.test);
    }

    //Số lượng không để trống
    @Test
    public void Insert_TC3() {
        pn.setTxtMaNhap("N1");
        pn.setTxtGia(5);
        pn.setTxtSoLuong();
        pn.doClickInsert();
        assertFalse(pn.test);
    }

    //Số lượng nhập sai định dạng
    @Test
    public void Insert_TC4() {
        pn.setTxtMaNhap("N1");
        pn.setTxtGia(5);
        pn.setTxtSoLuong("abc");
        pn.doClickInsert();
        assertFalse(pn.test);
    }

    //Số lượng nhỏ hơn 0
    @Test
    public void Insert_TC5() {
        pn.setTxtMaNhap("N1");
        pn.setTxtGia(5);
        pn.setTxtSoLuong(-1);
        pn.doClickInsert();
        assertFalse(pn.test);
    }

    //Giá không được để trống
    @Test
    public void Insert_TC6() {
        pn.setTxtMaNhap("N1");
        pn.setTxtGia();
        pn.setTxtSoLuong(4);
        pn.doClickInsert();
        assertFalse(pn.test);
    }

    //Giá nhập sai định dạng
    @Test
    public void Insert_TC7() {
        pn.setTxtMaNhap("N1");
        pn.setTxtGia("abc");
        pn.setTxtSoLuong(4);
        pn.doClickInsert();
        assertFalse(pn.test);
    }

    //Giá nhỏ hơn 0
    @Test
    public void Insert_TC8() {
        pn.setTxtMaNhap("N1");
        pn.setTxtGia(-1);
        pn.setTxtSoLuong(4);
        pn.doClickInsert();
        assertFalse(pn.test);
    }

    //Thêm thành công
    @Test
    public void Insert_TC9() {

        pn.setTxtMaNhap("MN08");

        pn.setTxtGia(5);

        pn.setTxtSoLuong(4);

        pn.doClickInsert();
        assertTrue(pn.test);
    }
//    xoá phiếu nhập

    @Test
    public void Delete() {
        pn.doClickDelete();
        assertTrue(pn.test);
    }

    @Test
    public void New() {
        pn.setVisible(true);
        pn.setTxtMaNhap("MN08");
        pn.setTxtGia(5);
        pn.setTxtSoLuong(4);
        pn.doClickClear();
    }
}
