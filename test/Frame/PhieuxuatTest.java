/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import model.PhieuXuat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class PhieuxuatTest {
    
    public PhieuxuatTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of load method, of class Phieuxuat.
     */
    
    @Test
    public void testInsert() throws InterruptedException{
        QLPhieuxuat px = new QLPhieuxuat();
        px.setVisible(true);
        Thread.sleep(2000);
        px.setTxtMaXuat("P0P");
        Thread.sleep(2000);
        px.setTxtGia(12.2);
        Thread.sleep(2000);
        px.setTxtSoLuong(2);
        Thread.sleep(2000);
        px.setTxtDiaChiXuat("cantho");
       px.Clickthem();
       assertTrue(px.test);
//       Thread.sleep(2000);
//        System.out.println("insert thanh cong");
    }
    
    @Test
    public void testClear() throws InterruptedException{
        QLPhieuxuat px = new QLPhieuxuat();
        px.setVisible(true);
        Thread.sleep(2000);
       px.Clickmoi();
       Thread.sleep(2000);
//        System.out.println("clear thanh cong");
    }
    
    @Test
    public void testXoa() throws InterruptedException{
        QLPhieuxuat px = new QLPhieuxuat();
        px.setVisible(true);
        Thread.sleep(4000);
        px.Clickxoa();
        assertTrue(px.test);
//        System.out.println("delete thanh cong");
    }
    
    @Test
    public void btnFist() throws InterruptedException{
        QLPhieuxuat px = new QLPhieuxuat();
        px.setVisible(true);
        Thread.sleep(7000);
        px.Click1();
      Thread.sleep(7000);
      
//        System.out.println("btnFist thanh cong");
    }

    
    @Test
    public void btnNext() throws InterruptedException{
        QLPhieuxuat px = new QLPhieuxuat();
        px.setVisible(true);
        Thread.sleep(7000);
        px.Click3();
      Thread.sleep(7000);
      
//       System.out.println("btnNext thanh cong");
    }
    @Test
    public void btnLast() throws InterruptedException{
        QLPhieuxuat px = new QLPhieuxuat();
        px.setVisible(true);
        Thread.sleep(7000);
        px.Click4();
      Thread.sleep(7000);
//       System.out.println("btnLast thanh cong");
    }
    
     @Test
    public void btnPrev() throws InterruptedException{
        QLPhieuxuat px = new QLPhieuxuat();
        px.setVisible(true);
        Thread.sleep(7000);
        px.Click2();
//       System.out.println("btnPrev da xong");
    }
    

}
