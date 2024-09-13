package com.myclass;

public class pembeli extends user{

    private String alamat="tidak ada alamat";
    private String notelp="tidak ada no telpon";

    //method abstract
    public String tampilkanuser()
    {
        return "ini pembeli";
    }


public pembeli(String namapembeli, int umurpembeli, String jeniskelamin, String alamat, String string)
{
    super(namapembeli, umurpembeli, jeniskelamin);
    this.alamat=alamat;
    this.notelp=string;
}

public void cetakinfouser()
    {
        super.cetakinfouser();
        System.out.println(", alamat : " + alamat + ", no telpon :" + notelp + "\n");
    }

//method setter
public void setalamat(String alamat)
{
    this.alamat=alamat;
}
public void setnotelp(String notelp)
{
    this.notelp=notelp;
}

//method getter
public String getalamat()
{
    return this.alamat;
}
public String getnotelp()
{
    return this.notelp;
}
}