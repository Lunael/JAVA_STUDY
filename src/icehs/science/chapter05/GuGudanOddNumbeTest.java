package icehs.science.chapter05;

public class GuGudanOddNumbeTest {

	public static void main(String[] args) {
		int dan = 2;
		while(dan <= 5) {
			int i = 1;
			while(i <= 9) {
				System.out.println(dan + " * " + i + " = " + dan*i);
				i++;
			}
			dan++;
		}
		for(int dan2 = 2; dan2 <= 5 ; dan2++) {
			for(int i =1; i <=9 ; i++) {
				System.out.println(dan + " * " + i + " = " + dan*i);
			}
		}

	}

}
