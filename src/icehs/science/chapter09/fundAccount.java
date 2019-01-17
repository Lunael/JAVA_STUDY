package icehs.science.chapter09;

public class fundAccount extends Account {
	private double earningRate;
	
	public fundAccount(String number, String name, int balance, double earningRate) {
		super(number, name, balance);
		this.earningRate = earningRate;
	}

	public double getEarningRate() {
		return earningRate;
	}

	public void setEarningRate(double earningRate) {
		this.earningRate = earningRate;
	}
	
	@Override
	public void openAccount() {
		super.openAccount();
		System.out.println("수익률 : " + this.earningRate + "%");
		System.out.println("수익이 발생하였습니다.");
	}
	
	public void earnMoney() {
		System.out.println("수익률 : " + this.earningRate + "%");
		System.out.println("수익이 발생하였습니다.");
	}
	
	public String toString() {
		return "수익률 : " + this.earningRate + "%";
	}
}
