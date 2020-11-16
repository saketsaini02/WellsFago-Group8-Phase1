package com.wf.training.spring.factory.service;

public class SmsService implements MessageService{

	@Override
	public String sendMessage(String message, String to) {
		return "Sms sent : " + message + "[To:" + to + "]";
	}

}
