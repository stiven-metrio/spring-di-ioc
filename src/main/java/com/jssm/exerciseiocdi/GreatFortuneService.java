package com.jssm.exerciseiocdi;

public class GreatFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You are going to be the fastest!";
	}

}
