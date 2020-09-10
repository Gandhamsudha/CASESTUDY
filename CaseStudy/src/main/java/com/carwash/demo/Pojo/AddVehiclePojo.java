package com.carwash.demo.Pojo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "VehicleAdd")
public class AddVehiclePojo {

	private String email;
	private String vehiclenumber;
	private String brand;
	private String vehicleModel;
	
	public AddVehiclePojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddVehiclePojo(String email, String vehiclenumber, String brand, String vehicleModel) {
		super();
		this.email = email;
		this.vehiclenumber = vehiclenumber;
		this.brand = brand;
		this.vehicleModel = vehicleModel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVehiclenumber() {
		return vehiclenumber;
	}

	public void setVehiclenumber(String vehiclenumber) {
		this.vehiclenumber = vehiclenumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	@Override
	public String toString() {
		return "VehicleAdd [email=" + email + ", vehiclenumber=" + vehiclenumber + ", brand=" + brand
				+ ", vehicleModel=" + vehicleModel + "]";
	}
}
