package icehs.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int num = 456;
		
		int hundred - num / 100;
		int ten = ( num / 10 ) % 10;
		int one = num % 10;
		
		System.out.println("숫자 : " + num);
		System.out.println(" 백의 자리 수 : " + hundred);
		System.out.println(" 십의 자리 수 : " + ten);
		System.out.println(" 일의 자리 수 : " + one);

	}

}
