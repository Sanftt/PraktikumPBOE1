/*  Nama File   : MBangunDatar.java 
    Deskripsi   : Berisi atribut dan method dalam class BangunDatar
    Pembuat     : Akmal Dzaki Rahmatullah/24060124140151
    Tanggal     : Senin, 27 April 2026
 */

public abstract class BangunDatar {
    protected String warna;
    protected String border;

    public abstract double getLuas();
    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }
}