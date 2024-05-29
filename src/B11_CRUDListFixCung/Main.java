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
public class Main {

    // Main -> Goi cac ham phia ben service ra 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DienThoai>listDienThoai = new ArrayList<>();
        DienThoaiService service = new DienThoaiService();
        int menu;
        do {
            System.out.println("Moi nhap chuc nang menu");
            menu = Integer.valueOf(sc.nextLine());
            switch (menu) {
                case 1: {
                    // nhap -> service
                    // Cach goi ham tu 1 class bat ky 
//                    new class ma minh muon goi().ten ham();
                    service.themDienThoai(listDienThoai);
                    break;
                }
                case 2: {
                    service.inDanhSach(listDienThoai);
                    break;
                }
                case 3: {
                    System.out.println("1");
                    break;
                }
                case 4: {
                    System.out.println("1");
                    break;
                }
                case 5: {
                    System.out.println("1");
                    break;
                }
                case 6: {
                    System.out.println("1");
                    break;
                }
                case 7: {
                    System.out.println("Moi nhap vi tri:");
                    int viTri = Integer.valueOf(sc.nextLine());
                    service.xoaDienThoaiTheoViTri(listDienThoai, viTri);
                    System.out.println("Danh sach sau khi xoa");
                    service.inDanhSach(listDienThoai);
                    break;
                }
                case 8: {
                    System.out.println("1");
                    break;
                }

                case 0: {
                    System.out.println("Bạn đã thoát menu ");
                    break;
                }
                default: {
                    System.out.println("Chức năng này ko tồn tại.");
                    break;
                }
            }
        } while (menu != 0);
    }
}
