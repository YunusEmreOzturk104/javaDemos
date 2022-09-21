package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1="Yunus";
		String ogrenci2="Emre";
		String ogrenci3="Asel";
		String ogrenci4="Ýrem";
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Yunus";
		ogrenciler[1]="Emre";
		ogrenciler[2]="Asel";
		ogrenciler[3]="Ýrem";
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		for (String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
