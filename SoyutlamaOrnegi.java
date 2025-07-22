package ProjeSoyutlama;

public class SoyutlamaOrnegi {
    public static void main(String[] args) {
        BankaHesabi hesap = new VadesizHesap("123456", 1000.0);

        hesap.bakiyeGoster();       
        hesap.paraYatir(1500);      
        hesap.paraCek(900);       
        hesap.bakiyeGoster();      
    }
}

