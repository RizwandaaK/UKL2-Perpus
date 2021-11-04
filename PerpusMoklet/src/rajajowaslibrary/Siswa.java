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
public class Siswa implements Siswa1 {
    private int idSiswa;
    private String nama, kelas, alamat, telepon;
    boolean status;
    
    public Siswa(int idSiswa, String nama, String kelas, String alamat, String telepon, boolean status) {
        this.idSiswa = idSiswa;
        this.nama = nama;
        this.kelas = kelas;
        this.alamat = alamat;
        this.telepon = telepon;
        this.status = status;
    }
    
    @Override
    public int getIDSiswa() {
        return idSiswa;
    }
    
    @Override
    public String getNama() {
        return nama;
    }
    
    @Override
    public String getKelas() {
        return kelas;
    }
    
    @Override
    public String getAlamat() {
        return alamat;
    }
    
    @Override
    public String getTelepon() {
        return telepon;
    }
    
    public void ubahStatus() {
        this.status = !this.status;
    }
    
    public String getStatus() {
        if (status) {
            return "Diperbolehkan untuk meminjam buku";
        }
        else {
            return "Tidak diperbolehkan untuk meminjam buku";
        }
    }
    
    public boolean idStatus() {
        return status;
    }
   
}
