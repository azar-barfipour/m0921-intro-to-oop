package com.m0921;

public class Car {

	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	//default constructor
	public Car(){
		doors = "closed";
		driver = "seated";
		engine = "on";
		speed = 5;
	}
	
	//parameterized constructor
	public Car(String doors, String engine, String driver, int speed) {
		this.doors = doors;
		this.driver = driver;
		this.engine = engine;
		this.speed = speed;
	}
	
	public String getDoors() {
		return doors;
	}

	public String getEngine() {
		return engine;
	}

	public String getDriver() {
		return driver;
	}

	public int getSpeed() {
		return speed;
	}

	
	public String run() {
		if(doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed > 0) {
			return "running";
		}else {
			return "not running";
		}
	}
	
	
	
}
