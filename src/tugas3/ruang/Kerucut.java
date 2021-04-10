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
public class Kerucut extends Lingkaran{
    
    int tinggi;
    float s = (float) Math.sqrt(Math.pow(jariJari,2) + Math.pow(tinggi,2));
    
    

    public Kerucut(int tinggi, float phi, float jariJari) {
        super(phi, jariJari);
        this.tinggi = tinggi;
        
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public float getS() {
        return s;
    }

    public void setS(float s) {
        this.s = s;
    }

    
    public double volume(){
        return (phi*jariJari*jariJari*tinggi)/3;
    }
    
    public double luasPermukaan(){
        return phi*jariJari*(jariJari+s);
    }
    
    @Override
    public void tampilkan(){
        System.out.println("Volume Kerucut         : " + volume());
        System.out.println("Luas Permukaan Kerucut : " + luasPermukaan());
    }
}
