/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rajajowaslibrary;

/**
 *
 * @author rizwa
 */
public class DaftarBuku {
    Buku[] daftarBuku = {
        new Buku(1, "Laskar Pelangi", 140),
        new Buku(2, "Budidaya Cambah", 85),
        new Buku(3, "Pemain Keduabelas", 100),
        new Buku(4, "Hujan di Bulan Juni", 110),
    };
    
    public void tampilBuku() {
        System.out.println("====== Daftar Buku ======");
        System.out.println("ID \t Judul \t\t\t Stok");
        for (int i = 0; i < daftarBuku.length; i++) {
            System.out.println(daftarBuku[i].getIDBuku() + " \t " 
                             + daftarBuku[i].getJudulBuku() + " \t "
                             + daftarBuku[i].getStok());
        }
    }
    
    public int cariBuku(int id) {
        int temukan = 0;
        for (int i = 0; i < daftarBuku.length; i++) {
            if (daftarBuku[i].getIDBuku()== id) {
                temukan = i;
            }
        }
    return temukan;
    }
    
}
