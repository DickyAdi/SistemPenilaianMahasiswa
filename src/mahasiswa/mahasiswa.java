/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;
import matakuliah.matakuliah;
import matakuliah.nilaiMK;
import java.util.ArrayList;

/**
 *
 * @author dicky
 */
public class mahasiswa{
    private String nama;
    private int nim;
    private double ipk;
    private int totSks;
    private ArrayList<matakuliah> MK; //masing masing objek mahasiswa bisa nampung arraylist matakuliahnya sendiri
    private ArrayList<nilaiMK> NMK; //masing masing objek mahasiswa bisa nampung arralist nilai tiap matakuliahnya sendiri
    
    public mahasiswa(String nama, int nim){
        this.nama = nama;
        this.nim = nim;
    }
    
    public void setNama(String val){
        this.nama = val;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setNim(int val){
        this.nim = val;
    }
    
    public int getNim(){
        return this.nim;
    }
    
}
