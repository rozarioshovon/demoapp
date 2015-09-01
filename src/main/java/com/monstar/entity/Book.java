package com.monstar.entity;

public class Book {
	private int id;
	private String name;
	private String isbnNumber;
	private String coverImageName;
	private int numberOfCopies;
	private Category category;
	
	
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
	public String getIsbnNumber() {
		return isbnNumber;
	}
	public void setIsbnNumber(String isbnNumber) {
		this.isbnNumber = isbnNumber;
	}
	public String getCoverImageName() {
		return coverImageName;
	}
	public void setCoverImageName(String coverImageName) {
		this.coverImageName = coverImageName;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
}