/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Akmal Dzaki Rahmatullah / 24060124140151
 * Tanggal      : Jum'at, 27 Februari 2026
 */

public class Titik {
    /***************ATRIBUT***************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /***************METHOD***************/
    public Titik(){
        this(0 ,0);
        counterTitik++;
    }

    public Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public void setAbsis(double x){
        absis = x;
    }

    public void setOrdinat(double y){
        ordinat = y;
    }

    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    public static int getCounterTitik(){
        return counterTitik;
    }

    public void printCounterTitik(){
        System.out.println(this.counterTitik);
    }   

    public int getKuadran(){
        if(absis > 0 && ordinat > 0) return 1;
        if(absis < 0 && ordinat > 0) return 2;
        if(absis < 0 && ordinat < 0) return 3;
        if(absis > 0 && ordinat < 0) return 4;
        return 0;
    }

    public double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    public double getJarak(Titik T){
        double dx = absis - T.absis;
        double dy = ordinat - T.ordinat;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public void refleksiX(){
        ordinat = -ordinat;
    }

    public void refleksiY(){
        absis = -absis;
    }

    public Titik getRefleksiX(){
        return new Titik(absis, -ordinat);
    }

    public Titik getRefleksiY(){
        return new Titik(-absis, ordinat);
    }
} 
