package com.program;
import com.myclass.*;
import java.util.Scanner;

public class Main {
        Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
                monitor monitor1=new monitor("asus", 2000000, 20, "oled", 24);
                monitor1.cetakInfobarang();
                monitor1.tambahstokBarang(5);    
                   

                kipas kipas1=new kipas("tosiba", 200000, 50, 3, 10.0);
                kipas1.cetakInfobarang();
                
                penjual penjual1 = new penjual("asep", 25, "laki-laki", 2);
                penjual1.cetakinfouser();

                System.out.println();

                pembeli pembeli1 = new pembeli("ucup", 12, "laki-laki"
                , "besuki", "0891273896364");
                pembeli1.cetakinfouser();

                transaksi trnsk1=new transaksi(penjual1, pembeli1, monitor1);
                System.out.println(monitor1.getstokbarang());
                System.out.print("membeli :" );
                int jumlah=input.nextInt();
                System.out.println(monitor1.gethargabarang()*jumlah);
        }
        
        // barang barang1=new barang("Asus", 20000000, 15);
        // barang1.tambahstokBarang(5);
        // barang1.kurangstokBarang(20);
        // barang1.cetakInfobarang();

//         barang1.setnamabarang("kasur");
//         barang1.sethargabarang(1900000);
//         barang1.setstokbarang(10);
// System.out.println();
//         System.out.println(barang1.getnamabarang());
//         System.out.println(barang1.gethargabarang());
//         System.out.println(barang1.getstokbarang());
//         barang1.cetakInfobarang();

}
}