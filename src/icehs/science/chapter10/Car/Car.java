package icehs.science.chapter10.Car;

public class Car {
	private int oilSize;
	
	public void go(int distance) {
		System.out.println(distance + "km �̵��մϴ�.");
		System.out.println("���� : " + this.oilSize);
	}
	
	public int getOilSize() {
		return oilSize;
	}

	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
		
	}

}