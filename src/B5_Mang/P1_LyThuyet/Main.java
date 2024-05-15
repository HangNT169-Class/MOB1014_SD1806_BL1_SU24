/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B5_Mang.P1_LyThuyet;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {
    /**
     * Ham => ()
     * Mang => []
     * Object => {}
     * VD: 9 3 -1 5 "abc" => K phai la 1 mang 
     * Mang : Co 2 loai mang:
     *     C: biet truoc size 
     *          => Mang co dinh so luong phan tu
     *     Java: Mang dong => k can care size:
     *          Collections Java : ArrayList
     * VD: 10 -1 4 7 8 5  => gia tri phan tu cua mang 
     * VT:  0  1 2 3 4 5(size - 1)
     * Mang: vi tri & gia tri 
     * Mang: arr, 
     * arr[0] = 10 => Gia tri o vi tri 0 
     * Gia tri o vi tri i : arr[i]
     * Cu phap: 
     *      kieu du lieu ten mang[] = new kieu du lieu[size]
     */
    public static void main(String[] args) {
        // Nhap vao 1 mang so nguyen va in ra man hinh
        Scanner sc = new Scanner(System.in);
        // B1: Nhap size 
        System.out.println("Moi nhap size:");
        int size = Integer.valueOf(sc.nextLine());
        // B2: Nhap cac phan tu trong mang 
        int arr[] = new int[size];
        System.out.println("Moi nhap cac phan tu trong mang:");
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.valueOf(sc.nextLine());
        }
        // B3: in mang vua nhap 
        System.out.println("Cac phan tu trong mang la:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
