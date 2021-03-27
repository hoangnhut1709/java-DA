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
public class LoaiNhaCC {
    private String MaLoaiCC;
    private String QuocGiaCC;

    public LoaiNhaCC(String MaLoaiCC, String QuocGiaCC) {
        this.MaLoaiCC = MaLoaiCC;
        this.QuocGiaCC = QuocGiaCC;
    }

    public LoaiNhaCC() {
    }

    public LoaiNhaCC(String MaLoaiCC, String mlcC002, String QuocGiaCC, String vietNam) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return this.QuocGiaCC;
    }

    public String getMaLoaiCC() {
        return MaLoaiCC;
    }

    public void setMaLoaiCC(String MaLoaiCC) {
        this.MaLoaiCC = MaLoaiCC;
    }

    public String getQuocGiaCC() {
        return QuocGiaCC;
    }

    public void setQuocGiaCC(String QuocGiaCC) {
        this.QuocGiaCC = QuocGiaCC;
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
        final LoaiNhaCC other = (LoaiNhaCC) obj;
        if (!Objects.equals(this.MaLoaiCC, other.MaLoaiCC)) {
            return false;
        }
        return true;
    }

 
    
}
