package polymorphism;

import polymorphism.devices.LgTV;
import polymorphism.devices.SamsungTV;

public class BeanFactory {
	public Object getBean(String beanName) {
		if(beanName.equals("sam")) {
			return new SamsungTV();
		} else if(beanName.equals("lg")) {
			return new LgTV();
		}
		return null;
	}
}
