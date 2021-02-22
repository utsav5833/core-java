package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class laptop
{
	
	private String brand;
	private int id;
	private int ram;
	
	@Override
	public String toString() {
		return "laptop [brand=" + brand + ", id=" + id + ", ram=" + ram + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public void compile()
	{
		System.out.println("Compileling");
	}
	
	
}
