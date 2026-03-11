/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Dhimas Reza Nafi Wahyudi/24060124120010
 * Tanggal      : Kamis, 5 Maret 2026
 */
public class Dosen {
    private String NIP;
    private String Nama;
    private String Prodi;

    public Dosen() {
        this("", "", "");
    }
    
    public Dosen(String NIP, String Nama, String Prodi){
        this.NIP = NIP;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    public String getNIP(){
        return NIP;
    }

    public String getNama(){
        return Nama;
    }

    public String getProdi(){
        return Prodi;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public void setProdi(String Prodi){
        this.Prodi = Prodi;
    }

    public void printDosen(){
        System.out.println("NIP = " + NIP + ", Nama = " + Nama + ", Prodi = " + Prodi);
    }
}


