package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection= "Hotels")
public class Hotel {
	@Id
	private String id;
	private String name;
	@Indexed(direction =IndexDirection.ASCENDING)
	private int pricePerNight;
	private Address addres;
	private List<Review> reviews;
	protected Hotel() {
		this.reviews = new ArrayList<>();
	}
	public Hotel(String name, int pricePerNight, Address addres, List<Review> reviews) {
		this.name= name;
		this.pricePerNight = pricePerNight;
		this.addres = addres;
		this. reviews = reviews;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPricePerNight() {
		return pricePerNight;
	}
	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	public Address getAddres() {
		return addres;
	}
	public void setAddres(Address addres) {
		this.addres = addres;
	}
	public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	
}
