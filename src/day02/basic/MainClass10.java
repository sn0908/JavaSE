package day02.basic;

/*
 *  [[ 리터럴 ]]
 *   변수에 할당되거나, 연산에 사용되며 이미 결정된 값
 *   ** 우리가 직적 쓴 값을 리터럴이라고 이해하면 됨
 * 	 고정된 값
 * 
 * 	 숫자 예) 10, 10.1
 * 	 문자 예) 'H', '글'
 * 
 * 	[[ 특수문자 리터럴 - 이스케이프문자 ]]
 * 	 1. \n : 줄바꿈(개행)
 * 	 2. \t : 탭기능
 * 	 3. \\ : \를 문자화
 * 	 4. \' : '를 문자화
 * 	 5. \" : "를 문자화
 */

public class MainClass10 {
	public static void main(String[] args) {
		String str1 = "\"JavaStudy\"";
		System.out.println(str1);
		
		String str2 = "안녕하세요. \n \'홍길동\' 입니다.\n \t 반갑습니다.";
		System.out.println(str2);
	}
}
