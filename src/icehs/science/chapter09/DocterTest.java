package icehs.science.chapter09;

public class DocterTest {

	public static void main(String[] args) {
		Dentist dent = new Dentist("ȫ�浿");
		System.out.println(dent.getDepartment() + " : " + dent.getName() + " ������ ");
		dent.treatPatient();
		dent.pullOutTooth();

	}

}
