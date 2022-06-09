package com.food.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Order")
public class Order {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="itemname")
	 private String itemname;
	@Column(name="quantity")
	 private int quantity;
	@Column(name="totalprice")
	 private int totalprice;
	@Column(name="adress")
	  private String adress;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemname;
	}
	public void setItemName(String itemName) {
		this.itemname = itemName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getTotalPrice() {
		return totalprice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalprice = totalPrice;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public Order(int id, String itemName, int quantity, int totalPrice, String adress) {
		super();
		this.id = id;
		this.itemname = itemName;
		this.quantity = quantity;
		this.totalprice = totalPrice;
		this.adress = adress;
	}
	public Order() {
	 
}
}
