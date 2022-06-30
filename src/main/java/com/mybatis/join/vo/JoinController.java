package com.mybatis.join.vo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JoinController {
	
	@Autowired
	private MybatisDAO mybatisDAO; 
	
	@RequestMapping ("/alljoinList.do")
	public String selectList (JoinVO2 vo , Model model) {
		System.out.println("��Ʈ�ѷ� ȣ�� ���� : /alljoinList.do");
		List<JoinVO2> joinListVO2 = mybatisDAO.selectListJoinVO2(vo); 		
		System.out.println("���̹�Ƽ���� ���� List��ü ���� ���� ");
		
		
		JoinVO2 joinVO =  joinListVO2.get(0); 
		JoinVO2 joinVO1 = joinListVO2.get(1);
		JoinVO2 joinVO2 = joinListVO2.get(2);
		
		System.out.println(joinVO.toString());
		System.out.println(joinVO1.toString());
		System.out.println(joinVO2.toString());
				
		
		model.addAttribute("alljoinList", joinListVO2); 
		
		return "allJoinList.jsp"; 
	}
		
	

}
