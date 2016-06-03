package com.example.form.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;

import com.example.form.validator.MobileNumber;

public class User {
	public interface FormOne {
	}

	public interface FormTwo {
	}

	@NotBlank(groups = FormOne.class)
	private String firstname;

	@NotBlank(groups = FormOne.class)
	private String lastname;
	@NotBlank(groups = FormOne.class)
	private String email;

	@Min(value=18,groups = FormOne.class,message="${validatedValue} is not grater than {value}")
	@Max(value=100,groups = FormOne.class)
	private int age;

	@NotBlank(groups = FormOne.class)
	private String gender;
	// fields to validate in form two
	@NotBlank(groups = FormTwo.class)
	private String state;

	@NotBlank(groups = FormTwo.class)
	private String city;

	@NotBlank(groups = FormTwo.class)
	private String country;

	@NotBlank(groups = FormTwo.class)
	@MobileNumber(groups = FormTwo.class)
	private String mobileNumber;
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
