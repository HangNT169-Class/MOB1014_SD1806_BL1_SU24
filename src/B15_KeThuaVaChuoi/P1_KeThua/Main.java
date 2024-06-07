/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B15_KeThuaVaChuoi.P1_KeThua;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        // Nhap tt cua 1 SV -> in ra man hinh 
        Scanner a = new Scanner(System.in);
        System.out.println("Moi ban nhap ten:");
        String ten = a.nextLine();
        System.out.println("Moi nhap tuoi: ");
        int tuoi = Integer.valueOf(a.nextLine());
        System.out.println("Moi ban nhap sdt:");
        String sdt = a.nextLine();
        System.out.println("Moi ban nhap gioi tinh: ");
        int gioiTinh = Integer.valueOf(a.nextLine());
        System.out.println("Moi nhap email:");
        String email = a.nextLine();
        System.out.println("Moi ban nhap que quan: ");
        String queQuan = a.nextLine();
        System.out.println("Moi nhap diem");
        double diem = Double.valueOf(a.nextLine());

        SinhVien sv = new SinhVien(diem, ten, tuoi,
                gioiTinh, queQuan, sdt, email);
        sv.display();
    }
}
