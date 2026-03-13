/* Nama File    : MBangunDatar.java
 * Deskripsi    : Main class untuk menguji class BangunDatar
 * Pembuat      : Akmal Dzaki/24060124140151
 * Tanggal      : Kamis, 12 Maret 2026
 */

public class MBangunDatar {
    public static void main(String[] args) {
        System.out.println("=== UJI COBA CLASS BANGUNDATAR ===\n");
        
        System.out.println("Membuat objek dengan konstruktor default:");
        BangunDatar bd1 = new BangunDatar();
        bd1.setJmlSisi(4);
        bd1.setWarna("Merah");
        bd1.setBorder("Hitam");
        bd1.printInfo();
        
        System.out.println("\nMembuat objek dengan konstruktor berparameter:");
        BangunDatar bd2 = new BangunDatar(3, "Biru", "Putih");
        bd2.printInfo();
        
        System.out.println("\nMembuat objek BangunDatar ketiga:");
        BangunDatar bd3 = new BangunDatar(0, "Hijau", "Emas");
        bd3.printInfo();

        System.out.println("\nMenguji getter dan setter:");
        BangunDatar bd4 = new BangunDatar();
        System.out.println("Sebelum diubah:");
        System.out.println("Jumlah sisi: " + bd4.getJmlSisi() + " (default)");
        System.out.println("Warna: " + bd4.getWarna() + " (default)");
        System.out.println("Border: " + bd4.getBorder() + " (default)");
        
        bd4.setJmlSisi(5);
        bd4.setWarna("Ungu");
        bd4.setBorder("Perak");
        
        System.out.println("\nSetelah diubah:");
        System.out.println("Jumlah sisi: " + bd4.getJmlSisi());
        System.out.println("Warna: " + bd4.getWarna());
        System.out.println("Border: " + bd4.getBorder());
        
        System.out.println("\nMenampilkan statistik objek:");
        System.out.println("Menggunakan getCounterBangunDatar(): " + BangunDatar.getCounterBangunDatar() + " objek");
        System.out.print("Menggunakan printCounterBangunDatar(): ");
        BangunDatar.printCounterBangunDatar();
        
        
    }
}