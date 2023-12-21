/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihangit;

/**
 *
 * @author ASUS
 */
public class Segitiga extends BangunDatar{
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi, String name, int jumlahSudut) {
        super(name, jumlahSudut);
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungLuas() {
        return (1/2 * alas * tinggi);
    }

    @Override
    public double hitungKeliling() {
        return (alas + tinggi + hitungLuas());
    }
    
}
