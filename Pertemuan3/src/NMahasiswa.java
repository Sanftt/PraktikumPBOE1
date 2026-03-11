public static void main(String[] args){
    MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek",3);
    MataKuliah PBO = new MataKuliah("MBD", "Manajemen Basis Data",3);
    Mahasiswa M1 = new Mahasiswa("234","Citra","Informatika");
    Dosen D1 = new Dosen("123","Andi","Infromatika");
    Kendaraan K1 = new Kendaraan("H1234AB","Motor");
    M1.setDosenWali(D1);
    M1.setKendaraan(K1);
    M1.addMatkul(PBO);
    M1.addmatkul(MBD);
    M1.printdetailMhs();
    System.out.println("Jumalh Mata Kuliah = " + M1.getJumlahMatkul());
    System.out.println("Jumalh SKS Mata Kuliah = " + M1.getJumlahSKS());

}   
