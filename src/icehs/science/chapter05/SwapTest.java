package icehs.science.chapter05;

public class SwapTest {

	public static void main(String[] args) {
		int first = 4;
		int second = 5;
		int temp = first;
		
		System.out.println("자리순서 : " + first + " , " + second);
		first = second;
		second = temp;
		
		System.out.println("자리순서 : " + first + " , " + second);
	}

}
