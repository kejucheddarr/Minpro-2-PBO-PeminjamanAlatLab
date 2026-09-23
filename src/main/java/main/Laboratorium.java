/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;
import java.util.ArrayList;
import model.AlatLab;
import model.AlatBedah;
import model.AlatUkur;
import model.Peminjaman;
import service.PeminjamanService;

/**
 *
 * @author HP
 */
public class Laboratorium {
    public static void main(String [] args) {
        ArrayList<AlatLab> rakLab = new ArrayList<>();
        ArrayList<AlatBedah> rakBedah = new ArrayList<>();
        ArrayList<AlatUkur> rakUkur = new ArrayList<>();

        rakLab.add(new AlatLab(1, "Labu Erlenmeyer", "Baik", 10));
        rakLab.add(new AlatLab(2, "Gelas Beaker", "Baik", 5));

        rakBedah.add(new AlatBedah(3, "Scalpel", "Baik", 5, "Pemotong"));
        rakBedah.add(new AlatBedah(4, "Forceps", "Baik", 3, "Penjepit"));

        rakUkur.add(new AlatUkur(5, "Jangka Sorong", "Baik", 2, "Panjang"));
        rakUkur.add(new AlatUkur(6, "Termometer", "Baik", 4, "Suhu"));
        
        Scanner scanner = new Scanner(System.in);
        PeminjamanService service = new PeminjamanService();
        boolean berjalan = true;
        while (berjalan) {
            System.out.println("\n==============================================");
            System.out.println("SISTEM MANAJEMEN PEMINJAMAN ALAT LABORATORIUM");
            System.out.println("==============================================");
            System.out.println("1. Tampilkan Alat");
            System.out.println("2. Tambah Peminjaman");
            System.out.println("3. Tampilkan Riwayat Peminjaman");
            System.out.println("4. Kembalikan Alat");
            System.out.println("5. Hapus Peminjaman");
            System.out.println("6. Keluar");
            System.out.println("Pilih Menu (1-6): ");
            
            //opsiiiiiiiiiw
            try {
                int pilihan = scanner.nextInt();
                scanner.nextLine();
                switch (pilihan){
                    case 1 ->{
                        System.out.println("\n=== Daftar Alat Laboratorium ===");
                        
                        System.out.println("\n----------- Alat Lab -----------");
                        for (AlatLab a : rakLab) {
                            a.tampilkanInfo();
                            System.out.println("--------------------------------");
                        }
                        
                        System.out.println("\n---------- Alat Bedah ----------");
                        for (AlatBedah a : rakBedah) {
                            a.tampilkanInfo();
                            System.out.println("--------------------------------");
                        }
                        
                        System.out.println("\n---------- Alat Ukur -----------");
                        for (AlatUkur a : rakUkur) {
                            a.tampilkanInfo();
                            System.out.println("--------------------------------");
                        }
                    }
                    case 2 ->{
                        System.out.println("ID Peminjaman: ");
                        int idPeminjaman = scanner.nextInt();
                        scanner.nextLine();
                        
                        System.out.println("Nama Petugas: ");
                        String namaPetugas = scanner.nextLine();
                        
                        System.out.println("Nama Alat: ");
                        String namaAlat = scanner.nextLine();
                        
                        System.out.println("Jumlah Pinjam: ");
                        int jumlahPinjam = scanner.nextInt();
                        scanner.nextLine();
                        
                        Peminjaman peminjaman = new Peminjaman(idPeminjaman, namaPetugas, namaAlat, jumlahPinjam);
                        
                        service.tambahPeminjaman(peminjaman, rakLab, rakBedah, rakUkur);
                    }
                    case 3 ->{
                        service.tampilkanPeminjaman();
                    }
                    case 4 ->{
                        System.out.println("Masukkan ID Peminjaman: ");
                        int idTarget = scanner.nextInt();
                        scanner.nextLine();
                        
                        service.kembalikanAlat(idTarget, rakLab, rakBedah, rakUkur);
                    }
                    case 5 ->{
                        System.out.println("Masukkan ID Peminjaman yang ingin dihapus: ");
                        int idTarget = scanner.nextInt();
                        scanner.nextLine();
                        
                        service.hapusPeminjaman(idTarget);
                    }
                    case 6 ->{
                        berjalan = false;
                        System.out.println(">> Program selesai.");
                    }
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println(">> Input harus berupa angka!");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
