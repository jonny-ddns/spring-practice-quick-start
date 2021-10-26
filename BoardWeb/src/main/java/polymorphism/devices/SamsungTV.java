package polymorphism.devices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("samtv")
public class SamsungTV implements TV {
	
	//@Autowired ; 지정된 타입의 객체를 찾아서 자동으로 주입하는 코드
	//@Resource ; 지정된 이름의 객체를 찾아서 자동으로 주입
	//@Qualifier ; 의존성 주입시 특정객체의 아이디 혹은 이름을 이용해 명시하기
	@Autowired
//	@Qualifier("sony")
	@Qualifier("apple")
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		super();
		System.out.println("SamsungTV 생성1");
	}

	public SamsungTV(Speaker speaker, int price) {
		System.out.println("SamsungTV 생성2");
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
		System.out.println("삼성티비 켜기");				
	}
	@Override
	public void powerOff() {
		System.out.println("삼성티비 끄기");			
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
