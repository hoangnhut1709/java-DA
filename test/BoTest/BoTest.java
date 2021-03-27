/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoTest;

import dao.LoaiNhaCCDAONGTest;
import dao.NguoiDungDAONGTest;
import dao.NhaCungCapDAONGTest;
import dao.PhieuNhapDAONGTest;
import dao.PhieuXuatDAONGTest;
import dao.SanPhamDAONGTest;
import dao.ThongTinKhoDAONGTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Hai Au
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({LoaiNhaCCDAONGTest.class,NguoiDungDAONGTest.class,NhaCungCapDAONGTest.class,
                     PhieuNhapDAONGTest.class, PhieuXuatDAONGTest.class, SanPhamDAONGTest.class,
                     ThongTinKhoDAONGTest.class })
public class BoTest {
    
}
