package icehs.science.chapter10.heros;

public abstract class Hero implements CanFly, CanSwim, CanFight{

	@Override
	public void fight() {
		System.out.println("�� �ο��.");
		
	}

	@Override
	public void swim() {
		System.out.println("�� �����Ѵ�.");
	}

	@Override
	public void fly() {
		System.out.println("�� ����.");
		
	}
	public abstract void action() ;
		
}
