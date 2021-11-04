/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rajajowaslibrary;
import java.util.Scanner;
import java.util.Date;
/**
 *
 * @author rizwa
 */
public class PerpusMoklet {

    /**
     * @param args the comman2d line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        boolean stay = true;
        
        String key;
        
        DaftarBuku daftarBuku = new DaftarBuku();
        DaftarSiswa daftarSiswa = new DaftarSiswa();
        
        while (stay) {
            System.out.println("");
            SelamatDatang ucapan = new SelamatDatang();
            ucapan.ucapan();
            System.out.println("1. Daftar Buku");
            System.out.println("2. Daftar Siswa");
            System.out.println("3. Transaksi");
            System.out.println("4. Pengembalian Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            int menu = input.nextInt();
            
            System.out.println("");
            
            if (menu == 1) {
                daftarBuku.tampilBuku();
                System.out.println("Tekan 1 dan enter");
                key = input.next();
                
            } else if(menu == 2){
                daftarSiswa.tampilSiswa();
                System.out.println("Tekan 1 dan enter");
                key = input.next();
                
            } else if (menu == 3){
                System.out.println("====== Peminjaman Buku ======");
                
                int selectedIDSiswa, selectedIDBuku;
                
                System.out.print("Masukkan ID Siswa: ");
                selectedIDSiswa = input.nextInt();
                
                int foundIndex = daftarSiswa.cariSiswa(selectedIDSiswa);
                Siswa selectedSiswa = daftarSiswa.daftarSiswa[foundIndex];   
                
                if(selectedSiswa.idStatus()) {
                    daftarSiswa.daftarSiswa[foundIndex].ubahStatus();
                    daftarBuku.tampilBuku();
                    
                    System.out.print("Pilih ID Buku yang Akan Dipinjam: ");
                    System.out.println("");
                    selectedIDBuku = input.nextInt();
                    foundIndex = daftarBuku.cariBuku(selectedIDBuku);
                    
                    Buku selectedBuku = daftarBuku.daftarBuku[foundIndex];
                    
                    System.out.println("--- Daftar Peminjaman ---");
                    Date date = new Date () ;
                    System.out.println("Judul Buku  : " + selectedBuku.getJudulBuku());
                    System.out.println("Peminjam    : " + selectedSiswa.getNama());
                    System.out.println("Tanggal     : " + date.toString());
                    
                    daftarBuku.daftarBuku[foundIndex].kurangiStok();
                    
                } else {
                    System.out.println("Maaf buku anda yang kemaren belum dibalikin, cepet balikin!");
                    System.out.println("=========================================================");
                    System.out.print("ID Siswa  : ");
                    selectedIDSiswa = input.nextInt();
                    daftarSiswa.daftarSiswa[foundIndex].ubahStatus();
                    
                    System.out.print("ID Buku   : ");
                    selectedIDBuku = input.nextInt();
                    foundIndex = daftarBuku.cariBuku(selectedIDBuku);
                    
                    Buku selectedBuku = daftarBuku.daftarBuku[foundIndex];
                    
                    daftarBuku.daftarBuku[foundIndex].tambahStok();
                }
                
                System.out.println("Tekan 1 dan enter");
                key = input.next();
                
            } else if (menu == 5) {
                stay = false;
            }
        }
    }
        public void selamatDatang() {
            System.out.println("-- Perpustakaan Rajajowas --");
    }
}
