package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@Table(name = "cartitemstable")
@NoArgsConstructor
public class CartItem extends BaseEntity {
//quantity , totalPrice , cart , product
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "totalPrice")
	private double totalPrice;
	
	@OneToOne
	private Menu item;
	
	@ManyToOne
	@JoinColumn(name = "cartId")
	private Cart cart;
	
	public CartItem(int quantity, double totalPrice, Menu item, Cart cart) {
		  super();
		  this.quantity = quantity;
		  this.totalPrice = totalPrice;
		  this.item = item;
		  this.cart = cart;
		 }
	
	
	
}
