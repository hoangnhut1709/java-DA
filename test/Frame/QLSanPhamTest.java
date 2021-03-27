/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;


import Frame.QLSanPham;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class QLSanPhamTest {
    QLSanPham sp;
    public QLSanPhamTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        QLSanPham sp = new QLSanPham();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        sp = new QLSanPham();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBtnClear method, of class QLSanPham.
     */
    @Test
    public void Insert() throws InterruptedException {
        sp.setTxtMSP("SPv");
        sp.setTxtTSP("TraDa");
        sp.setTxtNSX("23/06/2020");
        sp.setTxtHSD("23/06/2021");  
        sp.doClick();
//        assertTrue(sp.test);
    }

    @Test
    public void Update() throws InterruptedException {
        sp.setVisible(true);
          sp.setTxtMSP("SPv");
        sp.setTxtTSP("TraDuong");
        sp.setTxtNSX("23/06/2020");
        sp.setTxtHSD("23/06/2021");
        sp.dolickUpdate();
//        assertTrue(ln.test);
//
    }

    @Test
    public void Delete() {
        sp.dolickDe();
//        assertTrue(ln.test);
    }

    @Test
    public void Clear() throws InterruptedException {
        sp.dolickcClear();
    }}