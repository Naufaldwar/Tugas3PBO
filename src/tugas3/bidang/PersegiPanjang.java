/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3.bidang;

/**
 *
 * @author User
 */
public class PersegiPanjang implements MenghitungBidang{

    public int panjang,lebar ;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
    
    @Override
    public float luas() {
        return panjang*lebar;
    }

    @Override
    public float keliling() {
       return 2*(panjang+lebar);
    }
    
    public void tampilkan(){
        System.out.println("Luas persegi     : " + luas());
        System.out.println("Keliling Persegi : " + keliling());
    }

    
    
    
}
