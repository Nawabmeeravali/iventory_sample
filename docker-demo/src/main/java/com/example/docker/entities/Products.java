package com.example.docker.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "products")
public class Products {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long PK;
	
	private String P_CODE;
	
	


	public long getPK() {
		return PK;
	}


	public void setPK(long pK) {
		PK = pK;
	}


	public String getP_CODE() {
		return P_CODE;
	}


	public void setP_CODE(String p_CODE) {
		P_CODE = p_CODE;
	}


	
	
}
