package switchDemo;

public class Main {

	public static void main(String[] args) {

		char grade = 'G';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel geçtiniz...");
			break;
		case 'B':
			System.out.println("İyi geçtiniz...");
			break;
		case 'C':
			System.out.println(" Geçtiniz...");
			break;
		case 'F':
			System.out.println(" Kaldınız...");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");
		}

	}

}
