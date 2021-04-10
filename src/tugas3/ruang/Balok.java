/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3.ruang;

/**
 *
 * @author User
 */
import tugas3.bidang.*;
public class Balok extends PersegiPanjang{
   int tinggi;

    public Balok(int tinggi, int panjang, int lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
   
    public double volume(){
        return panjang*lebar*tinggi;
    }
    
    public double luasPermukaan(){
        return 2*(panjang*lebar+panjang*tinggi+lebar*tinggi);
    }
    
    @Override
    public void tampilkan(){
        System.out.println("Volume Balok         : " + volume());
        System.out.println("Luas Permukaan Balok : " + luasPermukaan());
    }

      
}

