package icehs.science.chapter05;

public class GuGuDanTest {

	public static void main(String[] args) {
		for(int dan = 1 ; dan <= 9; dan++) {
			for(int i = 2; i<=9; i++) {
				System.out.print(i + " * " + dan + " = " + dan*i + "\t");
			}
			System.out.println(" ");
		}

	}

}
