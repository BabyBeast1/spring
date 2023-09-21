package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value="/hello.do", method=RequestMethod.GET)
	public ModelAndView hello(){ //사용자 콜백 메소드
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", "Hello Spring MVC!!");
		
		//mav.setViewName("hello"); // jsp의 파일 -> /view/hello.jsp
		mav.setViewName("/view/hello");
		
		return mav;
	}
	
	//URL에서 바로 JSP가 실행되지 않게 하기 위해서 /WEB-INF 에 JSP 파일을 작성한다.
	//http://localhost:8080/chapter06/WEB-INF/view/hello2.jsp 실행 할 수 없다
	@RequestMapping(value="/hello2.do", method=RequestMethod.GET)
	public ModelAndView hello2() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("result2", "Have a nice day!!");
		
		mav.setViewName("/WEB-INF/view2/hello2");
		
		return mav;
	}
	
	/*
	 * 스프링에서 리턴 타입이 String 이면 단순 문자열이 아니라, jsp 파일명으로 인식한다.
	 * welcome.jsp 파일을 찾게 된다.
	 * 만약에 단순 문자열로 처리 하고 싶으면 @ResponseBody 를 써야한다.
	 */
	@RequestMapping(value="/hello3.do", method=RequestMethod.GET, produces = "text/html; charset=UTF-8")
	@ResponseBody
	public String hello3() {
		// return "welcome";
		return "안녕하세요";
	}
}









