package proj.entity;
// Generated Oct 15, 2013 9:41:34 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * LopMonHoc generated by hbm2java
 */
public class LopMonHoc  implements java.io.Serializable {


     private int idLopMonHoc;
     private CanBo canBo;
     private MonHoc monHoc;
     private NienKhoaHocKy nienKhoaHocKy;
     private String ma;
     private Integer trangThai;
     private Integer soSvMax;
     private Integer idLopDuKien;
     private Set<KetQuaHoc> ketQuaHocs = new HashSet<KetQuaHoc>(0);
     private Set<SinhVienDangKyHoc> sinhVienDangKyHocs = new HashSet<SinhVienDangKyHoc>(0);

    public LopMonHoc() {
    }

	
    public LopMonHoc(int idLopMonHoc) {
        this.idLopMonHoc = idLopMonHoc;
    }
    public LopMonHoc(int idLopMonHoc, CanBo canBo, MonHoc monHoc, NienKhoaHocKy nienKhoaHocKy, String ma, Integer trangThai, Integer soSvMax, Integer idLopDuKien, Set<KetQuaHoc> ketQuaHocs, Set<SinhVienDangKyHoc> sinhVienDangKyHocs) {
       this.idLopMonHoc = idLopMonHoc;
       this.canBo = canBo;
       this.monHoc = monHoc;
       this.nienKhoaHocKy = nienKhoaHocKy;
       this.ma = ma;
       this.trangThai = trangThai;
       this.soSvMax = soSvMax;
       this.idLopDuKien = idLopDuKien;
       this.ketQuaHocs = ketQuaHocs;
       this.sinhVienDangKyHocs = sinhVienDangKyHocs;
    }
   
    public int getIdLopMonHoc() {
        return this.idLopMonHoc;
    }
    
    public void setIdLopMonHoc(int idLopMonHoc) {
        this.idLopMonHoc = idLopMonHoc;
    }
    public CanBo getCanBo() {
        return this.canBo;
    }
    
    public void setCanBo(CanBo canBo) {
        this.canBo = canBo;
    }
    public MonHoc getMonHoc() {
        return this.monHoc;
    }
    
    public void setMonHoc(MonHoc monHoc) {
        this.monHoc = monHoc;
    }
    public NienKhoaHocKy getNienKhoaHocKy() {
        return this.nienKhoaHocKy;
    }
    
    public void setNienKhoaHocKy(NienKhoaHocKy nienKhoaHocKy) {
        this.nienKhoaHocKy = nienKhoaHocKy;
    }
    public String getMa() {
        return this.ma;
    }
    
    public void setMa(String ma) {
        this.ma = ma;
    }
    public Integer getTrangThai() {
        return this.trangThai;
    }
    
    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }
    public Integer getSoSvMax() {
        return this.soSvMax;
    }
    
    public void setSoSvMax(Integer soSvMax) {
        this.soSvMax = soSvMax;
    }
    public Integer getIdLopDuKien() {
        return this.idLopDuKien;
    }
    
    public void setIdLopDuKien(Integer idLopDuKien) {
        this.idLopDuKien = idLopDuKien;
    }
    public Set<KetQuaHoc> getKetQuaHocs() {
        return this.ketQuaHocs;
    }
    
    public void setKetQuaHocs(Set<KetQuaHoc> ketQuaHocs) {
        this.ketQuaHocs = ketQuaHocs;
    }
    public Set<SinhVienDangKyHoc> getSinhVienDangKyHocs() {
        return this.sinhVienDangKyHocs;
    }
    
    public void setSinhVienDangKyHocs(Set<SinhVienDangKyHoc> sinhVienDangKyHocs) {
        this.sinhVienDangKyHocs = sinhVienDangKyHocs;
    }




}

