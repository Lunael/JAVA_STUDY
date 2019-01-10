package icehs.science.chapter05;

public class GradeIfElseIfTest {

	public static void main(String[] args) {
		int score = 92;
		
		if (score >= 90 && score <= 100) {
			System.out.println("100점 이하 ~ 90점 이상 : A학점입니다.");
		} else if(score >= 80 && score < 90) {
			System.out.println("90점 미만 ~ 80점 이상 : B학점입니다.");
		} else if(score >= 70 && score < 80) {
			System.out.println("70점 미만 ~ 80점 이상 : C학점입니다.");
		} else if(score >= 60 && score < 70) {
			System.out.println("60점 미만 ~ 70점 이상 : D학점입니다.");
		}
	}

}
