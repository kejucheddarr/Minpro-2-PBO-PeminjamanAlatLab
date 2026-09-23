/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class AlatUkur extends AlatLab {
    protected String besaranDiukur;
    
    //konstruktor
    public AlatUkur(int idAlat, String namaAlat, String kondisiAlat, int stok, String besaranDiukur) {
        super(idAlat, namaAlat, kondisiAlat, stok);
        this.besaranDiukur = besaranDiukur;
    }
    
    //getter
    public String getBesaranDiukur() {
        return besaranDiukur;
    }
    
    //setter
    public void setBesaranDiukur(String besaranDiukur) {
        this.besaranDiukur = besaranDiukur;
    }
    
    //method
    public void tampilkanInfoAlatUkur() {
        super.tampilkanAlatLab();
        System.out.println("Besaran: " + besaranDiukur);
    }
}
