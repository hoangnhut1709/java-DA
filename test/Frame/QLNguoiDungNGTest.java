/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author hoang
 */
public class QLNguoiDungNGTest {

    QLNguoiDung ql;

    public QLNguoiDungNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void TC1() {

        String mnd = "ND0022";
        String tnd = "Nguyen Ti Teo";
        String pw = "123123";
        String xn = "123123";

        ql.setVisible(true);

        ql = new QLNguoiDung();
        ql.setTxtMaND(mnd);
        ql.setTxtTenND(tnd);
        ql.setTxtPass(pw);
        ql.setTxtXNpass(xn);

        ql.doClick();
        assertTrue(ql.test);

    }

    @Test
    public void TC2() {
        
        String mnd = "ND009";//Mã người dùng thiếu 1 ký tự
        String tnd = "Len Van Lun";
        String pw = "123123";
        String xn = "123123";

        ql.setVisible(true);

        ql = new QLNguoiDung();
        ql.setTxtMaND(mnd);
        ql.setTxtTenND(tnd);
        ql.setTxtPass(pw);
        ql.setTxtXNpass(xn);

        ql.doClick();
        assertTrue(ql.test);

    }
    
    @Test
    public void TC3() {
        
        String mnd = "";//Tên người dùng rỗng
        String tnd = "Len Van Lun";
        String pw = "123123";
        String xn = "123123";

        ql.setVisible(true);

        ql = new QLNguoiDung();
        ql.setTxtMaND(mnd);
        ql.setTxtTenND(tnd);
        ql.setTxtPass(pw);
        ql.setTxtXNpass(xn);

        ql.doClick();
        assertTrue(ql.test);

    }
    
    @Test
    public void TC4() {
        
        String mnd = "ND000@";//Tên đăng nhập có ký tự đặc biệt
        String tnd = "Len Van Lun";
        String pw = "123123";
        String xn = "123123";

        ql.setVisible(true);

        ql = new QLNguoiDung();
        ql.setTxtMaND(mnd);
        ql.setTxtTenND(tnd);
        ql.setTxtPass(pw);
        ql.setTxtXNpass(xn);

        ql.doClick();
        assertTrue(ql.test);

    }
    @Test
    public void TC5() {
        
        String mnd = "ND0004";
        String tnd = "Nhut Nguyen @";//Tên người có ký tự đặc biệt
        String pw = "123123";
        String xn = "123123";

        ql.setVisible(true);

        ql = new QLNguoiDung();
        ql.setTxtMaND(mnd);
        ql.setTxtTenND(tnd);
        ql.setTxtPass(pw);
        ql.setTxtXNpass(xn);

        ql.doClick();
        assertTrue(ql.test);

    }

    @Test
    public void TC6() {
        
        String mnd = "ND0004";
        String tnd = "Nhut Nguyen 01";//Tên người có số
        String pw = "123123";
        String xn = "123123";

        ql.setVisible(true);

        ql = new QLNguoiDung();
        ql.setTxtMaND(mnd);
        ql.setTxtTenND(tnd);
        ql.setTxtPass(pw);
        ql.setTxtXNpass(xn);

        ql.doClick();
        assertTrue(ql.test);

    }
    
    @Test
    public void TC7() {
        
        String mnd = "ND0004";
        String tnd = "Nhut Nguyen A";
        String pw = "";//Mật khẩu + Xác nhận rỗng
        String xn = "";

        ql.setVisible(true);

        ql = new QLNguoiDung();
        ql.setTxtMaND(mnd);
        ql.setTxtTenND(tnd);
        ql.setTxtPass(pw);
        ql.setTxtXNpass(xn);

        ql.doClick();
        assertTrue(ql.test);

    }
    
    @Test
    public void TC8() {
        
        String mnd = "ND0004";
        String tnd = "Nhut Nguyen A";
        String pw = "55555";//Mật khẩu ít hơn 6 ký tự
        String xn = "55555";

        ql.setVisible(true);

        ql = new QLNguoiDung();
        ql.setTxtMaND(mnd);
        ql.setTxtTenND(tnd);
        ql.setTxtPass(pw);
        ql.setTxtXNpass(xn);

        ql.doClick();
        assertTrue(ql.test);

    }
    
    @Test
    public void TC9() {
        
        String mnd = "ND0004";
        String tnd = "Nhut Nguyen A";
        String pw = "7777777";//Mật khẩu nhiều hơn 6 ký tự
        String xn = "7777777";

        ql.setVisible(true);

        ql = new QLNguoiDung();
        ql.setTxtMaND(mnd);
        ql.setTxtTenND(tnd);
        ql.setTxtPass(pw);
        ql.setTxtXNpass(xn);

        ql.doClick();
        assertTrue(ql.test);

    }
    
    @Test
    public void TC10() {
        
        String mnd = "ND0004";
        String tnd = "Nhut Nguyen A";
        String pw = "555A@";//Mật khẩu có ký tự đặc biệt hoặc chữ cái
        String xn = "555A@";

        ql.setVisible(true);

        ql = new QLNguoiDung();
        ql.setTxtMaND(mnd);
        ql.setTxtTenND(tnd);
        ql.setTxtPass(pw);
        ql.setTxtXNpass(xn);

        ql.doClick();
        assertTrue(ql.test);

    }
    
    @Test
    public void TC11() {
        
        String mnd = "ND0004";
        String tnd = "Nhut Nguyen A";
        String pw = "654321";
        String xn = "654321";//Xác nhận không đúng

        ql.setVisible(true);

        ql = new QLNguoiDung();
        ql.setTxtMaND(mnd);
        ql.setTxtTenND(tnd);
        ql.setTxtPass(pw);
        ql.setTxtXNpass(xn);

        ql.doClick();
        assertTrue(ql.test);

    }
    
    @Test
    public void Delete() {
        ql.doClickDelete();
        assertTrue(ql.test);
    }

}
