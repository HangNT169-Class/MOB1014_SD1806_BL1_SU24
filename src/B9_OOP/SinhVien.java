/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B9_OOP;

/**
 *
 * @author hangnt
 */
public class SinhVien {
    /* Tao class SinhVien gom cac thuoc tinh : 
     * ma - String, ten - String , tuoi
     * - int, diaChi - String, kyHoc - int,
     * matKhauFacebook - String,
     * soDuTaiKhoanNganHang - int 
     * va cac contructor, getter, setter va ham
     * inThongTin(): void 
     */
    /**
     * OOP - Lap trinh huong doi tuong:
     *  - Tinh dong goi 
     *  - Tinh ke thua 
     *  - Tinh da hinh 
     *  - Tinh truu tuong 
     * Doi tuong (Object):
     *      - Thuoc tinh (cac bien) - atrribute
     *      - Phuong thuc (cac ham) - method
     * Tinh dong goi : Che giau moi thu k can thiet
     * Pham vi truy cap(Acess modifier).
     * Co 4 pvtc: public, protected, default, private 
     * Rieng default la k can ghi o phia dang truoc 
     */
    private String ma; //default: null
    private String ten;
    private int tuoi; // 0 
    private String diaChi;
    private int kyHoc;
    private String matKhauFacebook;
    private int soDuTaiKhoanNganHang;

    // contructor : dung de khoi tao doi tuong
    // Dung tu khoa new 
    // Co 2 loai contructor:
    //  1. contructor khong tham so 
    //  2. contructor co tham so 
    // DHNB: Ten bien trung vs ten class
    // chuot phai -> insert code -> tao contructor 
    // phai tao 2 contructor 
//    public SinhVien() {
//    }
//
////    public void gsfda(){
////        
////    }
//    public SinhVien(String ma, String ten, int tuoi, String diaChi, int kyHoc, String matKhauFacebook, int soDuTaiKhoanNganHang) {
//        this.ma = ma;
//        this.ten = ten;
//        this.tuoi = tuoi;
//        this.diaChi = diaChi;
//        this.kyHoc = kyHoc;
//        this.matKhauFacebook = matKhauFacebook;
//        this.soDuTaiKhoanNganHang = soDuTaiKhoanNganHang;
//    }
//
//    public SinhVien(String ma, String ten) {
//        this.ma = ma;
//        this.ten = ten;
//    }

    // C2: ctrl space 2 lan
    public SinhVien() {
    }

    public SinhVien(String ma, String ten, int tuoi, String diaChi, int kyHoc, String matKhauFacebook, int soDuTaiKhoanNganHang) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.kyHoc = kyHoc;
        this.matKhauFacebook = matKhauFacebook;
        this.soDuTaiKhoanNganHang = soDuTaiKhoanNganHang;
    }

    // Getter : Lay thong tin cua 1 doi tuong 
    // Get Ma -> Lay thong tin ma cua doi tuong sinh vien 
    public String getMa() {
        return ma;
    }

    // Setter : Thay doi thong tin cua 1 doi tuong 
    // Set Ma -> Thay doi thong tin ma cua doi tuong sv 
    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(int kyHoc) {
        this.kyHoc = kyHoc;
    }

    public String getMatKhauFacebook() {
        return matKhauFacebook;
    }

    public void setMatKhauFacebook(String matKhauFacebook) {
        this.matKhauFacebook = matKhauFacebook;
    }

    public int getSoDuTaiKhoanNganHang() {
        return soDuTaiKhoanNganHang;
    }

    public void setSoDuTaiKhoanNganHang(int soDuTaiKhoanNganHang) {
        this.soDuTaiKhoanNganHang = soDuTaiKhoanNganHang;
    }
    
    public void inThongTin(){
        // In toan bo thong tin cua doi tuong 
        System.out.println("Ma "+ ma);
        System.out.println("Tuoi "+ tuoi);
        // tu lam not 
    
    }
    
}
