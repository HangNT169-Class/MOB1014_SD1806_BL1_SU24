/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_ReNhanh.P1_OnTap;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Bai1 {

    /**
     * 1. Nhap ma, ten, loai, khuVucSong cua con cho nha xom va in ra man hinh
     * 2. Nhap diemToan, Ly, Van, Su, Dia cua ban than va in diem trung binh ra man hinh
     * 3. Nhap ten, tuoi, diaChi, KyHoc, NganhHoc cua ban than va in ra man hinh
     * 4. Nhap chieu dai, chieu rong cua hcn. Tinh CV, DT
     * 5. Nhap 2 so nguyen tu ban phim va tinh tong, hieu, tich, thuong
     */
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap ma: ");
        String ma = nhap.nextLine();

        System.out.println("nhap ten: ");
        String ten = nhap.nextLine();

        System.out.println("nhap loai: ");
        String loai = nhap.nextLine();

        System.out.println("nhap khu vu song:");
        String khu = nhap.nextLine();

        System.out.println("ma" + ma);
        System.out.println("ten" + ten);

    }
}
