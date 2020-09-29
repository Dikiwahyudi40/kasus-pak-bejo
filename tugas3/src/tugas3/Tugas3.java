/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author arsa
 */
public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tugasNonvoid p1 = new tugasNonvoid();
        p1.panjang = 30;
        p1.lebar = 30;
        p1.luas = 1000000;
        p1.pcs = 10;
        p1.harga = 54000;
        
        System.out.println("Keramik A");
        System.out.println("Banyak keramik A yang dibutuhkan : " + p1.hitungBanyak() + " keramik");
        System.out.println("Banyak box keramik A yang dibutuhkan : " + p1.hitungBox() + " box");
        System.out.println("Biaya yang diperlukan : " + p1.hitungBiaya() + " rupiah");
        
        tugasNonvoid p2 = new tugasNonvoid();
        p2.panjang = 40;
        p2.lebar = 40;
        p2.luas = 1000000;
        p2.pcs = 5;
        p2.harga = 65000;
        
        System.out.println("Keramik B");
        System.out.println("Banyak keramik B yang dibutuhkan : " + p2.hitungBanyak() + " keramik");
        System.out.println("Banyak box keramik B yang dibutuhkan : " + p2.hitungBox() + " box");
        System.out.println("Biaya yang diperlukan : " + p2.hitungBiaya() + " rupiah");
        
        tugasNonvoid p3 = new tugasNonvoid();
        p3.panjang = 30;
        p3.lebar = 40;
        p3.luas = 1000000;
        p3.pcs = 8;
        p3.harga = 60000;
        
        System.out.println("Keramik C");
        System.out.println("Banyak keramik C yang dibutuhkan : " + p3.hitungBanyak() + " keramik");
        System.out.println("Banyak box keramik C yang dibutuhkan : " + p3.hitungBox() + " box");
        System.out.println("Biaya yang diperlukan : " + p3.hitungBiaya() + " rupiah");
        
        tugasConstruct tc1 = new tugasConstruct(30, 30, 1000000, 10, 54000);
        System.out.println("");
        System.out.println("Tugas Constructor");
        System.out.println("Keramik A");
        tc1.hitungBanyak();
        tc1.hitungBox();
        tc1.hitungBiaya();
        
        tugasConstruct tc2 = new tugasConstruct(40, 40, 1000000, 5, 65000);
        System.out.println("Tugas Constructor");
        System.out.println("Keramik B");
        tc2.hitungBanyak();
        tc2.hitungBox();
        tc2.hitungBiaya();
        
        tugasConstruct tc3 = new tugasConstruct(30, 40, 1000000, 8, 60000);
        System.out.println("");
        System.out.println("Tugas Constructor");
        System.out.println("Keramik C");
        tc3.hitungBanyak();
        tc3.hitungBox();
        tc3.hitungBiaya();
    }
    
}
