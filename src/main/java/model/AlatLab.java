/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class AlatLab {
    protected int idAlat;
    protected String namaAlat;
    protected String kondisiAlat;
    protected int stok;
    
    //construktorr
    public AlatLab (int idAlat, String namaAlat, String kondisiAlat, int stok){
        this.idAlat = idAlat;
        this.namaAlat = namaAlat;
        this.kondisiAlat = kondisiAlat;
        this.stok = stok;
    }
    
    //getter
    public int getIdAlat() {
        return idAlat;
    }
    
    public String getNamaAlat() {
        return namaAlat;
    }
    
    public String getKondisiAlat() {
        return kondisiAlat;
    }
    
    public int getStok() {
        return stok;
    }
    
    //setter 
    public void setIdAlat(int idAlat) {
        this.idAlat = idAlat;
    }
    
    public void setNamaAlat(String namaAlat) {
        this.namaAlat = namaAlat;
    }
    
    public void setKondisiAlat(String kondisiAlat) {
        this.kondisiAlat = kondisiAlat;
    }
    
    public void setStok(int stok) {
        this.stok = stok;
    }
    
    //method perilaku objek
    public void tampilkanInfo() {
        System.out.println("ID Alat: " + idAlat);
        System.out.println("Nama Alat: " + namaAlat);
        System.out.println("Kondisi Alat: " + kondisiAlat);
        System.out.println("Stok Alat: " + stok);
    }
}
