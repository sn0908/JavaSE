package day07.mypac;

public class SlidePhone extends Phone {
	
	public SlidePhone() {
		this.model = "슬라이드 전화기";
	}
	
	public void sendMessage() {
		new CellPhone().sendMessage(); // 1회성이다. 주소값이 없으니
	}
	
	void telecomInternet() {
		System.out.println("통신사 인터넷 가능!");
	}
}
