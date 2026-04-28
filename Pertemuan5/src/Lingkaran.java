/*  Nama File   : MBangunDatar.java 
    Deskripsi   : Berisi atribut dan method dalam class Lingkaran
    Pembuat     : Akmal Dzaki Rahmatullah/24060124140151
    Tanggal     : Senin, 27 April 2026
 */

public class Lingkaran extends BangunDatar implements IResize {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * jariJari;
    }

    @Override
    public void zoomIn() {
        jariJari = jariJari * 1.1;
    }

    @Override
    public void zoomOut() {
        jariJari = jariJari * 0.9;
    }

    public double getJariJari() {
        return jariJari;
    }
}
