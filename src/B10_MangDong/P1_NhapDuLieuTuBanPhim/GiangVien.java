/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_MangDong.P1_NhapDuLieuTuBanPhim;

/**
 *
 * @author hangnt
 */
public class GiangVien {

    private String ten;
    private String ma;
    private String diaChi;
    private float canNang;
    private double chieuCao;

    public GiangVien(String ten, String ma, String diaChi, float canNang, double chieuCao) {
        this.ten = ten;
        this.ma = ma;
        this.diaChi = diaChi;
        this.canNang = canNang;
        this.chieuCao = chieuCao;
    }

    public GiangVien() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public float getCanNang() {
        return canNang;
    }

    public void setCanNang(float canNang) {
        this.canNang = canNang;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public void inThongTin() {
        System.out.println("Ten" + ten + "Ma" + ma + "Dia chi" + 
                diaChi + " can Nang " + canNang + " chieu cao" + chieuCao);
    }
    
}
