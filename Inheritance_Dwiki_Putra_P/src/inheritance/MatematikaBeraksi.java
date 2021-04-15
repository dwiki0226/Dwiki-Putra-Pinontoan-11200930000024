package inheritance;
public class MatematikaBeraksi {
     public static void main(String[] args) {
        // inisialisasi Pemanggilan Method
      MatematikaCanggih Memanggil = new MatematikaCanggih();

        System.out.println("Pemanggilan Method Pertambahan");
        Memanggil.pertambahan(12.5, 28.7, 14.2);
        Memanggil.pertambahan(12, 28, 14);
        Memanggil.pertambahan(23, 34);
        Memanggil.pertambahan(3.4, 4.9);

        System.out.println("\nPemanggilan Method Pengurangan");
        Memanggil.pengurangan(12.5, 28.7, 14.2);
        Memanggil.pengurangan(12, 28, 14);
        Memanggil.pengurangan(23, 34);
        Memanggil.pengurangan(3.4, 4.9);

        System.out.println("\nPemanggilan Method Perkalian");
        Memanggil.perkalian(12.5, 28.7, 14.2);
        Memanggil.perkalian(12, 28, 14);
        Memanggil.perkalian(23, 34);
        Memanggil.perkalian(3.4, 4.9);

        System.out.println("\nPemanggilan Method Pembagian");
        Memanggil.pembagian(12.5, 28.7, 14.2);
        Memanggil.pembagian(12, 28, 14);
        Memanggil.pembagian(23, 34);
        Memanggil.pembagian(3.4, 4.9);

        System.out.println("\nPemanggilan Method Modulus");
        Memanggil.modulus(12.5, 28.7, 14.2);
        Memanggil.modulus(12, 28, 14);
        Memanggil.modulus(23, 34);
        Memanggil.modulus(3.4, 4.9);
     }
}
     
