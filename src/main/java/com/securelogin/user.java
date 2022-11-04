package com.securelogin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class user {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int uId;
	private String username;
	private String uPassword;
	private boolean uActive;
	private String uRole;
	public boolean isuActive() {
		return uActive;
	}
	public void setuActive(boolean uActive) {
		this.uActive = uActive;
	}
	
}
