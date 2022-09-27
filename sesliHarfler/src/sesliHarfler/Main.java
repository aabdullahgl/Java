package sesliHarfler;

import java.awt.KeyEventPostProcessor;
import java.awt.Robot;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// kullanıcıdan değer istiyoruz
		System.out.println("Bir harf tuşlayın...= ");
		// kullanıcının klavyeden girdiği değeri alıyoruz
		Scanner sc = new Scanner(System.in);
		char harf = sc.next().charAt(0);

		// girilebilecek değer durumları
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'ı':
		case 'o':
		case 'u':
			System.out.println(" Tuşladığınız harf kalın sesli");

			return;

		}
		switch (harf) {
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
		case 'e':
		case 'i':
		case 'ö':
		case 'ü':
			System.out.println(" Tuşladığınız harf ince sesli");
			break;
		default:
			System.out.println("Geçersiz harf !");
		}

	}

}
