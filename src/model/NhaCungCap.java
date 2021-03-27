/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author Asus
 */
public class NhaCungCap {
    private String MaNhaCC;
    private String MaLoaiCC;
    private String TenNhaCC;
    private String DiaChiCC;
 
    public NhaCungCap(){
        
    }
    public NhaCungCap(String MaNhaCC, String MaLoaiCC, String TenNhaCC, String DiaChiCC) {
        this.MaNhaCC = MaNhaCC;
        this.MaLoaiCC = MaLoaiCC;
        this.TenNhaCC = TenNhaCC;
        this.DiaChiCC = DiaChiCC;
    }
    
    @Override
    public String toString(){
        return TenNhaCC;
    }

    public String getMaNhaCC() {
        return MaNhaCC;
    }

    public void setMaNhaCC(String MaNhaCC) {
        this.MaNhaCC = MaNhaCC;
    }

    public String getMaLoaiCC() {
        return MaLoaiCC;
    }

    public void setMaLoaiCC(String MaLoaiCC) {
        this.MaLoaiCC = MaLoaiCC;
    }

    public String getTenNhaCC() {
        return TenNhaCC;
    }

    public void setTenNhaCC(String TenNhaCC) {
        this.TenNhaCC = TenNhaCC;
    }

    public String getDiaChiCC() {
        return DiaChiCC;
    }

    public void setDiaChiCC(String DiaChiCC) {
        this.DiaChiCC = DiaChiCC;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NhaCungCap other = (NhaCungCap) obj;
        if (!Objects.equals(this.MaNhaCC, other.MaNhaCC)) {
            return false;
        }
        return true;
    }
    
    
}
