package icehs.science.chapter09;

public class AccountTest2 {

	public static void main(String[] args) {
		fundAccount [] fundAcc = {
				new FundAccount("111-2222", "ȫ�浿", 5000000, 4.7),
				new FundAccount("666-7777", "ȫ���", 1000000, 2.9)
		};
		
		for(int i = 0 ; i < fundAcc.length; i++) {
			fundAcc[i].openAccount();
		}
	}
}