package com.myclass;


public class monitor extends barang{
    
  //property    
  private String tipelayar="tidak ada tipe layar";
  private int ukuranlayar=0;

  //method abstract
  protected String tampiljenisbarang()
  {
    return "ini adalah monitor";
  }

  //method constructor
  public monitor(String namaBarang, int hargaBarang, int stokBarang, String tipelayar, int ukuranlayar) {
    super(namaBarang, hargaBarang, stokBarang);
    this.tipelayar=tipelayar;
    this.ukuranlayar=ukuranlayar;
  }
  //setter and getter
public void settipelayar(String tipelayar)
{
  this.tipelayar=tipelayar;
}
public String gettipelayar()
{
  return this.tipelayar;
}
public void setukuranlayar(int ukuranlayar)
{
  this.ukuranlayar=ukuranlayar;
}
public int getukuranlayar()
{
  return this.ukuranlayar;
}
  
//overriding
@Override
public void cetakInfobarang()
{
  super.cetakInfobarang();
  System.out.println(",tipe layar :" + this.tipelayar + " ,ukuranlayar : " + this.ukuranlayar + "inch"+ "\n");
}

}