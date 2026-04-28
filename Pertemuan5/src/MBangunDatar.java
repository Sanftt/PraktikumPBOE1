/*  Nama File   : MBangunDatar.java 
    Deskripsi   : Main class untuk menguji class BangunDatar
    Pembuat     : Akmal Dzaki Rahmatullah/24060124140151
    Tanggal     : Senin, 27 April 2026
 */

public class MBangunDatar {
    public static void main(String[] args) {

        BangunDatar P1 = new Persegi(10);
        Persegi P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);
        Lingkaran L2 = new Lingkaran(14);

        System.out.println("P1 = " + P1.getLuas());
        System.out.println("P2 = " + P2.getLuas());
        System.out.println("L1 = " + L1.getLuas());
        System.out.println("L2 = " + L2.getLuas());

        System.out.println("P1 = " + P1.getKeliling());
        System.out.println("L1 = " + L1.getKeliling());

        System.out.println("P1 == P2 (Luas)? " + P1.isEqualLuas(P2));
        System.out.println("L1 == L2 (Keliling)? " + L1.isEqualKeliling(L2));

        P2.zoomIn();
        System.out.println("Sisi P2 setelah zoomIn: " + P2.getSisi());

        L2.zoomOut();
        System.out.println("Jari2 L2 setelah zoomOut: " + L2.getJariJari());
    }
}
