/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author User
 */

import java.util.Scanner;
import tugas3.ruang.*;
import tugas3.bidang.*;

public class Tugas3 {
    public static void main(String[] args) {
        
        int pilih=0;
        int p,l,t,r,tk;
        float ph=(float) 3.14;
        Scanner input = new Scanner (System.in);
        
        while(pilih!=3){
        System.out.println("INPUT");
        System.out.println("1. Balok");
        System.out.println("2. Kerucut");
        System.out.println("3. Exit");
        System.out.print("Pilih : "); pilih= input.nextInt();
        
        if(pilih==1){
        
        System.out.print("Panjang : "); p= input.nextInt();
        System.out.print("Lebar   : "); l= input.nextInt();
        System.out.print("Tinggi  : "); t= input.nextInt();
        PersegiPanjang persegiPanjang = new PersegiPanjang(p,l);
        persegiPanjang.tampilkan();
        Balok balok = new Balok(t,p,l);
        balok.tampilkan();   
        }
        
        else if(pilih==2){
        
        System.out.print("Jari-Jari : "); r= input.nextInt();
        System.out.print("Tinggi    : "); tk= input.nextInt();
        Lingkaran lingkaran = new Lingkaran(ph,r);
        lingkaran.tampilkan();
        Kerucut kerucut = new Kerucut(tk,ph,r);
        kerucut.tampilkan();   
        }
    
}
}
}