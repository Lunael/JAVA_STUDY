package icehs.science.chapter05;

public class MutipleFiveSumTest {

	public static void main(String[] args) {
		int sum = 0;
		int index = 1;
		//int count = 1;
		
		while(sum < 100) {
			int number = index * 5;
			sum += number;
			//index++;
			System.out.println(index++ +".( +" + number + " ) " + sum);
		}

	}

}