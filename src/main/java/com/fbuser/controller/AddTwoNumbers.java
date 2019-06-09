package com.fbuser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddTwoNumbers {
	@RequestMapping(value="/addTwo")
public String addition(@RequestParam("num1") int number1,@RequestParam("num2") int number2,Model model){

		System.out.println("addition success");
	System.out.println("number1 is"+number1);
	System.out.println("number2 is"+number2);
	int sum=number1+number2;
	System.out.println("the sum is"+sum);
	model.addAttribute("addition",sum);
	model.addAttribute("message","the addition of two is");
	return "profile";
}
}
