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
public class DaftarSiswa {
    Siswa[] daftarSiswa = {
        new Siswa(1, "Rizwanda Keysha Cahya Putra   ", "XI RPL 1    ", "Jl. Danau Ranau X G7D/2     ", "085156563724", true),
        new Siswa(2, "Sherena Maulidya Eka Arifianti", "XI RPL 7    ", "Jl. Danau Buyan G3A/5       ", "082139669824", true),
        new Siswa(3, "Syahra Zulya Shania Maghfiroh ", "XI RPL 2    ", "Jl. Danau Laut Tawar G4D/8  ", "086961013485", true),
        new Siswa(4, "Rachell Varensha Auliasyifa   ", "XI RPL 5    ", "Jl. Danau Ranau No. 25      ", "082904789214", true),
        new Siswa(5, "Nawla Uwais Parsa Balqis      ", "XI RPL 1    ", "Jl. Danau Poso II           ", "088271448942", true),
        new Siswa(6, "Henis Retriendiyakti Suadilah ", "XI TKJ 5    ", "Jl. Danau Poso II           ", "089832897035", true),
        new Siswa(7, "Alvianto Putra Sahefi         ", "XI RPL 6    ", "Jl. Danau Maninjau Raya No.4", "081246898964", true),
        new Siswa(8, "Balada Raja Baskara           ", "XI RPL 2    ", "Jl. Danau Kerinci G6A/9     ", "082140944757", true),
        new Siswa(9, "Ahmad Alfan Fadhil Huda       ", "XI TKJ 2    ", "Jl. Danau Ranau X G7D/2     ", "083756298338", true),
        new Siswa(10, "Patricia Joan Duanty Angeline ", "XI RPL 2    ", "Jl. Danau Tondano G7H/1     ", "089379832138", true),
    };
    
    public void tampilSiswa() {
        System.out.println("====== Daftar Siswa ======");
        System.out.println("ID \t Nama \t\t\t\t\t Kelas \t\tAlamat \t\t\t\t No. Telepon \t Status");
        for (int i = 0; i < daftarSiswa.length; i++) {
            System.out.println(daftarSiswa[i].getIDSiswa() + " \t " + 
                               daftarSiswa[i].getNama() + " \t " +
                               daftarSiswa[i].getKelas() + " \t" +
                               daftarSiswa[i].getAlamat() + " \t " +
                               daftarSiswa[i].getTelepon() + " \t " +
                               daftarSiswa[i].getStatus());
        }
    }
    
    public int cariSiswa(int id) {
        int temukan = 0;
        for (int i = 0; i < daftarSiswa.length; i++) {
            if (daftarSiswa[i].getIDSiswa() == id) {
                temukan = i;
            }
        }
        return temukan;
    }
}
