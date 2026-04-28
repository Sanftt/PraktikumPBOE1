/*  Nama File   : MBangunDatar.java 
    Deskripsi   : Berisi atribut dan method dalam class Persegi
    Pembuat     : Akmal Dzaki Rahmatullah/24060124140151
    Tanggal     : Senin, 27 April 2026
 */

public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    public double getSisi() {
        return sisi;
    }
}