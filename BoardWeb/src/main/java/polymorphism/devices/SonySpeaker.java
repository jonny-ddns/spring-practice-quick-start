package polymorphism.devices;

import org.springframework.stereotype.Component;

//@Component
@Component("sony")
public class SonySpeaker implements Speaker {	
	public SonySpeaker() {
		System.out.println("SonySpeaker 생성");
	}
	
	@Override
	public void volumeTest() {
		volumeUp();
		volumeDown();
	}
	@Override
	public void volumeUp() {
		System.out.println("소니 스피커 소리 up");		
	}
	@Override
	public void volumeDown() {
		System.out.println("소니 스피커 소리 down");		
	}
}
