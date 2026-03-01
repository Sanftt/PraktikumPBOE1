/* Nama File    : MTitik.java
 * Deskripsi    : berisi program utama untuk menggunakan class Titik
 * Pembuat      : Dhimas Reza Nafi Wahyudi/24060124120010
 * Tanggal      : Jum'at, 27 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); // Membuat objek titik T1 (0,0)
        T1.setAbsis(3);       // mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4);     // mengubah ordinat T1 dengan nilai 4
        T1.printTitik();        // mencetak koordinat T1 ke layar
        T1.geser(3,4);     // menggeser T1 sejauh (3,4)
        T1.printTitik();        // menampilkan koordinat T1 setelah digeser

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik();      // T3 (0,0)
        Titik T4 = new Titik(3,5);   // T4 (3,5)

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T2.getCounterTitik());
        T2.printCounterTitik();
        
        T3.printTitik();
        T4.printTitik();

        System.out.println("Absis T1 adalah " + T1.getAbsis());

        System.out.println("Ordinat T2 adalah " + T2.getOrdinat());
        
        System.out.println("Kuadran T1 adalah " + T1.getKuadran());

        System.out.println("Jarak T4 ke pusat adalah " + T4.getJarakPusat());

        System.out.println("Jarak T4 ke T2 adalah " + T4.getJarak(T2));

        T4.refleksiX();
        System.out.println("T4 setelah di refleksi terhadap sumbu X:");
        T4.printTitik();

        T4.refleksiY();
        System.out.println("T4 setelah di refleksi terhadap sumbu Y:");
        T4.printTitik();

        Titik T5 = T4.getRefleksiX();
        System.out.println("Output getRefleksiX:");
        T5.printTitik();

        Titik T6 = T4.getRefleksiY();
        System.out.println("Output getRefleksiY:");
        T6.printTitik();

    }
}