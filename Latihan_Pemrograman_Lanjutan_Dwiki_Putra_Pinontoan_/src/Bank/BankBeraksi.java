package Bank;
public class BankBeraksi {
     public static void main(String[] args){
        
        Bank getBank = new Bank(100000); 
        getBank.simpanUang(500000);
        getBank.ambilUang(150000);
    }
}
