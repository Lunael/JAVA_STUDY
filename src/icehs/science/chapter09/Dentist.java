package icehs.science.chapter09;

public class Dentist extends Docter {
	public Dentist(String name) {
		super(name, "치과");
	}
	
	public void pullOutTooth() {
		System.out.println("이를 뽑습니다.");
	}
}
