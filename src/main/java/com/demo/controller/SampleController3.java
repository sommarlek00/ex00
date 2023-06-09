package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController3 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController3.class);
	
	// 파라미터(매개변수)가 있는 메서드 호출
	//										?매개변수명=값&매개변수명=값 (띄어쓰기가 들어가면 안됨)
	// 										+(물음표 뒤의 문자열을 쿼리 스트링QueryString이라고 함)
	// http://localhost:8081/controller/doG?name=abc&age=100 클라이언트에서 제공하는 주소값
	// http://localhost:8081/controller/doG?age=10 기본데이터타입 매개변수만 입력한 경우 에러발생 x
	@RequestMapping("doG")
	public String doG(String name, int age) { 
		logger.info("이름은?" + name);
		logger.info("나이는?" + age);
		return "testG";
	}
	
	// http://localhost:8081/controller/doH 로 들어가도 testH.jsp 파일을 찾음.
	// 매개변수가 참조타입인 경우에는 매개변수 값을 제공하지 않아도 에러 발생 x
	@RequestMapping("doH")
	public String doH(String name) { // 매개변수가 String (참조 데이터타입에서는 매개변수를 입력하지 않으면 null로 넘어간다)
		logger.info("이름은?" + name);
		return "testH";
	}
	
	// http://localhost:8081/controller/doI
	// 매개변수가 기본데이터 타입인 경우에는 매개변수 값을 제공하지 않으면 오류가 남 (기본데이터 타입에는  null 개념이 없기 때문)
	// http://localhost:8081/controller/doI?age=100
	@RequestMapping("doI")
	public String doI(int age) { // 매개변수가 int (기본 데이터타입). 반드시 값을 입력해야 한다.
		logger.info("나이는?" + age);
		return "testI";
	}
}
