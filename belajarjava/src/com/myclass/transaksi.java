package com.myclass;

import java.util.Scanner;


public class transaksi {
 
    Scanner input=new Scanner(System.in);
    
    public transaksi(penjual penjual, pembeli pembeli, barang barang)
    {
        System.out.println("penjual :" + penjual.getnama() + ", pembeli :" + pembeli.getnama() + ", barang :" + barang.getnamabarang() 
        + ", jenis barang :" + barang.tampiljenisbarang() + "\n");
        System.out.println("harga :" + barang.gethargabarang() + ", stok barang :" + barang.getstokbarang() + "\n");
        
        int stokbaru=barang.getstokbarang() - 1;
        barang.setstokbarang(stokbaru);
        int pembayaran=barang.gethargabarang();
        System.out.println("total harga :" + pembayaran);

    }

    }

