package day08.exception;

/*
 * [[ Exception 종류 ]]
 * 	1. Checked Exception
 * 		컴파일 시 반드시 try ~ catch로 처리해야 한다.
 * 
 * 	2. UnChecked Exception
 * 		try ~ catch로 처리하지 않아도 컴파일 시 에러가 발생하지 않는다. (선택적 처리)
 * 
 */

public class MainClass04 {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);

			try {
				Thread.sleep(1000);	//	1초 일시정지
			} catch (InterruptedException e) {
				System.out.println("예외 발생");
			}
				
		}
	}
}

