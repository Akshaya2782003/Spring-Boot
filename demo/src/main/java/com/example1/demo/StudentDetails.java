package com.example1.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentDetails
{
	@JsonProperty("id")
	private int rollno;
	@JsonIgnore
	private String name;
	private int rank;
	public StudentDetails(int rollno, String name, int rank) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.rank = rank;
	}
	
}
