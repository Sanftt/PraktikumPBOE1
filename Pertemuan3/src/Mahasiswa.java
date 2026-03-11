import java.util.ArrayList;

public class Mahasiswa {
    
    /*Atribut*/
    private String nim;
    private String nama;
    private String prodi;
    ArrayLisy<MataKuliah> listmatkul;
    private dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa(){
        this("", "", "");
        this.listMatkul = new ArrayList<>();
    }

    /*Method*/

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new MataKuliah[50];
        this.jumlahMatKul = 0;
        this.dosenWali = null;
        this.kendaraan = null;
    }
    
    public String getNim() {
        return nim;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getProdi() {
        return prodi;
    }
    
    public Dosen getDosenWali() {
        return dosenWali;
    }
    
    public Kendaraan getKendaraan() {
        return kendaraan;
    }
    
    public MataKuliah[] getListMatKul() {
        return listMatKul;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }
    
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }
    
    public void addMatKul(MataKuliah mk) {
        if (jumlahMatKul < 50) {
            listMatKul[jumlahMatKul] = mk;
            jumlahMatKul++;
            System.out.println("Mata kuliah " + mk.getNama() + " berhasil ditambahkan");
        } else {
            System.out.println("Tidak dapat menambah mata kuliah, sudah mencapai batas maksimal 50");
        }
    }
    
    public int getJumlahSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMatKul; i++) {
            totalSKS += listMatKul[i].getSks();
        }
        return totalSKS;
    }
    
    public int getJumlahMatKul() {
        return jumlahMatKul;
    }
    
    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }
    
    public void printDetailMhs() {
        System.out.println("========================================");
        System.out.println("DATA MAHASISWA");
        System.out.println("========================================");
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Prodi       : " + prodi);
        
        System.out.println("\n DAFTAR MATA KULIAH YANG DIAMBIL ");
        if (jumlahMatKul > 0) {
            for (int i = 0; i < jumlahMatKul; i++) {
                System.out.println((i+1) + ". " + listMatKul[i].getNama() + 
                                   " (" + listMatKul[i].getIdMatKul() + 
                                   ") - " + listMatKul[i].getSks() + " SKS");
            }
            System.out.println("Total SKS   : " + getJumlahSKS());
        } else {
            System.out.println("Belum mengambil mata kuliah");
        }
        
        System.out.println("\n DOSEN WALI ");
        if (dosenWali != null) {
            System.out.println("NIP         : " + dosenWali.getNip());
            System.out.println("Nama        : " + dosenWali.getNama());
            System.out.println("Prodi       : " + dosenWali.getProdi());
        } else {
            System.out.println("Belum mempunyai dosen wali");
        }
        
        System.out.println("\n KENDARAAN ");
        if (kendaraan != null) {
            System.out.println("No Plat     : " + kendaraan.getNoPlat());
            System.out.println("Jenis       : " + kendaraan.getJenis());
        } else {
            System.out.println("Tidak memiliki kendaraan");
        }
        System.out.println("========================================");
    }
}