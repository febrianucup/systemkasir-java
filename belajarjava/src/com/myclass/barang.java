package com.myclass;

abstract class barang {
    //   public String namaBarang;
    //   public int hargaBarang;
    //   public int stokBarang;
    
//property
      private String namaBarang="belum ada nama";
      private int hargaBarang=0;
      private int stokBarang=0;

//method abstract
protected abstract String tampiljenisbarang();

//method constractor
public barang(String namaBarang, int hargaBarang, int stokBarang)
{
    this.namaBarang =namaBarang;
    this.hargaBarang =hargaBarang;
    this.stokBarang =stokBarang;
}
public barang(String namaBarang, int hargaBarang)
{
    this.namaBarang=namaBarang;
    this.hargaBarang=hargaBarang;
}
public barang(String namaBarang)
{
    this.namaBarang=namaBarang;
}
public barang()
{
}

//method wajib
public void tambahstokBarang(int jmlhtambah)
{
stokBarang += jmlhtambah;
System.out.println("stok barang yang tersedia : " + stokBarang + "\n");
}
public void tambahstokBarang()
{
stokBarang += 1;
System.out.println("stok barang yang tersedia : " + stokBarang + "\n");
}
public void kurangstokBarang(int jmlhkurang)
{
stokBarang -= jmlhkurang;
System.out.println("stok barang yang tersedia : " + stokBarang + "\n");
}
public void kurangstokBarang()
{
stokBarang -= 1;
System.out.println("stok barang yang tersedia : " + stokBarang + "\n");
}
public void cetakInfobarang()
{
System.out.println("nama barang : " + this.namaBarang + " ,harga barang : " + this.hargaBarang
 + " ,stok barang : " + this.stokBarang + "pcs");
}
public boolean cekStok()
{
if(stokBarang>0){
    return true;
}else{
    return false;
}
}
//overload
public boolean cekStok(boolean status)
{
    if(status){
        if(stokBarang>0){
            return true;
        }else{
            return false;
        }
    }else{
        if(stokBarang>0){
            return false;
        }else{
            return true;
        }
    }
}

//method setter
public void setnamabarang(String namaBarang)
{
    this.namaBarang=namaBarang;
}
public void sethargabarang(int hargaBarang)
{
    this.hargaBarang=hargaBarang;
}
public void setstokbarang(int stokBarang)
{
    this.stokBarang=stokBarang;
}

//method getter
public String getnamabarang()
{
    return this.namaBarang;
}
public int gethargabarang()
{
    return this.hargaBarang;
}
public int getstokbarang()
{
    return this.stokBarang;
}
}