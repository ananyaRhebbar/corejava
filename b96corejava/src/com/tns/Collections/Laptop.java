package com.tns.Collections;

public class Laptop implements Comparable<Laptop> {
	
	private String brand;
	private int price;
	private int ram;
	public String getBrand()    {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Laptop(String brand, int price, int ram) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", ram=" + ram + "]";
	}
	@Override
	public int compareTo(Laptop o) {
		// TODO Auto-generated method stub
		if(this.getRam()<o.getRam()) {
		return 0;
	}
		return price;
	}
}
	

