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
public class Bai4 {
    // Nhap mssv, ten, tuoi, nganhHoc, chieuCao, diaChi, kyHoc, que quan, 
    // diem toan, toaHoc, diem ly, diemHoa cua ban than va in ra man hinh

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Moi nhap ma so sinh vien : ");
        String mssv = nhap.nextLine();
        System.out.println("Moi nhap ten : ");
        String ten = nhap.nextLine();
        System.out.println("Moi nhap tuoi : ");
        int tuoi = Integer.valueOf(nhap.nextLine());
        System.out.println("Moi nhap nganh hoc : ");
        String nganh = nhap.nextLine();
        System.out.println("Moi nhap chieu cao : ");
        float chieuCao = Float.valueOf(nhap.nextLine());
        System.out.println("Moi nhap dia chi : ");
        String diaChi = nhap.nextLine();
        System.out.println("Moi nhap ky hoc : ");
        int ky = Integer.valueOf(nhap.nextLine());
        System.out.println("Moi nhap que quan : ");
        String que = nhap.nextLine();
        System.out.println("Moi nhap diem toan : ");
        int toan = Integer.valueOf(nhap.nextLine());
        System.out.println("Moi nhap toa hoc : ");
        String toa = nhap.nextLine();
        System.out.println("Moi nhap diem ly");
        int ly = Integer.valueOf(nhap.nextLine());
        System.out.println("Moi nhap diem hoa : ");
        double hoa = Double.valueOf(nhap.nextLine());
        System.out.println("MSSV : " + mssv);
        System.out.println("Ten : " + ten);
        System.out.println("Tuoi : " + tuoi);
    }
}
