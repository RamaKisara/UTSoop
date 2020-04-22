/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooputs18090117;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author RamaPC
 */
public class MethodData {
    public static void main(String[] args) {
         MethodData menu = new MethodData();
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu.printMenu();
            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Formulir Tambah Data");
                    menu.addData();
                    break;
                case 2:
                    System.out.println("Formulir Ubah Data");
                    menu.ubahData();
                    break;
                case 3:
                    System.out.println("Formulir Hapus Data");
                    menu.hapusData();
                    break;
                case 4:
                    System.out.println("Daftar Data");
                    menu.listData();
                    break;
                case 5:
                    return;
            }
    }
}

public void hapusData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Urutan data yang akan dihapus : ");
        int idx = Integer.parseInt(sc.nextLine());
        
        Listop.removeData(idx - 1);
    }

    public void ubahData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Pilih data yang ingin diubah : ");
        int idx = Integer.parseInt(sc.nextLine());
        System.out.println("---------------------------------");
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM : ");
        String nim = sc.nextLine();
        System.out.print("Kelas : ");
        String Kelas = sc.nextLine();
          System.out.println("---------------------------------");
        
       
        Listop.editData(new kelasData(nama, nim, Kelas), idx - 1);
    }

    public void listData() {
        
        List<kelasData> result = Listop.getListData();
        for (int i = 0; i < result.size(); i++) {
            System.out.println();
            System.out.println("Data ke-" + (i + 1));
            System.out.println("  Nama : " + result.get(i).getNama());
            System.out.println("  NIM : " + result.get(i).getNim());
            System.out.println("  Kelas : " + result.get(i).getKelas());
           
        }
    }

    public void addData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Masukkan Nama anda : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM anda : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Kelas anda : ");
        String Kelas = sc.nextLine();
       
        
        Listop.addData(new kelasData(nama, nim, Kelas));
    }

    public void printMenu() {
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("Aplikasi Rekam Data Mahasiswa");
        System.out.println("-------------------------------");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Lihat Data");
        System.out.println("5. Keluar");
        System.out.print("Pilihan : ");
    }
}
