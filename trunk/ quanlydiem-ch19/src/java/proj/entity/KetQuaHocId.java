package proj.entity;
// Generated Oct 15, 2013 9:41:34 PM by Hibernate Tools 3.2.1.GA



/**
 * KetQuaHocId generated by hbm2java
 */
public class KetQuaHocId  implements java.io.Serializable {


     private int idMonHoc;
     private int idSinhVien;
     private int idLopMonHoc;

    public KetQuaHocId() {
    }

    public KetQuaHocId(int idMonHoc, int idSinhVien, int idLopMonHoc) {
       this.idMonHoc = idMonHoc;
       this.idSinhVien = idSinhVien;
       this.idLopMonHoc = idLopMonHoc;
    }
   
    public int getIdMonHoc() {
        return this.idMonHoc;
    }
    
    public void setIdMonHoc(int idMonHoc) {
        this.idMonHoc = idMonHoc;
    }
    public int getIdSinhVien() {
        return this.idSinhVien;
    }
    
    public void setIdSinhVien(int idSinhVien) {
        this.idSinhVien = idSinhVien;
    }
    public int getIdLopMonHoc() {
        return this.idLopMonHoc;
    }
    
    public void setIdLopMonHoc(int idLopMonHoc) {
        this.idLopMonHoc = idLopMonHoc;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof KetQuaHocId) ) return false;
		 KetQuaHocId castOther = ( KetQuaHocId ) other; 
         
		 return (this.getIdMonHoc()==castOther.getIdMonHoc())
 && (this.getIdSinhVien()==castOther.getIdSinhVien())
 && (this.getIdLopMonHoc()==castOther.getIdLopMonHoc());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdMonHoc();
         result = 37 * result + this.getIdSinhVien();
         result = 37 * result + this.getIdLopMonHoc();
         return result;
   }   


}


