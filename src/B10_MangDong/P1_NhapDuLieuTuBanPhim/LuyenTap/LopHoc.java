/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_MangDong.P1_NhapDuLieuTuBanPhim.LuyenTap;

/**
 *
 * @author hangnt
 */
public class LopHoc {

    private String ten;
    private String toa;
    private String diaChi;
    private int dienTich;

    public LopHoc() {
    }

    public LopHoc(String ten, String toa, String diaChi, int dienTich) {
        this.ten = ten;
        this.toa = toa;
        this.diaChi = diaChi;
        this.dienTich = dienTich;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getToa() {
        return toa;
    }

    public void setToa(String toa) {
        this.toa = toa;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public void inThongTin() {
        System.out.println("ten: " + ten);
        System.out.println("toa: " + toa);
        System.out.println("dia chi: " + diaChi);
        System.out.println("dien tich: " + dienTich);
    }
}
