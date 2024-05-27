/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_MangDong.P1_NhapDuLieuTuBanPhim;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {
//    Lớp GiangVien gồm các thuộc tính: ma (kiểu String), ten (kiểu String), 
    // diaChi (kiểu String), canNang (kiểu float), chieuCao (kiểu double), 
    // bac (kiểu int), và các phương thức constructor, getter, setter 
    // và phương thức inThongTin() để in thông tin của giảng viên.
//    Tạo class Main. Nhập thông tin của 1 đối tượng GiangVien 
    // từ bàn phím và in ra màn hình
    public static void main(String[] args) {
        // B1: Nhap tt cua doi tuong gv 6 truong -> Scanner 
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap ten: ");
        String ten = sc.nextLine();
        System.out.println("Moi ban nhap ma: ");
        String ma =sc.nextLine();
        System.out.println("Moi ban nhap dia chi: ");
        String diaChi = sc.nextLine();
        System.out.println("Moi ban nhap can nang: ");
        float canNang = Float.valueOf(sc.nextLine());
        System.out.println("Moi ban nhap chieu cao: ");
        double chieuCao = Double.valueOf(sc.nextLine());
        
        // B2: Khoi tao 1 doi tuong 
        GiangVien gv = new GiangVien(ten, ma, diaChi, canNang, chieuCao);
        
        // B3: In tt
        gv.inThongTin();
        // - ThucVat gồm các thuộc tính : maTV- String, ten-String, tuoi-int, 
        // chieuCao-double, khuVucSong- String và 
        // các contrcutor, getter, setter và hàm display(): void  
        // - LopHoc gồm các thuộc tính : ten-String, toa-String, diaChi-String, 
        // dienTich - int và các contrcutor, getter, setter và hàm inThongTin(): void 
        // Tao class Main nhap tt cua 2 doi tuong 
        // Thuc Vat vs Lop Hoc tu ban phim va in ra man hinh.
        // Thuc Vat su dung contructor k tham so.
        // LopHoc su dung conctructor full tham so
    }
}
