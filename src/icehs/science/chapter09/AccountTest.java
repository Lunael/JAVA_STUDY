package icehs.science.chapter09;

public class AccountTest {

	public static void main(String[] args) {
		fundAccount fund = new fundAccount;
		fund.setNumber("111-2222");
		fund.setName("ȫ�浿");
		fund.setBalance(5000000);
		fund.setEarningRate(4.7);
		fund.openAccount();
		fund.earnMoney();

	}

}
