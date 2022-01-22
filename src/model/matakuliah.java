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
    private int sks;
    
    public matakuliah(String nama, int sks){
        this.nama = nama;
        this.sks = sks;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setSks(int val){
        this.sks = val;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public int getSks(){
        return this.sks;
    }
}
