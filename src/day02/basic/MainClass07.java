package day02.basic;

import java.math.BigDecimal;

/*
 * [[ 기본 자료형 ]]
 * 	! 부동소수점 오차
 * 		컴퓨터가 실수 계산을 잘 못해요!!
 * 		
 * 실수는 부동소수점 예외처리 필수!!!
 */

public class MainClass07 {
	public static void main(String[] args) {
		
		float f = 0.0f;
		for(int i = 0; i < 100; i++) { // 반복문
			// 실행코드 반복
			f += 0.1f;
		}
		
		System.out.println(f);
		
		double d = 0.0d;
		for(int i = 0; i < 100; i++) { // 반복문
			// 실행코드 반복
			d += 0.1d;
		}
		
		System.out.println(d);
		
		BigDecimal bd = new BigDecimal(0.0);
		for(int i = 0; i < 100; i++) { // 반복문
			// 실행코드 반복
			bd = bd.add(new BigDecimal(0.1));
		}
		
		System.out.println(bd);
	}
	
}


