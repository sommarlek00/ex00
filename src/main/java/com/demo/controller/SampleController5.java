package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SampleController5 {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController5.class);

	// 리다이렉트(Redirect) 와 RedirectAttributes 인터페이스 사용법
	
	// http://localhost:8081/controller/doM 접속 -> 리다이렉트 http://localhost:8081/controller/doN
	@RequestMapping("doM")
	// 메서드 리턴 타입이 String으로 하는 경우 : 1) jsp파일명을 매핑주소와 다르게 하고자 할 떄, 2) redirect 기능을 사용할 때
	public String doM(RedirectAttributes rttr) {
		// 스프링에서 제공하는 기능을 파라미터로 사용하는 경우, 내부적으로 스프링이 파라미터를 처리해주기 때문에
		// 별다른 처리 작업 코드 필요 없이 주소만 호출하면 된다
		
		// 데이터베이스 작업 (insert, update, delete 작업 등)
		
		// 데이터베이스 작업 후 진행되는 페이지
		// return "redirect:/매핑주소"
		// redirect를 사용하면 매핑주소는 jsp페이지가 아니다
		// "" 큰따옴표로 사용해야 하기 때문에 String 타입이어야함
		//return "redirect:/doN?idx=10"; // redirect 주소로 이동시켜주는 역할. jsp파일명이 필요 없다
		// doN 메서드가 int타입(기본데이터타입) 매개변수를 가지기 때문에 오류가 나지 않기 위해 주소에 값을 지정해줌
		
		rttr.addAttribute("title", "spring study");
		rttr.addAttribute("idx", 10);
		
		// RedirectAttributes 인터페이스를 매개변수로 사용
		return "redirect:/doN";
		
		// rttr.addAttribute("idx", 10); < 코드에 의해 redirect:/doN 자동으로 주소 뒤에 파라미터값이 붙는다
		// 최종적으로 http://localhost:8081/controller/doN?title=spring+study&idx=10 주소로 연결된다
	}
	
	// 해당 매핑주소를 위의  redirect에서 사용한다
	@RequestMapping("doN")
	public void doN(String title, int idx) {
		logger.info("리다이렉트 요청으로 진행됨");
		logger.info("글제목 : " + title);
		logger.info("글번호 : " + idx);
	}
	
	/****************************************************************/
	
	@RequestMapping("doO")
	public String doO(RedirectAttributes rttr) {
		
		// doP.jsp에서 doO에서 보낸 데이터를 참조. doN 메서드에서 설정한 msg키를 이용하여 "ok" 문자열 데이터 사용이 가능해짐
		// addFlashAttribute < 일회성 특징
		rttr.addFlashAttribute("msg", "ok"); // 리다이렉트되는 주소의  jsp에서 자바스크립트 구문에서 이용
		
		return "redirect:/doP";
	}
	 
	// http://localhost:8081/controller/doP 주소로 직접 들어가면
	// 전달받은 값이 없기 때문에 doP.jsp 파일에서 참조받는 데이터가 출력되지 않는다
	@RequestMapping("doP")
	public void doP() { // 파라미터 없음
		logger.info("리다이렉트 요청으로 진행됨");
	
	}
	
	
}
