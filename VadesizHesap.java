package ProjeSoyutlama;


class VadesizHesap extends BankaHesabi {

 public VadesizHesap(String hesapNo, double bakiye) {
     super(hesapNo, bakiye);
 }

 @Override //bir sınıf başka sınıfı miras alıyorsa bu
 public void paraCek(double miktar) {
     if (miktar > 0 && miktar <= bakiye) {
         bakiye -= miktar;
         System.out.println(miktar + " TL çekildi.");
     } else {
         System.out.println("Yetersiz bakiye!");
     }
 }
}

