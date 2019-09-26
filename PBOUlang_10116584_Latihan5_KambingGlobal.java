/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBOUlang_10116584_Latihan5_KambingGlobal;

/**
 *
 * @author 
 * NIM      : 10116584
 * NAMA     : Muhammad Syahrun Dalu
 */
public class PBOUlang_10116584_Latihan5_KambingGlobal {
     /* @param args the command line arguments
     */
    //Variabel Jumlah Kambing menjadi Variabel instance
int jumlahKambing = 88;
    
    //method untuk menampilkan jumlah kambing
public void getJumlahKambing () {
     System.out.println("Jumlah kambing : "+ jumlahKambing);
 }
 
 public void tambahKambing () {
     jumlahKambing = jumlahKambing + 5;
     System.out.println("Jumlah kambing setelah ditambah : "
                        + jumlahKambing);
 }
    public static void main(String[] args) {
        // TODO code application logic here
    PBOUlang_10116584_Latihan5_KambingGlobal kambingSusu = new PBOUlang_10116584_Latihan5_KambingGlobal();
    //Menampilkan Jumlah Kambing yang ada saat program pertama kali berjalan
    kambingSusu.getJumlahKambing();
    // Menampilkan satu kambing
    kambingSusu.tambahKambing();
    //Menampilkan jumlah kambing yang ada
    kambingSusu.getJumlahKambing();
    
    }
    
}
