/* Nama File    : MLingkaran.java
 * Deskripsi    : Main class untuk menguji class Persegi
 * Pembuat      : Akmal Dzaki/24060124140151
 * Tanggal      : Kamis, 12 Maret 2026
 */

public class MPersegi {
    public static void main(String[] args) {
        System.out.println("=== OBJEK PERSEGI ===");
        Persegi persegi1 = new Persegi();
        persegi1.setSisi(5);
        persegi1.setWarna("Biru");
        persegi1.setBorder("Hitam");
        persegi1.printInfo();
        System.out.println("Sisi: " + persegi1.getSisi());
        System.out.println("Luas: " + persegi1.getLuas());
        System.out.println("Keliling: " + persegi1.getKeliling());
        
        System.out.println("\n=== OBJEK PERSEGI LAINNYA ===");
        Persegi persegi2 = new Persegi(7, "Merah", "Putih");
        persegi2.printInfo();
        System.out.println("Sisi: " + persegi2.getSisi());
        System.out.println("Luas: " + persegi2.getLuas());
        System.out.println("Keliling: " + persegi2.getKeliling());
        
        System.out.println("\n=== OBJEK LINGKARAN ===");
        Lingkaran lingkaran1 = new Lingkaran();
        lingkaran1.setJari(7);
        lingkaran1.setWarna("Hijau");
        lingkaran1.setBorder("Emas");
        lingkaran1.printInfo();
        System.out.println("Jari-jari: " + lingkaran1.getJari());
        System.out.println("Luas: " + lingkaran1.getLuas());
        System.out.println("Keliling: " + lingkaran1.getKeliling());
        
        System.out.println("\n=== OBJEK LINGKARAN LAINNYA ===");
        Lingkaran lingkaran2 = new Lingkaran(10, "Kuning", "Perak");
        lingkaran2.printInfo();
        System.out.println("Jari-jari: " + lingkaran2.getJari());
        System.out.println("Luas: " + lingkaran2.getLuas());
        System.out.println("Keliling: " + lingkaran2.getKeliling());
        
        System.out.println("\n=== STATISTIK ===");
        BangunDatar.printCounterBangunDatar();
    }
}
