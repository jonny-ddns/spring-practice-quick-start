package polymorphism.devices;

import org.springframework.stereotype.Component;

@Component("apple")
public class AppleSpeaker implements Speaker {	
	public AppleSpeaker() {
		System.out.println("AppleSpeaker 생성");
	}
	
	@Override
	public void volumeTest() {
		volumeUp();
		volumeDown();		
	}
	@Override
	public void volumeUp() {		
		System.out.println("애플 스피커 소리 up");
	}
	@Override
	public void volumeDown() {		
		System.out.println("애플 스피커 소리 up");
	}
}
