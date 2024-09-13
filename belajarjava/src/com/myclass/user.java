package com.myclass;

abstract class user {
    
    
        private String nama="tidak memiliki nama";
        private int umur=0;
        private String jeniskelamin="tidak memiliki jenis kelamin";
        

        public abstract String tampilkanuser();

        public user(String nama, int umur, String jeniskelamin)
{
    this.nama=nama;
    this.umur=umur;
    this.jeniskelamin=jeniskelamin;
    
}
public void cetakinfouser()
    {
        System.out.println("nama : " + nama + ", umur : " + umur+ 
        ", jenis kelamin : " + jeniskelamin );
    }

    //method setter
public void setnama(String nama)
{
    this.nama=nama;
}
public void setumur(int umur)
{
    this.umur=umur;
}
public void setjeniskelamin(String jeniskelamin)
{
    this.jeniskelamin=jeniskelamin;
}

//method getter
public String getnama()
{
    return this.nama;
}
public int getumur()
{
    return this.umur ;
}
public String getjeniskelamin()
{
    return this.jeniskelamin;
}

}
