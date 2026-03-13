/* Nama File    : MLingkaran.java
 * Deskripsi    : Main class untuk menguji class Lingkaran
 * Pembuat      : Akmal Dzaki/24060124140151
 * Tanggal      : Kamis, 12 Maret 2026
 */

public class MLingkaran {
    public static void main(String[] args) {
        System.out.println("=== UJI COBA CLASS LINGKARAN ===\n");
        
        System.out.println("1. Membuat objek dengan konstruktor default:");
        Lingkaran L1 = new Lingkaran();
        L1.setJari(7);
        L1.setWarna("Merah");
        L1.setBorder("Hitam");
        L1.printInfo();
        
        System.out.println("\n2. Membuat objek dengan konstruktor berparameter:");
        Lingkaran L2 = new Lingkaran(10, "Biru", "Putih");
        L2.printInfo();
        
        System.out.println("\n3. Membuat objek Lingkaran ketiga:");
        Lingkaran L3 = new Lingkaran(14, "Hijau", "Emas");
        L3.printInfo();
        
        System.out.println("\n4. Menguji getter dan setter jari-jari:");
        Lingkaran L4 = new Lingkaran(5, "Ungu", "Perak");
        System.out.println("Jari-jari awal: " + L4.getJari());
        System.out.println("Diameter awal: " + L4.getdiameter()); // Perhatikan: getdiameter() dengan 'd' kecil
        
        L4.setJari(8);
        System.out.println("\nSetelah setJari(8):");
        System.out.println("Jari-jari: " + L4.getJari());
        System.out.println("Diameter: " + L4.getdiameter());
        System.out.println("Luas: " + L4.getLuas());
        System.out.println("Keliling: " + L4.getKeliling());
        
        System.out.println("\n5. Menguji getter dan setter diameter:");
        Lingkaran L5 = new Lingkaran(6, "Coklat", "Abu-abu");
        System.out.println("Diameter awal: " + L5.getdiameter());
        System.out.println("Jari-jari awal: " + L5.getJari());
        
        L5.setdiameter(20);
        System.out.println("\nSetelah setDiameter(20):");
        System.out.println("Diameter: " + L5.getdiameter());
        System.out.println("Jari-jari: " + L5.getJari());
        System.out.println("Luas: " + L5.getLuas());
        System.out.println("Keliling: " + L5.getKeliling());
        
        System.out.println("\n6. Membuat array of objek Lingkaran:");
        Lingkaran[] lingkaranArray = {
            new Lingkaran(3, "Pink", "Silver"),
            new Lingkaran(5, "Orange", "Gold"),
            new Lingkaran(7, "Cyan", "Bronze")
        };
        
        for (int i = 0; i < lingkaranArray.length; i++) {
            System.out.println("\nLingkaran ke-" + (i+1) + ":");
            System.out.println("Jari-jari: " + lingkaranArray[i].getJari());
            System.out.println("Diameter: " + lingkaranArray[i].getdiameter());
            System.out.println("Luas: " + lingkaranArray[i].getLuas());
            System.out.println("Keliling: " + lingkaranArray[i].getKeliling());
        }
        
        System.out.println("\n7. Menampilkan statistik akhir:");
        System.out.println("Total objek BangunDatar yang dibuat: " + BangunDatar.getCounterBangunDatar());
        System.out.print("Menggunakan printCounterBangunDatar(): ");
        BangunDatar.printCounterBangunDatar();
    }
}