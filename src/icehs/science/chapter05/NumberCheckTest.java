package icehs.science.chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {
		int first = 2;
		int second = 3;
		int third = 4;
		int forth = 5;
		int fifth = 6;
		int sixth = 7;
		
		int result = first * second;
		System.out.println(first + " * " + second + " : ");
		if (result > 100) {
			System.out.println("���ڸ��� �̻��Դϴ�.");
		}else if (result > 10) {
			System.out.println("���ڸ��� �Դϴ�.");
			
		}else if (result >= 0) {
			System.out.println("���ڸ��� �Դϴ�.");
		}else {
			System.out.println("������ Ȯ������ �ʽ��ϴ�.");
		}

	}

}
