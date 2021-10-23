package polymorphism.devices;

import javax.annotation.Resource;
//import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Autowired;

//@Component("tv")
public class LgTV implements TV{	
	//@Resource -> 자동주입시 이름을 이용한 주입방식
	
	@Autowired
//	@Resource(name = "apple")
	private Speaker speaker;
			
	public LgTV() {
		super();
		System.out.println("LgTV 생성1");
	}
	public LgTV(Speaker speaker, int price) {
		System.out.println("LgTV 생성2");
		this.speaker = speaker;
		this.price = price;		
	}
	private int price;
	
	@Override
	public void test() {
		showPrice();
		powerOn();
		powerOff();
		volumeUp();
		volumeDown();
	}	
	@Override
	public void showPrice() {
		System.out.println("가격 = " + price);
	}
	@Override
	public void powerOn() {
		System.out.println("엘지티비 켜기");		
	}
	@Override
	public void powerOff() {
		System.out.println("엘지티비 끄기");		
	}
	@Override
	public void volumeUp() {
		System.out.println("엘지티비 소리 높이기");		
	}
	@Override
	public void volumeDown() {
		System.out.println("엘지티비 소리 낮추기");
	}
}
