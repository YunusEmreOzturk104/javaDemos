package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade='A';
		switch(grade) {
			case 'A':
				System.out.println("M�kemmel :Gectiniz");
				break;
			case 'B':
				System.out.println("�ok g�zel :Gectiniz");
				break;
			case 'C':
				System.out.println("�yi :Gectiniz");
			break;
			case 'D':
				System.out.println("Fena de�il :Gectiniz");
			break;
			case 'F':
				System.out.println("Maalesef kald�n�z");
			break;
			default:
				System.out.println("Ge�ersiz not girdiniz");
		}

	}

}
