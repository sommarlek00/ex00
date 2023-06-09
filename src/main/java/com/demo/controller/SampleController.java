package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 1) 가장 먼저 콘트롤러 import 작업
@Controller

public class SampleController {
	//controller 기능을 가지는 클래스는 com.demo.controller 내에서만 만들어야 한다

	// SampleController 클래스 동작시 기록을 담당할 로그객체 생성구문
	// 2) 로그 객체 작업(필수는 아님). HomeController 에서 복사해서 사용하는 클래스로 이름만 변경
	// ex) Logger.info()와 같은 작업을 수행해서 현재 상태를 알아보기 위해 사용하는 목적
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	//jsp 작업할 때는 톰캣이 동작 중이어도 괜찮지만 java 파일 작업할 때는 톰캣을 중지시키기
	
	// 스프링 mvc에서는 jsp 파일을 직접 호출하지 않고 메서드로 동작시킴
	// 요청할 때 사용하는 annotation @RequestMapping("브라우저에서 사용할 요청 매핑주소")
	// 매핑주소와 메서드 이름은 같지 않아도 된다
	// 브라우저에서 해당 주소로 들어가면 http://localhost:8081/controller/doA
	// doA 메서드가 호출되어 doA.jsp파일(매핑주소와 같은 이름)이 호출되고 console에 정보가 출력됨
	// 매핑주소이름 = jsp 파일 이름
	// 동작순서 : (클라이언트)매핑주소 요청 -> 메서드 실행 -> jsp파일 동작
	
	// 요청주소와 jsp 파일명이 같은 경우
	// 매핑이름과 jsp파일명이 동일한 경우 메서드의 리턴타입을 void로 한다
	// 메서드 리턴타입이 void 이면 매핑주소가 jsp파일 주소이다
	@RequestMapping("doA") // 매핑주소. 클라이언트에서 스프링의 메서드를 호출하는 목적으로 사용
	public void doA() {
		logger.info("doA called...");
	}
	
	// servlet-context.xml 파일에서 경로가 작업되어 있음
	// /WEB-INF/views/ + doA + .jsp -> /WEB-INF/views/doA.jsp 이렇게 위치를 찾아감
	
	@RequestMapping("doB")
	public void doB() {
		logger.info("doB called...");
	}
	
	@RequestMapping("doC")
	public void doC() {
		logger.info("doC called...");
	}
}
