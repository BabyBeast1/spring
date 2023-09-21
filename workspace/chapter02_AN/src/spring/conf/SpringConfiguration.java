package spring.conf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sample01.MessageBeanImpl;
import sample02.CalcAdd;
import sample02.CalcMul;
import sample04.SungJukDTO2;

@Configuration
public class SpringConfiguration {

	//빈 생성
	/*
	 * @Bean public MessageBeanImpl messageBeanImpl(){ return new
	 * MessageBeanImpl("사과"); }
	 */
	
	@Bean(name = "messageBeanImpl")
	public MessageBeanImpl getMessageBeanImpl(){
		return new MessageBeanImpl("사과");
	}
	
	@Bean
	public CalcAdd calcAdd(){
		return new CalcAdd(25, 36);
	}
	
	@Bean(name="calcMul")
	public CalcMul calcMul() {
		return new CalcMul();
	}

	//sample04
	@Bean
	public List<SungJukDTO2> arrayList(){
		return new ArrayList<SungJukDTO2>();
	}
	
}

/*
@Bean
- 메소드에서 return 되는 값을 스프링 빈으로 생성해준다.
- 메소드의 이름은 반드시 빈의 id명으로 만들어야 한다.
 */