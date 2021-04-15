package hp;
public class AksiHandphone {
     public static void main(String[] args){
         Handphone handphonedwiki = new Handphone();
         handphonedwiki.Hidupkan = "Handphone Hidup !";
         handphonedwiki.LakukanPanggilan = "Kring Kring Kring Panggilan dilakukan";
         handphonedwiki.KirimSms = "Dung Dung SMS Berhasil Terkirim";
         handphonedwiki.Matikan = "HandPhone Mati";
System.out.println(handphonedwiki.Hidupkan);                 
System.out.println(handphonedwiki.LakukanPanggilan);         
System.out.println(handphonedwiki.KirimSms);
System.out.println(handphonedwiki.Matikan);
     }
}
