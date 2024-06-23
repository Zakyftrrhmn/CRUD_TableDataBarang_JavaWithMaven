
package com.mycompany.databarang;


public class Barang {
    private String kode_barang, nama_barang, deskripsi;

    
    // Konstruktor untuk inisialisasi objek Barang dengan nilai awal
    public Barang(String kode_barang, String nama_barang, String deskripsi) {
        this.kode_barang = kode_barang;
        this.nama_barang = nama_barang;
        this.deskripsi = deskripsi;
    }

    
    // Getter untuk mendapatkan nilai (Get = Dapat)
    public String getKode_barang() {
        return kode_barang;
    }
    
    public String getNama_barang() {
        return nama_barang;
    }
    
    public String getDeskripsi() {
        return deskripsi;
    }
    
    // Setter untuk mengubah nilai (Set = Mengatur)
    public void setKode_barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    
    
}
