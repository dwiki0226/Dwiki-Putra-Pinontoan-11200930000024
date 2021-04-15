package inheritance;
    public class MatematikaCanggih extends Matematika {
    // Method Integer Dengan 2 Parameter
    void modulus (int x, int y){
        Operasi = x % y;
        System.out.println("Hasil Modulus = "+ getOperasi());
    }

    // Method Integer Dengan 3 Parameter
    void modulus (int x, int y, int z){
        Operasi = x % y % z;
        System.out.println("Hasil Modulus = "+ getOperasi());
    }

    // Method Double Dengan 2 Parameter
    void modulus (double x, double y) {
        Jumlah = x % y ;
        System.out.println("Hasil Modulus = " + getJumlah());
    }

    // Method Double Dengan 3 Parameter
    void modulus (double x, double y, double z) {
        Jumlah = x % y % z;
        System.out.println("Hasil Modulus = " + getJumlah());
    }

}
