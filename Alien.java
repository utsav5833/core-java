package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Alien {
	private int aid;
	private String Name;
	private String Food;
@Autowired  
	private laptop laptop;
	public laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(laptop laptop) {
		this.laptop = laptop;
	}

	public int getAid() {
		return aid;
	}
	
	public Alien() {
		super();
		System.out.println("object created");
	}

	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getFood() {
		return Food;
	}
	public void setFood(String food) {
		Food = food;
	}
	public void show()
	{
		System.out.println("In a show method");
		laptop.compile();
	}

}
