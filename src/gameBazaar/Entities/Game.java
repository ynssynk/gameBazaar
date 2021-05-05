package gameBazaar.Entities;

import gameBazaar.Abstract.Entity;

public class Game implements Entity{
	private int id;
	private String name;
	private double price;
	public Game() {}
	public Game(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
