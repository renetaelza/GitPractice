package com.mycompany.latihangit;

public class BelahKetupat extends BangunDatar{
    
    private double alas;
    private double tinggi;
    
    @Override
    public double hitungLuas() {
        return alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (alas * tinggi);
    }
    
    
    
}
