/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author dicky
 */
public class matakuliah {
    private String nama;
    private String kode;
    private int sks;
    
    public matakuliah(String nama, String kode, int sks){
        this.nama = nama;
        this.kode = kode;
        this.sks = sks;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setKode(String kode){
        this.kode = kode;
    }
    
    public void setSks(int val){
        this.sks = val;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public String getKode(){
        return this.kode;
    }
    
    public int getSks(){
        return this.sks;
    }
}
