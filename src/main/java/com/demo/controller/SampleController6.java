package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.domain.ProductVO;

// ctrl+shift+o : 사용하지 않는 패키지(import문) 제거하는 단축키

@Controller
public class SampleController6 {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController6.class);
	
	// 객체를 JSON 형식으로 변환하여, 클라이언트에게 보내는 작업
	// JSON은 "키"(문자열):값 으로 구성되어 있다
	// 주로 ajax 기능에서 사용
	
	/*
	  1) 객체를 JSON 데이터 형식으로 변환 : Jackson Databind 라이브러리
	  2) JSON데이터를 클라이언트에게 보내는 작업 : @ResponseBody
	 */

	// 리턴값이 void, String 이면 jsp 파일이 동작 
	// 클래스를 리턴타입으로 설정
	// http://localhost:8081/controller/doJSON
	@RequestMapping("/doJSON") // / 을 넣으면 절대경로, 없으면 상대경로
	public @ResponseBody ProductVO doJSON() {
		
		ProductVO vo = new ProductVO("사과", 10000);
		
		// vo -> JSON 변환. Jackson Databind 라이브러리가 작업
		// JSON 데이터타입 참고 : https://www.w3schools.com/js/js_json_datatypes.asp
		/*
		 {"name":"사과","price":10000.0} // 서버측에서 클라이언트로 보내는 정보
		 */
		
		return vo;
	}

}
