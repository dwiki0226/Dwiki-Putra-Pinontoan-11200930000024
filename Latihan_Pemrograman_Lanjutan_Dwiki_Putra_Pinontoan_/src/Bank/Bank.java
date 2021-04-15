package Bank;
public class Bank {
    int saldo;
    
    //Konstuktor Bank
    public Bank(int saldo){
        this.saldo = saldo;
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo Saat Ini: Rp." + saldo);
    }
    //Methode Simpan Uang
    public void simpanUang(int sisaSaldo){
        saldo = this.saldo + sisaSaldo;
        System.out.println("Simpan Uang : " + sisaSaldo);
        System.out.println("Saldo Saat Ini: RP." + saldo);     
    }
    //Methode Ambil Uang
    public void ambilUang(int sisaSaldo){
        saldo = this.saldo - sisaSaldo;
        System.out.println("Ambil Uang : " + sisaSaldo);
        System.out.println("Saldo Saat Ini: Rp." + saldo);
    }
    
    public int getSaldo(){
        return saldo;
    }
}
