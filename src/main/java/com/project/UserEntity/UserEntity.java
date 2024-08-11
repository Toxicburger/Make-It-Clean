package com.project.UserEntity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="user_details")
@EntityListeners(AuditingEntityListener.class)
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;
	
	@Column(name="first_name")
	private String firstName;
	
	
	@Column(name="last_name")
	private String lastName;
	
	
	@Column(name="email")
	private String email;
	
	
	@Column(name="password")
	private String password;
	
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	
	@Column(name="pin_code")
	private int pinCode;
	
	
	@Column(name="city")
	private String city;
	
	@CreatedDate
	@Column(name="created_at")
	private LocalDateTime createdAt;
	
	 @LastModifiedDate
	@Column(name="updated_at")
	private LocalDateTime updatedAt;
	
	
	@Transient
	private String tempCol1;
	
	
	@Transient
	private String tempCol2;
	
	
	@Transient
	private String tempCol3;


	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserEntity(int userId, String firstName, String lastName, String email, String password, String phoneNumber,
			int pinCode, String city, LocalDateTime createdAt, LocalDateTime updatedAt, String tempCol1,
			String tempCol2, String tempCol3) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.pinCode = pinCode;
		this.city = city;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.tempCol1 = tempCol1;
		this.tempCol2 = tempCol2;
		this.tempCol3 = tempCol3;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public int getPinCode() {
		return pinCode;
	}


	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}


	public String getTempCol1() {
		return tempCol1;
	}


	public void setTempCol1(String tempCol1) {
		this.tempCol1 = tempCol1;
	}


	public String getTempCol2() {
		return tempCol2;
	}


	public void setTempCol2(String tempCol2) {
		this.tempCol2 = tempCol2;
	}


	public String getTempCol3() {
		return tempCol3;
	}


	public void setTempCol3(String tempCol3) {
		this.tempCol3 = tempCol3;
	}


	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", password=" + password + ", phoneNumber=" + phoneNumber + ", pinCode=" + pinCode + ", city="
				+ city + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", tempCol1=" + tempCol1
				+ ", tempCol2=" + tempCol2 + ", tempCol3=" + tempCol3 + "]";
	}
	
	
	
}
