/* Nama File    : NMatkul.java
 * Deskripsi    : berisi program utama untuk menggunakan class NMatkul
 * Pembuat      : Akmal Dzaki Rahmatullah / 24060124140151
 * Tanggal      : Kamis, 5 Maret 2026
 */

public class NMatkul {
    public static void main(String[] args) {
        Matkul M1 = new Matkul();
        M1.printMatkul();
        M1.setIDMatkul("MK06-......");
        M1.setNama("Yada Yada");
        M1.setSks(20);
        M1.printMatkul();
    }
}