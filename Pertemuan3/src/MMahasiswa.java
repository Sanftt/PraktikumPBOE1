/*MMahasiswale    : NMahasiswa.java
 * Deskripsi    : berisi program utama untuk menggunakan class NMahasiswa
 * Pembuat      : Akmal Dzaki Rahmatullah / 24060124140151
 * Tanggal      : Kamis, 5 Maret 2026
 */

public static void main(String[] args){
    Matkul PBO = new Matkul("PBO", "Pemrograman Berorientasi Objek",3);
    Matkul MBD = new Matkul("MBD", "Manajemen Basis Data",3);
    Mahasiswa M1 = new Mahasiswa("151","Akmal","Informatika");
    Dosen D1 = new Dosen("515","Happy","Infromatika");
    Kendaraan K1 = new Kendaraan("E1234BC","Motor");
    M1.setDosenWali(D1);
    M1.setKendaraan(K1);
    M1.addMatkul(PBO);
    M1.addMatkul(MBD);
    M1.printDetailMhs();
    System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
    System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());

}   
