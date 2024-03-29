package proj.entity;
// Generated Oct 15, 2013 9:41:34 PM by Hibernate Tools 3.2.1.GA



/**
 * MienHocId generated by hbm2java
 */
public class MienHocId  implements java.io.Serializable {


     private int idSinhVien;
     private int idMonHoc;
     private int idLyDoMien;

    public MienHocId() {
    }

    public MienHocId(int idSinhVien, int idMonHoc, int idLyDoMien) {
       this.idSinhVien = idSinhVien;
       this.idMonHoc = idMonHoc;
       this.idLyDoMien = idLyDoMien;
    }
   
    public int getIdSinhVien() {
        return this.idSinhVien;
    }
    
    public void setIdSinhVien(int idSinhVien) {
        this.idSinhVien = idSinhVien;
    }
    public int getIdMonHoc() {
        return this.idMonHoc;
    }
    
    public void setIdMonHoc(int idMonHoc) {
        this.idMonHoc = idMonHoc;
    }
    public int getIdLyDoMien() {
        return this.idLyDoMien;
    }
    
    public void setIdLyDoMien(int idLyDoMien) {
        this.idLyDoMien = idLyDoMien;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MienHocId) ) return false;
		 MienHocId castOther = ( MienHocId ) other; 
         
		 return (this.getIdSinhVien()==castOther.getIdSinhVien())
 && (this.getIdMonHoc()==castOther.getIdMonHoc())
 && (this.getIdLyDoMien()==castOther.getIdLyDoMien());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdSinhVien();
         result = 37 * result + this.getIdMonHoc();
         result = 37 * result + this.getIdLyDoMien();
         return result;
   }   


}


