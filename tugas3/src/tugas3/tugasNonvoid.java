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
public class tugasNonvoid {
    int panjang;
    int lebar;
    int luas;
    int pcs;
    int harga;
    
int hitungBanyak(){
    int banyak;
    banyak = this.luas / (this.panjang * this.lebar);
    return banyak;
}
int hitungBox(){
    int box;
    box = (this.luas/(this.panjang * this.lebar))/this.pcs;
    return box;
}
int hitungBiaya(){
    int biaya;
    biaya = ((this.luas/(this.panjang * this.lebar))/this.pcs) * this.harga;
    return biaya;
}
}
