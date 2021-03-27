/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import model.ThongTinKho;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hai Au
 */
public class QLThongTinKhoTest {
    ThongTinKho ttk;
    QLThongTinKho qlk = new QLThongTinKho();
    public QLThongTinKhoTest() {
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
     * Test of load method, of class QLThongTinKho.
     */
   
  
  @Test
  public void Test2btnthem() throws InterruptedException{
      QLThongTinKho qlk = new QLThongTinKho();
          qlk.setVisible(true);
          Thread.sleep(3000);
           qlk.clickMoi();
      String mk = "K07";
      String tk = "Kho V";
      String dc = "Cà Mau";
      qlk.setTxtMaKho(mk);
      Thread.sleep(1000);
      qlk.setTxtTenKho(tk);
      Thread.sleep(1000);
      qlk.setTxtDiaChi(dc);
      Thread.sleep(1000);          
      qlk.clickThem();
      Thread.sleep(3000);  
      assertTrue(qlk.test);
  }
   @Test
    public void Update() throws InterruptedException {
         QLThongTinKho qlk = new QLThongTinKho();
        qlk.setVisible(true);
        String mk = "K07";
        String tk = "Kho CM";
        String dc = "Cà Mau";
        qlk.setTxtMaKho(mk);
        Thread.sleep(1000);
        qlk.setTxtTenKho(tk);
        Thread.sleep(1000);
        qlk.setTxtDiaChi(dc);
        Thread.sleep(1000); 
         qlk.clickSua();
         Thread.sleep(3000);
        assertTrue(qlk.test);

    }

    
    @Test
    public void Delete() throws InterruptedException {
         
         qlk.setVisible(true);
        Thread.sleep(2000);
        qlk.clickXoa();
        assertTrue(qlk.test);
    } 
    @Test
    public void Clear() throws InterruptedException {
        qlk.setVisible(true);
        Thread.sleep(2000);
       qlk.clickMoi();
       Thread.sleep(2000);
    }

    

}
