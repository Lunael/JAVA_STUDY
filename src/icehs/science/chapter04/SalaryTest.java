package icehs.science.chapter04;

public class SalaryTest {
	public static void main(String[] args) {
		
		double month1yearMoney = 10000000;
		double bonusRate = 0.2;
		double taxmain = 0.1;
		double taxbonus = 0.055;
		
		double yearMoney = month1yearMoney + (month1yearMoney * bonusRate);
		double taxAfterYearMoney = yearMoney - (yearMoney * taxmain);
		double bonus = taxAfterYearMoney - month1yearMoney;
		double taxAfterBonus = bonus - (bonus * taxmain);
		double allTaxAfterMoney = taxAfterYearMoney + taxAfterBonus;
		
		System.out.println("연봉 : " + yearMoney + " , " + "세후 연봉 : " + taxAfterYearMoney);
		System.out.println("보너스 : " + bonus + " , " + " 세후 보너스 : " + taxAfterBonus);
		System.out.println(" 지급액 : "+ allTaxAfterMoney);

	}

}
