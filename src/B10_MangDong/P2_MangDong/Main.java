/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_MangDong.P2_MangDong;

import java.util.ArrayList;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * Mang co dinh: size. Mang dong : K can quan tam toi so luong Java:
     * Collection: ArrayList, List, Linkedlist, Map, Tree.. J1: ArrayListu Cu
     * phap: Chi nhan duoc kieu Object ArrayList<kieu du lieu> ten mang = new
     * ArrayList<>();
     */
    public static void main(String[] args) {
        // Khai bao mang so nguyen 
        ArrayList<String> arr = new ArrayList<>();
        System.out.println(arr.size()); // Lay size
        arr.add("sfafg"); // Them gia tri vao trong mang 
        arr.add("1243123");
        arr.add("2341f");
        System.out.println(arr.size());
        arr.remove("12431asdf23"); // remove (doi tuong)
        arr.remove(0); // remove(vi tri can xoa)
        System.out.println("After" + arr.size());
        // Cach in 
        // C1: for i
//        for (int i = 0; i < a.size(); i++) {
////            System.out.println(a[i]);
//            System.out.print(a.get(i)+" - ");
//        }
        // C2: for each 
        for (String str : arr) {
            // str = a.get(i)
            System.out.println(str);
        }
        // gia tri thuong: a[i]
        // mang dong: a.get(i)
    }
}
