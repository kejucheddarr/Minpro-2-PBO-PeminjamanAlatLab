/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class AlatBedah extends AlatLab {
    protected String jenisAlat;
    
    //konstruktor
    public AlatBedah(int idAlat, String namaAlat, String kondisiAlat, int stok, String jenisAlat) {
        super(idAlat, namaAlat, kondisiAlat, stok);
        this.jenisAlat = jenisAlat;
    }
    
    //getter
    public String getJenisAlat() {
        return jenisAlat;
    }
    
    //setter
    public void setJenisAlat(String jenisAlat) {
        this.jenisAlat = jenisAlat;
    }
    
    //method
    public void tampilkanInfoAlatBedah() {
        super.tampilkanAlatLab();
        System.out.println("Jenis Alat: " + jenisAlat);
    }
}
