package com.vitormp.java7;

import java.util.Objects;


public class Book {

	private Integer id;
	private String name;
	private Integer totalPages;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(obj instanceof Book){
			Book other = (Book)obj;
			return Objects.equals(this.getId(), other.getId()) &&
					Objects.equals(this.getTotalPages(), other.getTotalPages());
		}
		return false;
	}

	public int hashCode(){
		return Objects.hash(this.getId(), this.getTotalPages());
	}
}
