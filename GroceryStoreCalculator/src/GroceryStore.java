import java.util.Scanner;

public class GroceryStore {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double armut=2.14d, armutMiktar, armutFiyat;
        double elma=3.67d, elmaMiktar, elmaFiyat;
        double domates=1.11d, domatesMiktar, domatesFiyat;
        double muz=0.95d, muzMiktar, muzFiyat;
        double patlican=5.00d, patlicanMiktar, patlicanFiyat;
        double toplam;

        System.out.print("Satın Aldığınız Armut Miktarı (kg): ");
        armutMiktar = inp.nextDouble();
        armutFiyat= armutMiktar * armut;
        System.out.println("Satın Aldığınız Armudun Tutarı (tl): " + armutFiyat);

        System.out.print("Satın Aldığınız Elma Miktarı (kg): ");
        elmaMiktar = inp.nextDouble();
        elmaFiyat = elmaMiktar * elma;
        System.out.println("Satın Aldığınız Elmanın Tutarı (tl): " +elmaFiyat);

        System.out.print("Satın Aldığınız Domates Miktarı (kg): ");
        domatesMiktar = inp.nextDouble();
        domatesFiyat = domatesMiktar * domates;
        System.out.println("Satın Aldığınız Domatesin Tutarı (tl): " +domatesFiyat);

        System.out.print("Satın Aldığınız Muz Miktarı (kg): ");
        muzMiktar = inp.nextDouble();
        muzFiyat = muzMiktar * muz;
        System.out.println("Satın Aldığınız Muzun Tutarı (tl): " +muzFiyat);

        System.out.print("Satın Aldığınız Patlıcan Miktarı (kg): ");
        patlicanMiktar = inp.nextDouble();
        patlicanFiyat = patlicanMiktar * patlican;
        System.out.println("Aldığınız Patlıcanın Tutarı (tl)" +patlicanFiyat);


        toplam = (armutFiyat+elmaFiyat+domatesFiyat+muzFiyat+patlicanFiyat);
        System.out.println("Ödemeniz Gereken Toplam Tutar (tl): " +toplam);
    }
}
