package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj="Bugun hava �ok guzel.";
		System.out.println(mesaj);
		/*System.out.println("Eleman sayisi="+mesaj.length());
		System.out.println("5. eleman: "+mesaj.charAt(4));
		System.out.println(mesaj.concat("Yasasin!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler =new char[5];
		mesaj.getChars(0, 5,karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a'));
		System.out.println(mesaj.lastIndexOf('a'));*/
		String yeniMesaj=mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2));//2.indexten sonra yazar
		System.out.println(mesaj.substring(2,5));//2den 5 e
		for(String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase());//harfleri k���lt�r
		System.out.println(mesaj.toUpperCase());//b�y�t�r
		System.out.println(mesaj.trim());
	}

}
