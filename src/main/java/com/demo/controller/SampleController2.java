package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController2 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
	
	// 요청주소와 jsp 파일명이 다른 경우 메서드의 리턴 타입을 String 으로 해야한다
	// http://localhost:8081/controller/doD  jsp파일명은 testD.jsp
	@RequestMapping("doD") // 매핑주소이름 설정
	public String doD() {
		return "testD"; // 리턴 값을 호출할 jsp 파일명으로 한다
	}
	
	// http://localhost:8081/controller/doE   testE.jsp
	@RequestMapping("doE")
	public String doE() {
		return "testE";
	}
	
	// http://localhost:8081/controller/doF   testF.jsp
	@RequestMapping("doF")
	public String doF() {
		return "testF";
	}
	
}
