package com.myclass;

public class kipas extends barang{
    
    //property
    private int kecepatan=0;
    private double daya=0;

    //method abstract
    protected String tampiljenisbarang()
    {
        return "ini adalah kipas";
    }


    //method constructor
public kipas(String namaBarang, int hargaBarang, int stokBarang, int kecepatan, double daya)
{
    super(namaBarang, hargaBarang, stokBarang);
    this.kecepatan=kecepatan;
    this.daya=daya;
}

//setter and getter
public void setkecepatan(int kecepatan)
{
    this.kecepatan=kecepatan;
}
public int getkecepatan()
{
    return this.kecepatan;
}
public void setdaya(double daya)
{
    this.daya=daya;
}
public double getdaya()
{
    return this.daya;
}

@Override
public void cetakInfobarang()
{
    super.cetakInfobarang();
    System.out.println(", kecepatan : " + this.kecepatan  + ", daya : " + this.daya + "watt" +"\n");
}
}
