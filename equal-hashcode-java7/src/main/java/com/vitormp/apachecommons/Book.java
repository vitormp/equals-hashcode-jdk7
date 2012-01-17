package com.vitormp.apachecommons;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

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
			return new EqualsBuilder()
						.append(this.getId(), other.getTotalPages())
						.append(this.getTotalPages(), other.getTotalPages())
						.isEquals();
		}
		return false;
	}

	public int hashCode(){
		return new HashCodeBuilder()
					.append(this.getId())
					.append(this.getTotalPages())
					.toHashCode();
	}
}
