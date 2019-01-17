package icehs.science.chapter09;

public class Docter {
	private String name;
	private String department;
	public Docter(String name, String department) {
		this.name = name;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	
	public void treatPatient() {
		System.out.println("환자를 진료합니다.");
	}
}
