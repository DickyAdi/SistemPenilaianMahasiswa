/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import model.matakuliah;
import model.mahasiswa;

/**
 *
 * @author dicky
 */
public class nilaiMK{
    private String mk; //disini di definisikan dia nilai dari matakuliah apa, karena nanti ini jadi arraylist di objek mahasiswa
    private double quiz;
    private double uts;
    private double uas;
    private int sks;
    private String grade;
    private double index;
    
    public nilaiMK(String mk, double quiz, double uts, double uas, int sks){
        this.mk = mk;
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
        this.sks = sks;
        this.grade = getGrade();
    }
    
    public void setMk(String val){
        this.mk = val;
    }
    
    public String getMk(){
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
        double perQuiz;
        double perUts;
        double perUas;
        double total;
        String grade;
        
        perQuiz = (30.0 / 100.0) * getQuiz();
        perUts = (35.0 / 100.0) * getUts();
        perUas = (35.0 / 100.0) * getUas();
        total = perQuiz + perUts + perUas;
        if (total > 80) {
            grade = "A";
            setIndex(4*getSks());
        } else if (total > 70 && total <= 80){
            grade = "AB";
            setIndex(3.5*getSks());
        } else if (total > 60 && total <= 70){
            grade = "B";
            setIndex(3*getSks());
        } else if (total > 50 && total <= 60){
            grade = "BC";
            setIndex(2.5 * getSks());
        } else if (total > 40 && total <= 50){
            grade = "C";
            setIndex(2*getSks());
        } else if (total > 30 && total <= 40){
            grade = "D";
            setIndex(1.5 * getSks());
        } else {
            grade = "E";
            setIndex(1*getSks());
        }
        
        return grade;
    }
    
    public void setIndex(double val){
        this.index = val;
    }
    
    public double getIndex(){
        return this.index;
    }
}
