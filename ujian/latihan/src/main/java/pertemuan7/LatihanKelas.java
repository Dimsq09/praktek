/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author Heri Prabowo
 */
public class LatihanKelas {
    public static void main(String[] args) {
        String JudulBuku1 = "Java 1";
        String AuthorBuku1 = "Zacky";
        String JudulBuku2 = "Java 2";
        String AuthorBuku2 = "Kirra";
        System.out.println(JudulBuku1);
        System.out.println(AuthorBuku1);
        System.out.println(JudulBuku2);
        System.out.println(AuthorBuku2);
        Buku buku1 = new Buku();
        Buku buku2 = new Buku();
        
        buku1.judul = "Java 1";
        buku1.author = "Zacky";
        buku2.judul = "Java 2";
        buku2.author = "Kirra";
        
        System.out.println(buku1.judul);
        System.out.println(buku1.author);
        System.out.println(buku2.judul);
        System.out.println(buku2.author);
        System.out.println(buku1.tahunpenerbitan);
        System.out.println(buku2.tahunpenerbitan);
        System.out.println(buku1.harga.beli);
        System.out.println(buku1.penerbit.nama);
        buku1.harga.setJual(12000);
        System.out.println(buku1.harga.getBeli());
        System.out.println(buku1.penerbit.nama);
        System.out.println("Harga jual buku = " + buku1.harga.getJual());
        System.out.println("Harga jual buku = " + buku2.harga.getJual());
        buku1.terjual();
        
    }
}

class Buku{
    String judul;
    String author;  
    int tahunpenerbitan = 2024;
    Harga harga = new Harga();
    Publisher penerbit = new Publisher();
    
    
    public void terjual() {
        System.out.println("Buku terjual dengan harga : " + harga);
    }
    
}

class Harga{
    double jual = 10000.00;
    double beli = 8000.00;

    public double getJual() {
        return jual;
    }

    public void setJual(double jual) {
        this.jual = jual;
    }

    public double getBeli() {
        return beli;
    }

    public void setBeli(double beli) {
        this.beli = beli;
    }
    
    
}

