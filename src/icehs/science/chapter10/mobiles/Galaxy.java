package icehs.science.chapter10.mobiles;

public class Galaxy extends Mobile {
	private String osVersion;
	
	
	
	public String getOsVersion() {
		return osVersion;
	}



	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}



	public void charge(int time) {
		System.out.println(super.getProduction() + " : 보조 배터리 " + time + "분 충전했습니다.");
	}
}
