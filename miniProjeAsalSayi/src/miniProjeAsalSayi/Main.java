package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number=25;
		int remainder=number%2;
		//System.out.println(remainder);
		boolean Ýsprime=true;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				Ýsprime=true;
			}
		}
		if(Ýsprime) {
			System.out.println("Sayi asaldir");
		}
		else {
			System.out.println("sayi asal deðildir");
		}
	}

}
