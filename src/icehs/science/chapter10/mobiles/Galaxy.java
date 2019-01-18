package icehs.science.chapter10.mobiles;

public class Galaxy extends Mobile implements GooPlay{
	private String osVersion;
	
	
	
	public String getOsVersion() {
		return osVersion;
	}



	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}



	public void charge(int time) {
		System.out.println(super.getProduction() + " : ���� ���͸� " + time + "�� �����߽��ϴ�.");
	}



	@Override
	public void buy(String kind, int price) {
		System.out.println("Galaxy : " + kind + "���� " + price + "���� �����߽��ϴ�.");
		
	}
}
