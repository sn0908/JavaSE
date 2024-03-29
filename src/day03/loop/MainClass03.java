package day03.loop;

/*
 * 	3. for문
 * 	 초기식, 조건식, 증감식을 이용하여 반복적으로 코드 블록을 실행하는 제어문
 * 
 * 	for(초기식; 조건식; 증감식) {
 * 		반복 수행할 코드	
 * 	}
 * 
 * 	실행순서 : 초기식 -> 조건식 -> 반복수행코드 -> 증감식 -> 조건식 -> 반복수행코드 ... 조건식 false일때까지 반복
 */

public class MainClass03 {
	public static void main(String[] args) {
		// for문을 이용하여 0부터 9까지의 숫자를 출력하기
		for(int i = 0; i < 10; i++) {
			System.out.println(i);	// i 값을 출력하기
		}
		
		System.out.println();
		
		int count = 0;
		
		while(count < 10) {
			System.out.println(count);
			count++;
		}
		
	}
}
