package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import polymorphism.devices.TV;

/*
 * 실행 절차
 * TVUser 클라이언트가 스프링 설정파일을 로딩하여 스프링 컨테이너 구동
 * 스프링 설정파일에 빈으로 등록된 삼성티비 객체를 생성함
 * 겟빈 메서드로 이름이 tv 인 객체를 요청한다 -> lookup
 * 생성된 삼성티비 객체 반환
 */
public class TVUser {
	public static void main(String[] args) {			
		//스프링 컨테이너 등록하기
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
	
		//BeanFactory 로 객체 생성하기
		//스프링 컨테이너로부터 필요한 객체를 요청하기
//		BeanFactory beanFactory = new BeanFactory();
//		TV tv = (TV) beanFactory.getBean("tv");
//		tv.test();
		
		//xml 설정으로 객체 가져오기
		TV tv = (TV) factory.getBean("tv");
		tv.test();
		
		//스프링 컨테이너 종료 
		factory.close();
	}
}
