package icehs.science.chapter03;

public class TypeCastingEx {
public static void main(String[] args) {
	long billwealth = 70000000L;
	System.out.println("Original Value :"+billwealth);
	
	double doubleBillwealth = billwealth;
	System.out.println("double형으로 형변환 : "+doubleBillwealth);
	
	int intBillwealth = (int)billwealth;
	System.out.println("int형으로 강제 형변환 : "+intBillwealth);
}
}
