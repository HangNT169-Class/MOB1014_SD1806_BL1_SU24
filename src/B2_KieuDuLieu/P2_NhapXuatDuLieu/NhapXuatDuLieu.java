/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_KieuDuLieu.P2_NhapXuatDuLieu;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class NhapXuatDuLieu {

    /**
     * 1. Nhap du lieu tu ban phim C: scanf Java: Scanner
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        // Trong Java chi can duy nhat 1 Scanner de nhap tu ban phim 
        // Nhap 1 so nguyen tu ban phim va in ra man hinh 
        System.out.println("Moi nhap so nguyen:");
        int number = a.nextInt(); // Nhap du lieu tu ban phim
        System.out.println("Moi nhap so thuc");
        float number1 = a.nextFloat();
//        scan.nextDouble();
//        scan.nextLong();
        // In du lieu 
//        System.out.println("So thu 1 la " + number);
//        System.out.println("So thu 2 la " + number1);
        System.out.println("So 1 = " + number + "\nSo 2 = " + number1);
        String name = a.nextLine(); // Nhap chuoi 
        // 1. Nhap diem toan, ly, hoa roi in ra man hinh
        // 2. Nhap ten, dia chi, nganh hoc roi in ra man hinh

    }
}
