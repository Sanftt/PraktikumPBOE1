/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Akmal Dzaki Rahmatullah / 24060124140151
 * Tanggal      : Kamis, 5 Maret 2026
 */

import java.util.ArrayList;

public class Mahasiswa {
    
    /*Atribut*/
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<Matkul> listMatkul;
    private Dosen dosenWali;
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
        this.listMatkul = new ArrayList<>();
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
    
    public ArrayList<Matkul> getListMatkul() {
        return listMatkul;
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
    
    public void addMatkul(Matkul mk) {
        if (listMatkul.size() < 50) {
            listMatkul.add(mk);
            System.out.println("Mata kuliah " + mk.getNama() + " berhasil ditambahkan");
        } else {
            System.out.println("Tidak dapat menambah mata kuliah, sudah mencapai batas maksimal 50");
        }
    }
    
    public int getJumlahSKS() {
        int totalSKS = 0;
        for (int i = 0; i < listMatkul.size(); i++) {  // Menggunakan for i
            totalSKS += listMatkul.get(i).getsks();
        }
        return totalSKS;
    }
    
    public int getJumlahMatKul() {
        return listMatkul.size();
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
        if (!listMatkul.isEmpty()) {
            for (int i = 0; i < listMatkul.size(); i++) {
                System.out.println((i+1) + ". " + listMatkul.get(i).getNama() + 
                                   " (" + listMatkul.get(i).getIdMatkul() + 
                                   ") - " + listMatkul.get(i).getsks() + " SKS");
            }
            System.out.println("Total SKS   : " + getJumlahSKS());
        } else {
            System.out.println("Belum mengambil mata kuliah");
        }
        
        System.out.println("\n DOSEN WALI ");
        if (dosenWali != null) {
            System.out.println("NIP         : " + dosenWali.getNIP());
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