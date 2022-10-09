package overriding;

public class Main {

	public static void main(String[] args) {
		//OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
		//System.out.println(ogretmenKrediManager.hesapla(18));
		BaseKrediManager[] krediManagers=new BaseKrediManager[] {
			new OgretmenKrediManager(),new TarımKrediManager(),
			new OgrenciKrediManager()	
		};
		for(BaseKrediManager krediManager:krediManagers) {
			System.out.println(krediManager.hesapla(1000));
		}
	}

}
