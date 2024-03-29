package proj.entity;
// Generated Oct 15, 2013 9:41:34 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * MonHoc generated by hbm2java
 */
public class MonHoc  implements java.io.Serializable {


     private int idMonHoc;
     private String ma;
     private String ten;
     private Integer soTc;
     private String soTietLt;
     private Integer soTietTh;
     private Integer idDonViQl;
     private Set<MienHoc> mienHocs = new HashSet<MienHoc>(0);
     private Set<LopMonHoc> lopMonHocs = new HashSet<LopMonHoc>(0);
     private Set<KetQuaHoc> ketQuaHocs = new HashSet<KetQuaHoc>(0);

    public MonHoc() {
    }

	
    public MonHoc(int idMonHoc) {
        this.idMonHoc = idMonHoc;
    }
    public MonHoc(int idMonHoc, String ma, String ten, Integer soTc, String soTietLt, Integer soTietTh, Integer idDonViQl, Set<MienHoc> mienHocs, Set<LopMonHoc> lopMonHocs, Set<KetQuaHoc> ketQuaHocs) {
       this.idMonHoc = idMonHoc;
       this.ma = ma;
       this.ten = ten;
       this.soTc = soTc;
       this.soTietLt = soTietLt;
       this.soTietTh = soTietTh;
       this.idDonViQl = idDonViQl;
       this.mienHocs = mienHocs;
       this.lopMonHocs = lopMonHocs;
       this.ketQuaHocs = ketQuaHocs;
    }
   
    public int getIdMonHoc() {
        return this.idMonHoc;
    }
    
    public void setIdMonHoc(int idMonHoc) {
        this.idMonHoc = idMonHoc;
    }
    public String getMa() {
        return this.ma;
    }
    
    public void setMa(String ma) {
        this.ma = ma;
    }
    public String getTen() {
        return this.ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    public Integer getSoTc() {
        return this.soTc;
    }
    
    public void setSoTc(Integer soTc) {
        this.soTc = soTc;
    }
    public String getSoTietLt() {
        return this.soTietLt;
    }
    
    public void setSoTietLt(String soTietLt) {
        this.soTietLt = soTietLt;
    }
    public Integer getSoTietTh() {
        return this.soTietTh;
    }
    
    public void setSoTietTh(Integer soTietTh) {
        this.soTietTh = soTietTh;
    }
    public Integer getIdDonViQl() {
        return this.idDonViQl;
    }
    
    public void setIdDonViQl(Integer idDonViQl) {
        this.idDonViQl = idDonViQl;
    }
    public Set<MienHoc> getMienHocs() {
        return this.mienHocs;
    }
    
    public void setMienHocs(Set<MienHoc> mienHocs) {
        this.mienHocs = mienHocs;
    }
    public Set<LopMonHoc> getLopMonHocs() {
        return this.lopMonHocs;
    }
    
    public void setLopMonHocs(Set<LopMonHoc> lopMonHocs) {
        this.lopMonHocs = lopMonHocs;
    }
    public Set<KetQuaHoc> getKetQuaHocs() {
        return this.ketQuaHocs;
    }
    
    public void setKetQuaHocs(Set<KetQuaHoc> ketQuaHocs) {
        this.ketQuaHocs = ketQuaHocs;
    }




}


