package icehs.science.chapter03;

public class TypeCastingEx {
public static void main(String[] args) {
	long billwealth = 70000000L;
	System.out.println("Original Value :"+billwealth);
	
	double doubleBillwealth = billwealth;
	System.out.println("double������ ����ȯ : "+doubleBillwealth);
	
	int intBillwealth = (int)billwealth;
	System.out.println("int������ ���� ����ȯ : "+intBillwealth);
}
}
