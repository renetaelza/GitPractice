/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihangit;

/**
 *
 * @author ACER
 */
public class Balok extends BangunDatar {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok() {
    }

    public Balok(double panjang, double lebar, double tinggi, String name, int jumlahSudut) {
        super(name, jumlahSudut);
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    

    @Override
    public double hitungLuas() {
        return panjang * lebar * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar + tinggi);
    }
    
}
