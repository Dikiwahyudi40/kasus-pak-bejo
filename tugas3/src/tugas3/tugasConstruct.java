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
public class tugasConstruct {
    int panjang;
    int lebar;
    int luas;
    int pcs;
    int harga;
    
    tugasConstruct(int p, int l, int L, int s, int h){
        this.panjang = p;
        this.lebar = l;
        this.luas = L;
        this.pcs = s;
        this.harga = h;
    }
    void hitungBanyak(){
        int banyak = this.luas / (this.panjang * this.lebar);
        System.out.println("Banyak keramik yang dibutuhkan : " + banyak + " keramik");
    }
    void hitungBox(){
        int box = (this.luas/(this.panjang * this.lebar))/this.pcs;
        System.out.println("Banyak box keramik yang dibutuhkan : " + box + " box");
    }
    void hitungBiaya(){
    int biaya = ((this.luas/(this.panjang * this.lebar))/this.pcs) * this.harga;
    System.out.println("Biaya yang diperlukan : " + biaya + " rupiah");
    }
}
