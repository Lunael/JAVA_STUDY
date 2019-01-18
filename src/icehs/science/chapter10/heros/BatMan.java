package icehs.science.chapter10.heros;

public class BatMan extends Hero{
	@Override
	public void action() {
		System.out.print("배트맨");
		super.swim();
		System.out.print("배트맨");
		super.fight();
	}
}
