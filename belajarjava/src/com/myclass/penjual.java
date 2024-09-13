package com.myclass;


public class penjual extends user{
    
    
    private int lamabekerja=0;

    //method abstract
    public String tampilkanuser()
    {
        return "ini pembeli";
    }

    //mrthod constractor
public penjual(String nama, int umur, String jeniskelamin, int lamabekerja)
{
    super(nama, umur, jeniskelamin);
    this.lamabekerja=lamabekerja;
}


//method wajib
    public void cetakinfouser()
    {
        super.cetakinfouser();
        System.out.println(", lama penjual bekerja : " + lamabekerja + "tahun" + "\n");
    }

//method setter
public void setlamabekerja(int lamabekerja)
{
    this.lamabekerja=lamabekerja;
}

//method getter
public int getlamabekerja()
{
    return this.lamabekerja;
}
}