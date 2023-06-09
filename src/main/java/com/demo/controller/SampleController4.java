package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.domain.ProductVO;

@Controller
public class SampleController4 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController4.class);
	
	// 파라미터에 @ModelAttribute 어노테이션 사용
	// 일반적으로는 ModelAttribute 이름과 파라미터명을 일치하여 사용한다
	// 파라미터의 값을 jsp에서 참조하고자 할 경우
	
	// http://localhost:8081/controller/doJ?name=홍길동&age=100
	@RequestMapping("doJ")
	// 매개변수로 들어온 값을 testJ.jsp 파일에서 "name" 의 이름으로 사용할 목적
	public String doJ(@ModelAttribute("name") String name,@ModelAttribute("age") int age) {
		logger.info("이름은?" + name);
		logger.info("나이는?" + age);
		return "testJ"; // testJ.jsp 에서 매개변수의 값을 사용하고자 할 경우
	}
	
	// 파라미터를 제공해도 파라미터 값을 ModelAttribute로 사용하지 않으면 jsp에서 참조가 안된다
	// http://localhost:8081/controller/doK?name=홍길동&age=100
	
	@RequestMapping("doK")
	public String doK(String name,int age) {
		logger.info("이름은?" + name);
		logger.info("나이는?" + age);
		return "testK";
	}
	
	// ProductVO.java 클래스 먼저 구성 할 것
	// 일반 파라미터는 클라이언트로부터 넘어오지만,
	// Model model 파라미터는 클라이언트에서 정보를 제공하는 것이 아니라, 스프링 자체에서 처리를 해준다
	// http://localhost:8081/controller/doL
	@RequestMapping("doL")
	// 생성된 객체의 정보를 jsp에서 사용하고자 할 때 메서드의 매개변수로 Model(데이터 전달자) 을 사용한다
	// Model 객체 : 메서드 안의 데이터(객체)를 뷰에 전달하는 기능을 제공
	public String doL(Model model) { // Model은 스프링 내부에서 쓰는 파라미터 (객체의 데이터를 jsp에서 사용하는 용도)
				
		// 객체, 데이터 생성. 실제 작업은 DB에서 읽어오게 됨
		ProductVO product = new ProductVO("사과", 10000); // ProductVO 객체 생성
		
		logger.info("상품정보는: " + product); // product.toString(). toString이 자동으로 호출된다
		
		// 작업. jsp에서 사용이 가능해진다
		//					jsp에서사용할이름,객체이름
		model.addAttribute("pdt", product); // model.addAttribute("jsp에서 참조할 객체 이름", product);
		
		return "productInfo"; // jsp파일명
		
		// 뷰(view) : 화면 작업. 뷰 작업을 할 때 jsp언어를 사용. 스프링부트는 타임리프를 사용
	}
	
}
