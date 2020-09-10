package com.carwash.demo.Pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="bookwashservice")
public class DailyTasksPojo {

	@Id
	private String location;
	private String date;
	
	
	public DailyTasksPojo() {
		super();
		
	}
	
	public  DailyTasksPojo(String location, String date) {
		super();
		this.location = location;
		this.date = date;
		//this.time = time;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	
	@Override
	public String toString() {
		return "Bookwashservice [location=" + location + ", date=" + date + "]";
	}
}
