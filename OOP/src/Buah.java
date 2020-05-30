package OOP.src;

import java.util.ArrayList;

public class Buah {
    private String nama;
    private int harga, stock;

    // public static ArrayList<Buah> listBuah = new ArrayList<Buah>();

    public Buah(String nama, int harga, int stock) {
        setNama(nama);
        setHarga(harga);
        setStock(stock);
        // listBuah.add(new Buah(nama, harga, stock));
    }

    public String getNama() {
        return nama;
    }

    private void setNama(String nama) {
        if (nama.length() == 0) {
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    private void setHarga(int harga) {
        if (harga <= 0) {
            throw new IllegalArgumentException("Harga tidak boleh 0 atau dibawah");
        }
        this.harga = harga;
    }

    public int getStock() {
        return stock;
    }

    private void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("Stock tidak boleh dibawah 0");
        }
        this.stock = stock;
    }
}