/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B9_OOP;

/**
 *
 * @author hangnt
 */
public class Main {
     /**
     * Tao class SinhVien gom cac thuoc tinh : 
     * ma - String, ten - String , tuoi
     * - int, diaChi - String, kyHoc - int,
     * matKhauFacebook - String,
     * soDuTaiKhoanNganHang - int 
     * va cac contructor, getter, setter va ham
     * inThongTin(): void 
     * Tao class Main hien thi 
     * thong tin 1 sinh vien gia tri fix cung
     */
    public static void main(String[] args) {
//        SinhVien sv = new SinhVien();
//        sv.getMa();
//        sv.setMatKhauFacebook("vggh");
        // C1: Su dung contructor khong tham so
        // B1: Khoi tao 1 doi tuong SV 
//        SinhVien sv = new SinhVien();
//        // B2: Thay doi gia tri 
////        String diaChi = "dsagfd";
//        sv.setDiaChi("dsagfd");
//        sv.setTen("sdfg");
//        sv.setTuoi(5);
//        sv.setMa("afs");
//        // tu set not cac thuoc tinh
//        // In SV 
//        sv.inThongTin();
        // C2: Su dung contructor full tham so 
        SinhVien sv1 = new SinhVien("fasd", "gsag", 4, "fas", 30, "fa", 0);
        sv1.inThongTin();
    }
}
