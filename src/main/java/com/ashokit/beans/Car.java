package com.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	@Autowired
private Engine engine;
	public void generateEngine()
	{
		System.out.println("generate engine for car...");
		engine.providingEngine();
		//changes for HIS-263
	}
	
	
}
