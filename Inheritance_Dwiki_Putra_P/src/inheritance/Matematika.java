package inheritance;
public class Matematika {
   int Operasi;
    double Jumlah;

    // Method Integer Dengan 2 Parameter
    void penjumlahan(int x, int y) {
        Operasi = x + y;
        System.out.println("Hasil Penjumlahan = " + getOperasi());
    }

    void pengurangan(int x, int y) {
        Operasi = x - y;
        System.out.println("Hasil Pengurangan = " + getOperasi());
    }

    void perkalian(int x, int y) {
        Operasi = x * y;
        System.out.println("Hasil Perkalian = " + getOperasi());
    }

    void pembagian(int x, int y) {
        Operasi = x / y;
        System.out.println("Hasil Pembagian = " + getOperasi());
    }

    // Method Integer Dengan 3 Parameter
    void pertambahan(int x, int y,int z) {
        Operasi = x + y + z;
        System.out.println("Hasil Penjumlahan = " + getOperasi());
    }

    void pengurangan(int x, int y, int z) {
        Operasi = x - y - z;
        System.out.println("Hasil Pengurangan = " + getOperasi());
    }

    void perkalian(int x, int y, int z) {
        Operasi = x * y * z;
        System.out.println("Hasil Perkalian = " + getOperasi());
    }

    void pembagian(int x, int y, int z) {
        Operasi = x / y / z;
        System.out.println("Hasil Pembagian = " + getOperasi());
    }

    int getOperasi() {
        return Operasi;
    }

    // Method Double Dengan 2 Parameter
    void pertambahan(double x, double y) {
        Jumlah = x + y;
        System.out.println("Hasil Penjumlahan = " + getJumlah());
    }

    void pengurangan(double x, double y) {
        Jumlah = x - y;
        System.out.println("Hasil Pengurangan = " + getJumlah());
    }

    void perkalian(double x, double y) {
        Jumlah = x * y;
        System.out.println("Hasil Perkalian = " + getJumlah());
    }

    void pembagian(double x, double y) {
        Jumlah = x / y;
        System.out.println("Hasil Pembagian = " + getJumlah());
   
    
    
}
// Method Double Dengan 3 Parameter
    void pertambahan(double x, double y, double z) {
        Jumlah = x + y + z;
        System.out.println("Hasil Penjumlahan = " + getJumlah());
    }

    void pengurangan(double x, double y, double z) {
        Jumlah = x - y - z;
        System.out.println("Hasil Pengurangan = " + getJumlah());
    }

    void perkalian(double x, double y, double z) {
        Jumlah = x * y * z;
        System.out.println("Hasil Perkalian = " + getJumlah());
    }

    void pembagian(double x, double y, double z) {
        Jumlah = x / y / z;
        System.out.println("Hasil Pembagian = " + getJumlah());
    }
    double getJumlah() {
        return Jumlah;
    }
}
