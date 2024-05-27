/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_MangDong.P1_NhapDuLieuTuBanPhim.LuyenTap;

/**
 *
 * @author hangnt
 */
public class Thucvat {

    private String matv;
    private String ten;
    private String khuVucSong;
    private int tuoi;

    public Thucvat() {
    }

    public Thucvat(String matv, String ten, String khuVucSong, int tuoi) {
        this.matv = matv;
        this.ten = ten;
        this.khuVucSong = khuVucSong;
        this.tuoi = tuoi;
    }

    public String getMatv() {
        return matv;
    }

    public void setMatv(String matv) {
        this.matv = matv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getKhuVucSong() {
        return khuVucSong;
    }

    public void setKhuVucSong(String khuVucSong) {
        this.khuVucSong = khuVucSong;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
//
//    @Override
//    public String toString() {
//        return "Thucvat{" + "matv=" + matv + ", ten=" + ten + ", khuVucSong=" + khuVucSong + ", tuoi=" + tuoi + '}';
//    }

    public void display() {
//        System.out.println(toString());
        System.out.println("Ma" + matv);
        System.out.println("Ten" + ten);
        System.out.println("Tuoi" + tuoi);
        System.out.println("Khu vuc Song" + khuVucSong);
        System.out.println("Tuoi" + tuoi);
    }
    
}
