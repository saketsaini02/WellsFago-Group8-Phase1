package com.wf.training.spring.factory.service;

import org.springframework.stereotype.Component;

// @Component
public class ProfessionalFortune implements FortuneService{

	@Override
	public String dailyFortune() {
		// TODO Auto-generated method stub
		return "Boss is going to get impressed by your work today";
	}

	
}
