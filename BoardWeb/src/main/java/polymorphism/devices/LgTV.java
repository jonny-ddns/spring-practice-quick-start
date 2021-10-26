package polymorphism.devices;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component("lgtv")
public class LgTV implements TV {	
	//@Resource -> 자동주입시 이름을 이용한 주입방식
	
	@Autowired
	@Resource(name = "apple")
//	@Resource(name = "sony")
	private Speaker speaker;
	private int price;
			
	public LgTV() {
		super();
		System.out.println("LgTV 생성1");
	}
	public LgTV(Speaker speaker, int price) {
		System.out.println("LgTV 생성2");
		this.speaker = speaker;
		this.price = price;		
	}
	
	@Override
	public void test() {
		System.out.println(this.toString() + " 테스트");
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
		speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
}
