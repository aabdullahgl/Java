package base;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;

        String gecti,kaldi;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notu = ");
        matematik=scanner.nextInt();

        System.out.print("\nFizik notu = ");
        fizik=scanner.nextInt();

        System.out.print("\nKimya notu = ");
        kimya=scanner.nextInt();

        System.out.print("\nTürkçe notu = ");
        turkce=scanner.nextInt();

        System.out.print("\nTarih notu = ");
        tarih=scanner.nextInt();

        System.out.print("\nMüzik notu = ");
        muzik=scanner.nextInt();

        int topla = matematik+fizik+kimya+turkce+tarih+muzik;
        double ortalama = topla / 6.0;

        gecti = String.format("\nTebrikler Sınıfı Geçtiniz, ortalamanız = %f",ortalama);
        kaldi = String.format("\nMaalesef Sınıfı Geçemediniz, ortalamanız = %f",ortalama);


        System.out.println(ortalama>=60?gecti:kaldi);




    }
}
