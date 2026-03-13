/* Nama File    : Matkul.java
 * Deskripsi    : berisi atribut dan method dalam class Matkul
 * Pembuat      : Akmal Dzaki Rahmatullah / 24060124140151
 * Tanggal      : Kamis, 5 Maret 2026
 */

public class Matkul {
    private String idMatkul;
    private String Nama;
    private int sks;

    /* Class */

    public Matkul(){
        this("", "", 0);
    }

    public Matkul(String idMatkul, String Nama, int sks){
        this.idMatkul = idMatkul;
        this.Nama = Nama;
        this.sks = sks;
    }

    /* Getter */

    public String getIdMatkul(){
        return idMatkul;
    }

    public String getID(){
        return idMatkul;
    }

    public String getNama(){
        return Nama;
    }

    public int getsks(){
        return sks;
    }

    /* Mutator */

    public void setIDMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }

    public void printMatkul(){
        System.out.println("idMatkul = " + idMatkul + ", Nama = " + Nama + ", sks = " + sks);
    }
}
