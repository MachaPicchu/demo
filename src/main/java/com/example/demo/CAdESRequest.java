package com.example.demo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CAdESRequest extends Exception {

	@NotEmpty(message = "bos olamaz")
	@NotNull(message = "null olamaz")
	private byte[] imzaliVeri;

	public byte[] getImzaliVeri() {
		return imzaliVeri;
	}

	public void setImzaliVeri(byte[] imzaliVeri) {
		this.imzaliVeri = imzaliVeri;
	}

}
