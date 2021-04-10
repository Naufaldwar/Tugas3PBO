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
public class Lingkaran implements MenghitungBidang {
    public float phi, jariJari;

    public Lingkaran(float phi, float jariJari) {
        this.phi = phi;
        this.jariJari = jariJari;
    }

    public float getPhi() {
        return phi;
    }

    public void setPhi(float phi) {
        this.phi = phi;
    }

    public float getJariJari() {
        return jariJari;
    }

    public void setJariJari(float jariJari) {
        this.jariJari = jariJari;
    }

    

    @Override
    public  float keliling(){
        return 2*phi*jariJari;
    }

    @Override
    public float luas(){
        return phi*jariJari*jariJari;
    }
    
    public void tampilkan(){
        System.out.println("Luas Lingkaran     : " + luas());
        System.out.println("Keliling Lingkaran : " + keliling());
    }

    

}
