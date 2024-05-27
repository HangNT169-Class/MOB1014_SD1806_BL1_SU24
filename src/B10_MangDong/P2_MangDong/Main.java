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
        ArrayList<String> listString = new ArrayList<>();
        System.out.println(listString.size()); // Lay size
        listString.add("sfafg"); // Them gia tri vao trong mang 
        listString.add("1243123");
        listString.add("2341f");
        System.out.println(listString.size());
        listString.remove("12431asdf23"); // remove (doi tuong)
        listString.remove(0); // remove(vi tri can xoa)
        System.out.println("After" + listString.size());
        // Cach in 
        // C1: for i
//        for (int i = 0; i < a.size(); i++) {
////            System.out.println(a[i]);
//            System.out.print(a.get(i)+" - ");
//        }
        // C2: for each 
        for (String str : listString) {
            // str = a.get(i)
            System.out.println(str);
        }
        // gia tri thuong: a[i]
        // mang dong: a.get(i)
    }
}
