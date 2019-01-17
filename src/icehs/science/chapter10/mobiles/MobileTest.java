package icehs.science.chapter10.mobiles;

public class MobileTest {

	public static void main(String[] args) {
		Mobile[] mobiles = {
			new Galaxy(),
			new IPhome()
		};
		mobiles[0].setProduction("Galaxy");
		mobiles[1].setProduction("IPhome");
		((Galaxy)(mobiles[0])).setOsVersion("안드로이드 오레오");
		((IPhome)(mobiles[1])).setColor("흰색");
		
		System.out.println(mobiles[0].getProduction() + " : " + ((Galaxy)(mobiles[0])).getOsVersion());
		mobiles[0].call(5);
		mobiles[0].charge(30);
		System.out.println(mobiles[1].getProduction() + " : " + ((IPhome)(mobiles[1])).getColor());
		mobiles[1].call(10);
		mobiles[1].charge(15);
	}

}
