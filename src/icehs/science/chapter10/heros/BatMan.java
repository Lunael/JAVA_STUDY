package icehs.science.chapter10.heros;

public class BatMan extends Hero{
	@Override
	public void action() {
		System.out.print("��Ʈ��");
		super.swim();
		System.out.print("��Ʈ��");
		super.fight();
	}
}
