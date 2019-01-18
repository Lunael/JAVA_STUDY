package icehs.science.chapter10.heros;

public class HeroTest {

	public static void main(String[] args) {
		Hero [] heros = {
				new SuperMan(),
				new BatMan(),
				new SpiderMan(),
		};
		System.out.println("[Hero 목록 : 슈퍼맨, 배트맨, 스파이더맨]");
		
		for (int i = 0; i < heros.length; i++) {
			heros[i].action();
		}
	}

}
