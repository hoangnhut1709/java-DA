/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Helper.DateHelper;
import java.util.Date;

/**
 *
 * @author Asus
 */
public class PhieuNhap {
    private String MaNhap, MaSP, MaKho, MaND;
    private int SoLuong;
    private double Gia;
    private Date NgayNhap = DateHelper.now();
    private boolean vaiTro = false;

    public PhieuNhap(String MaNhap, String MaSP, String MaKho, String MaND,Date NgayNhap, int SoLuong, double Gia) {
        this.MaNhap = MaNhap;
        this.MaSP = MaSP;
        this.MaKho = MaKho;
        this.MaND = MaND;
        this.NgayNhap = NgayNhap;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
    }
    public PhieuNhap() {
    }
    public String getMaNhap() {
        return MaNhap;
    }

    public void setMaNhap(String MaNhap) {
        this.MaNhap = MaNhap;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getMaKho() {
        return MaKho;
    }

    public void setMaKho(String MaKho) {
        this.MaKho = MaKho;
    }

    public String getMaND() {
        return MaND;
    }

    public void setMaND(String MaND) {
        this.MaND = MaND;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public Date getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(Date NgayNhap) {
        this.NgayNhap = NgayNhap;
    }
    
    @Override
    public String toString(){
        return this.MaSP+"("+this.NgayNhap+")";
    }

    
    
}
