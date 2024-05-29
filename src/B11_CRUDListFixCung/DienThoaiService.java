/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B11_CRUDListFixCung;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class DienThoaiService {
    // Service => Xu ly logic cua toan bo project
    // co 8 ham 

    public void themDienThoai(ArrayList<DienThoai> lists) {
        // B1: Nhap tt cua dt tu ban phim 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten dien thoai:");
        String ten = sc.nextLine();
        System.out.println("Nhap ma:");
        int ma = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap hang:");
        String hang = sc.nextLine();
        System.out.println("Bo nho:");
        int boNho = Integer.valueOf(sc.nextLine());
        System.out.println("Gia tien:");
        int gia = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap mau sac:");
        String mau = sc.nextLine();
        // B2: Khoi tao doi tuong 
        DienThoai dt = new DienThoai(ma, ten, hang, mau, boNho, gia);
        // B3: Them phan tu vao list
        lists.add(dt);
    }

    public void inDanhSach(ArrayList<DienThoai> lists) {
        for (DienThoai dt : lists) {
            dt.inThongTin();
        }
    }

    public void xoaDienThoaiTheoViTri(ArrayList<DienThoai> lists, int viTri) {
        lists.remove(viTri);
    }

    // giam dan => doi cho 
    // voi chuoi => compareTo
    public void sapXepTangDanTheoTen(ArrayList<DienThoai> a) {
        a.sort((o1, o2) -> {
            return o2.getTen().compareTo(o1.getTen()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
        });
    }

    // vs so => dung dau - 
    public void sapXepGiamDanTheoGia(ArrayList<DienThoai> a) {
        a.sort((o1, o2) -> {
            return o2.getGia() - o1.getGia();// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
        });
    }
}
