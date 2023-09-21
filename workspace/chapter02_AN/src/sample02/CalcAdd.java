package sample02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class CalcAdd implements Calc {
	
	private int x,y;
	
	public CalcAdd(@Value("25") int x,@Value("36") int y) {
		super();
		System.out.println("CalcAdd 생성자");
		this.x = x;
		this.y = y;
	}

	@Override
	public void calculate() {
		System.out.println(x + "+" + y + "= " + (x+y));

	}

}
