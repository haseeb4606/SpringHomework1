package homework1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainResult {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		Driver dr = (Driver) ctx.getBean("drvr");
		dr.driverInfo();

	}

}
