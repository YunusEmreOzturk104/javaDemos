package overriding;

public class BaseKrediManager {
	public double hesapla( double tutar){
		//public yan�na final ile override engellenri
		return tutar*1.18;
	}
}
