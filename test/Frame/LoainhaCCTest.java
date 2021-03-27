/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import model.LoaiNhaCC;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vủ Bằng
 */
public class LoainhaCCTest {

    LoainhaCC ln;

    public LoainhaCCTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ln = new LoainhaCC();
    }

    @After
    public void tearDown() {
    }
//test kiểm tra insert hợp lệ

    @Test
    public void Insert() throws InterruptedException {
        ln.setVisible(true);
        ln.setTxtMaLoaiNhaCC("A00021");
        ln.setTxtQuocGia("Thai Lan");
        ln.doClickInsert();
        assertTrue(ln.test);
    }
//test kiểm tra insert không hợp lệ
    //Mã loại để trống

    @Test
    public void Insert_TC1() {
        ln.setTxtMaLoaiNhaCC("   ");
        ln.setTxtQuocGia("Viet Nam");
        assertFalse(ln.test);
    }

//    //Mã loại<3 kí tự
    @Test
    public void Insert_TC2() {
        ln.setTxtMaLoaiNhaCC("ML1");
        ln.setTxtQuocGia("Viet Nam");
        assertFalse(ln.test);
    }

    //Trùng mã
    @Test
    public void Insert_TC3() {
        ln.setTxtMaLoaiNhaCC("MLCC01");
        ln.setTxtQuocGia("Viet Nam");
        assertFalse(ln.test);
    }

    //Để trống tên quốc gia
    @Test
    public void Insert_TC4() {
        ln.setTxtMaLoaiNhaCC("MLCC050");
        ln.setTxtQuocGia("");
        assertFalse(ln.test);
    }

    //Tên quốc gia sai định dạng
    @Test
    public void Insert_TC5() {
        ln.setTxtMaLoaiNhaCC("");
        ln.setTxtQuocGia("Việt Nam 01");
        assertFalse(ln.test);
    }

//test kiểm tra update hợp lệ
    @Test
    public void Update() throws InterruptedException {
        ln.setVisible(true);
        ln.setTxtMaLoaiNhaCC("MLN015");
        ln.setTxtQuocGia("Au My");
        ln.doClickUpdate();
        assertTrue(ln.test);

    }
//test kiểm tra update không hợp lệ
    //Trống tên quốc gia

    @Test
    public void Update_TC1() {
        ln.setTxtMaLoaiNhaCC("MLCC02");
        ln.setTxtQuocGia("");
        assertFalse(ln.test);
    }
//    //Tên quốc gia sai định dạng

    @Test
    public void Update_TC2() {
        ln.setTxtMaLoaiNhaCC("MLCC02");
        ln.setTxtQuocGia("Việt Nam 01");
        assertFalse(ln.test);
    }

    @Test
    public void Delete() {
        ln.doClickDelete();
        assertTrue(ln.test);
    }

    @Test
    public void Clear() throws InterruptedException {
        ln.doClickClear();
    }

    @Test
    public void First() {
        ln.doClickFirst();
    }

    @Test
    public void Pre() {
        ln.doClickPre();
    }

    @Test
    public void Next() {
        ln.doClickNext();
    }

    @Test
    public void Last() {
        ln.doClickLast();
    }

}
