package icehs.science.chapter10;

public class CarTest {

	public static void main(String[] args) {
		Car[] cars = {
			new Taxi(),
			new Truck()
		};
		
		cars[0].wash();
		System.out.print("택시 : ");
		cars[0].wash();
		System.out.print("트럭 : ");
		cars[1].wash();
	}
}
