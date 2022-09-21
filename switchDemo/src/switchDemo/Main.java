package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade='A';
		switch(grade) {
			case 'A':
				System.out.println("Mükemmel :Gectiniz");
				break;
			case 'B':
				System.out.println("Çok güzel :Gectiniz");
				break;
			case 'C':
				System.out.println("Ýyi :Gectiniz");
			break;
			case 'D':
				System.out.println("Fena deðil :Gectiniz");
			break;
			case 'F':
				System.out.println("Maalesef kaldýnýz");
			break;
			default:
				System.out.println("Geçersiz not girdiniz");
		}

	}

}
