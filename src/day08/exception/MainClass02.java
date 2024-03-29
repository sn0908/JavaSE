package day08.exception;

import day08.mypac.AkWeapon;

public class MainClass02 {
	public static void main(String[] args) {
		AkWeapon ak = null;
		
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		
		try {
			ak.attack();
			result = num1 / num2;
		} catch(NullPointerException e) {
			System.out.println("null 포인터 익셉션 발생하였습니다.");
			e.printStackTrace();
		} catch(ArithmeticException e) {
			System.out.println("어떠한 수를 0으로 나눌 수 없습니다.");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("예외가 발생하였습니다.");
			e.printStackTrace();
		}
		
	}
}
