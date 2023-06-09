package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.domain.MemberVO;

@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	// 로그인 페이지
	@RequestMapping("login") // http://localhost:8081/controller/login -> login.jsp 실행
	public void loginPage() {
		logger.info("로그인 페이지");
	}
	
	// 로그인 처리
	/* 개별파라미터 사용
	@RequestMapping("loginOK")
	public void loginOK(String userid, String passwd) { // login.jsp 폼의 name과 일치해야한다

		logger.info("아이디는? " + userid);
		logger.info("비밀번호는? " + passwd);
	}
	*/
	
	// 파라미터로 VO클래스 사용
	@RequestMapping("loginOK")
	public void loginOK(MemberVO vo) {
		logger.info("로그인 정보? " + vo); // vo.toString()
		
	
	}

}