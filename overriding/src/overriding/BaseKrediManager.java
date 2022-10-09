package overriding;

public class BaseKrediManager {
	public double hesapla( double tutar){
		//public yanına final ile override engellenri
		return tutar*1.18;
	}
}
