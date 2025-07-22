package ProjeSoyutlama;


abstract class BankaHesabi {
 protected String hesapNo;
 protected double bakiye;

 public BankaHesabi(String hesapNo, double bakiye) {
     this.hesapNo = hesapNo;
     this.bakiye = bakiye;
 }

 public void paraYatir(double miktar) {
     if (miktar > 0) {
         bakiye += miktar;
         System.out.println(miktar + " TL yatırıldı.");
     }
 }

 public void bakiyeGoster() {
     System.out.println("Hesap No: " + hesapNo + ", Bakiye: " + bakiye + " TL");
 }

 // Soyut metot → Alt sınıflar bunu override etmek zorunda
 public abstract void paraCek(double miktar);
}
