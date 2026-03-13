/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi atribut dan method dalam class Lingkaran
 * Pembuat      : Akmal Dzaki/24060124140151
 * Tanggal      : Kamis, 12 Maret 2026
 */

public class Lingkaran extends BangunDatar{
    private double jari;
    private double diameter;

    public Lingkaran() {
        super();
        setJmlSisi(0);
    }
    
    public Lingkaran(double jari, String warna, String border) {
        super(0, warna, border);
        this.jari = jari;
        this.diameter = 2 * jari;
    }

    public double getdiameter(){
        return diameter;    
    }
    
    public void setdiameter(double diameter) {
        this.diameter = diameter;
        this.jari = diameter / 2;
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
        this.diameter = 2 * jari;
    }

    public double getLuas(){
        return Math.PI * (jari * jari);
    }

    public double getKeliling(){
        return 2 * Math.PI * (2 * jari);
    }

    public void printInfo() {
    super.printInfo();
    System.out.println("Jari-jari: " + jari);
    System.out.println("Luas: " + getLuas());
    System.out.println("Keliling: " + getKeliling());
}
}
