package icehs.science.chapter10;

public class CarTest {

	public static void main(String[] args) {
		Car[] cars = {
			new Taxi(),
			new Truck()
		};
		
		cars[0].wash();
		System.out.print("�ý� : ");
		cars[0].wash();
		System.out.print("Ʈ�� : ");
		cars[1].wash();
	}
}
