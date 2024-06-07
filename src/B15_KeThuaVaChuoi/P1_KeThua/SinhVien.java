/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B15_KeThuaVaChuoi.P1_KeThua;

/**
 *
 * @author hangnt
 */
// class SinhVien ke thua tu class Nguoi 
// cha => Nguoi 
// con => SV
// SV ke thua tu Nguoi
public class SinhVien extends Nguoi {

    private double diem; // thuoc tinh rieng cua SinhVien 

    // SV co bn thuoc tinh: 7 
    public SinhVien() {
    }

    public SinhVien(double diem, String ten,
            int tuoi, int gioiTinh, String queQuan,
            String sdt, String email) {
        super(ten, tuoi, gioiTinh, queQuan, sdt, email);
        this.diem = diem;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public void display() {
        // in 7 thuoc tinh 
        System.out.println("Diem " + this.diem); // tt rieng 
        // this => Lay cac ten/ham cua chinh class day 
        // super => lay cac ham/bien cua class Cha 
//        System.out.println("Ten: " + super.getTen());
//        System.out.println("Tuoi" + super.getTuoi());
//        System.out.println("Gioi tinh" + super.getGioiTinh());
//        System.out.println("Que quan" + super.getQueQuan());
//        System.out.println("Sdt" + super.getSdt());
//        System.out.println("Gmail" + super.getEmail());
        super.display();
    }

}
