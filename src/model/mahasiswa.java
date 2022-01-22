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
public class mahasiswa{
    private String nama;
    private String nim;
    private double ipk;
    private int totSks;

    
    public mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }
    
    public void setNama(String val){
        this.nama = val;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setNim(String val){
        this.nim = val;
    }
    
    public String getNim(){
        return this.nim;
    }
    
    public void setIpk(double val){
        this.ipk = val;
    }
    
    public double getIpk(){
        return this.ipk;
    }
}
