package day07.mypac;

public class Jindo extends Dog {
	
	public Jindo() {
		super("백구");	// 부모생성자를 뜻한다.
						// 자식 생성자 첫줄 위치해야 한다.
		System.out.println("진도개입니다.");
	}
	
	public void special() {
		System.out.println(owner + "한 주인만 섬긴다.");
	}
}
