/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matakuliah;
import mahasiswa.mahasiswa;

/**
 *
 * @author dicky
 */
public class nilaiMK{
    private matakuliah mk; //disini di definisikan dia nilai dari matakuliah apa, karena nanti ini jadi arraylist di objek mahasiswa
    private double quiz;
    private double uts;
    private double uas;
    private int sks;
    private String grade;
    private int index;
    
    public nilaiMK(matakuliah mk, double quiz, double uts, double uas, int sks, String grade, int index){
        this.mk = mk;
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
        this.sks = sks;
        this.grade = grade;
        this.index = index;
    }
    
    public void setMk(matakuliah val){
        this.mk = val;
    }
    
    public matakuliah getMk(){
        return this.mk;
    }
    
    public void setQuiz(double val){
        this.quiz = val;
    }
    
    public double getQuiz(){
        return this.quiz;
    }
    
    public void setUts(double val){
        this.uts = val;
    }
    
    public double getUts(){
        return this.uts;
    }
    
    public void setUas(double val){
        this.uas = val;
    }
    
    public double getUas(){
        return this.uas;
    }
    
    public void setSks(int val){
        this.sks = val;
    }
    
    public int getSks(){
        return this.sks;
    }
    
    public void setGrade(String val){
        this.grade = val;
    }
    
    public String getGrade(){
        return this.grade;
    }
    
    public void setIndex(int val){
        this.index = val;
    }
    
    public int getIndex(){
        return this.index;
    }
}
