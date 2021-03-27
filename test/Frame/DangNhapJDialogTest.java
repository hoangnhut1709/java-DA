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
public class DangNhapJDialogTest {
    DangNhapJDialog login;
    public DangNhapJDialogTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        login = new DangNhapJDialog(null, false);
    }
    
    @After
    public void tearDown() {
    }
    //Kiểm tra tên đăng nhập không hợp lệ
    @Test
    public void Login_TC1(){
        String txtTen = "A";
        String txtMatKhau = "123";
        login.setTxtTen(txtTen); 
        login.setTxtMatKhau(txtMatKhau);      
        login.doClickLogin();
        assertFalse(login.test);
    }
    //Kiểm tra mật khẩu không hợp lệ
    @Test
    public void Login_TC2(){
        String txtTen = "ND1";
        String txtMatKhau = "456";
        login.setTxtTen(txtTen); 
        login.setTxtMatKhau(txtMatKhau);      
        login.doClickLogin();
        assertFalse(login.test);
    }
    //Tên đăng nhập không được để trống
    @Test
    public void Login_TC3(){
        String txtTen = "";
        String txtMatKhau = "456";
        login.setTxtTen(txtTen); 
        login.setTxtMatKhau(txtMatKhau);      
        login.doClickLogin();
        assertFalse(login.test);
    }
    //Mật khẩu không được để trống
    @Test
    public void Login_TC4(){
        String txtTen = "ND1";
        String txtMatKhau = "";
        login.setTxtTen(txtTen); 
        login.setTxtMatKhau(txtMatKhau);      
        login.doClickLogin();
        assertFalse(login.test);
    }
    //Đăng nhập thành công
   @Test
    public void Login_TC5(){
        String txtTen = "ND1";
        String txtMatKhau = "123";
        login.setTxtTen(txtTen); 
        login.setTxtMatKhau(txtMatKhau);      
        login.doClickLogin();
        assertTrue(login.test);
    }
    //Nhấn nút thoát
    @Test
    public void Exit(){
        login.doClickExit();
    }
}
