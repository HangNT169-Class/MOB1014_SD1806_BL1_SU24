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
public class Bai3 {

    public static void main(String[] args) {
        // Nhap mssv, ten, tuoi, nganhHoc, chieuCao, diaChi, kyHoc, que quan, 
        // diem toan, toaHoc, diem ly, diemHoa cua ban than va in ra man hinh
        Scanner a = new Scanner(System.in);
        System.out.println("moi nhap ten: ");
        String name = a.nextLine();
        System.out.println("vui long nhap tuoi: ");
//        int tuoi = a.nextInt();
        // int 
//        String tuoiStr = a.nextLine();
        int tuoi = Integer.valueOf(a.nextLine());
        // C1: them xuong dong 
        // a.nextLine();
        // C2: 
        // B1: COI TAT CA NHUNG GI NHAP TU BAN PHIM LA CHUOI 
        // B2: EP KIEU VE KIEU DU LIEU TUONG UNG 
        System.out.println("vui long nhap dia chi: ");
        String diaChi = a.nextLine();
        System.out.println("vui long nhap ky hoc: ");
//        int kyHoc = a.nextInt();
        float kyHoc = Float.valueOf(a.nextLine());
        System.out.println("vui long nhap nganh hoc: ");
        String nganh = a.nextLine();
        System.out.println("ten ban la: " + name);
        System.out.println("tuoi ban la: " + tuoi);
        System.out.println("ban o: " + diaChi);
        System.out.println("ban hoc nganh: " + nganh);
        System.out.println("ban dang hoc ky: " + kyHoc);
    }
}
