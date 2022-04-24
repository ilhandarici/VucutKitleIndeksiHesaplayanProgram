package VücutKitleIndeksi;
import java.util.Scanner;

public class Vücut_Kitle_Indeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy, kilo, indeks;

        try{
        System.out.print("Kilonuzu giriniz (kilogram cinsinden) : ");
        kilo = input.nextDouble();
        System.out.print("Boyunuzu giriniz (metre cinsinden / virgülle giriniz) : ");
        boy = input.nextDouble();
        }finally{input.close();}

        indeks = kilo / (boy * boy);
        String str = (indeks >= 0 && indeks <= 18) ? "Zayıfsınız!" :"Normal kilodasınız.";
        str = (indeks >= 25 && indeks <= 30) ? "Fazla kilolusunuz." : "Obezite sınırındasınız!";
        
        System.out.println("Vücut kitle indeksiniz : "+indeks);
        System.out.println(str);

    }
}
