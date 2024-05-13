/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_ReNhanh.P2_ReNhanh;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class P2_LuyenTap {

    /**
     * Tao 1 menu gom cac chuc nang sau : 1. Nhap diem toan, ly, hoa va tinh
     * diem trung binh. 3. Nhap ten, tuoi, diaChi, ky hoc, hoc luc cua ban than
     * va in ra man hinh 4. Nhap ban kinh va tinh P,S hinh tron 2. Thoat
     */
    public static void main(String[] args) {
        System.out.println("moi nhap chuc nang");
        Scanner nhap = new Scanner(System.in);
        int menu = Integer.valueOf(nhap.nextLine());
        switch (menu) {
            case 1:
                System.out.println("nhap diem toan:");
                int toan = Integer.valueOf(nhap.nextLine());
                System.out.println("nhap diem ly:");
                int ly = Integer.valueOf(nhap.nextLine());
                System.out.println("nhap diem hoa:");
                int hoa=Integer.valueOf(nhap.nextLine());
                break;
            default:
                throw new AssertionError();
        }

    }

}
