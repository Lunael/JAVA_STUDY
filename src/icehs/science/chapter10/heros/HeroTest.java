package icehs.science.chapter10.heros;

public class HeroTest {

	public static void main(String[] args) {
		Hero [] heros = {
				new SuperMan(),
				new BatMan(),
				new SpiderMan(),
		};
		System.out.println("[Hero ��� : ���۸�, ��Ʈ��, �����̴���]");
		
		for (int i = 0; i < heros.length; i++) {
			heros[i].action();
		}
	}

}
