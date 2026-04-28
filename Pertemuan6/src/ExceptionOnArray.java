/*  Nama File   : ExceptionOnArray.java 
    Deskripsi   : Menunjukkan exception pada array di Java
    Pembuat     : Akmal Dzaki Rahmatullah/24060124140151
    Tanggal     : Selasa, 28 April 2026
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}