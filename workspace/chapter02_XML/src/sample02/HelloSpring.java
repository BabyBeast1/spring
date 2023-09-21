package sample02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Calc calc = applicationContext.getBean("calcAdd", CalcAdd.class);
		calc.calculate();
		ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("applicationContext.xml");
		Calc calc1 = applicationContext1.getBean("calcMul", CalcMul.class);
		calc1.calculate();
	}

}
