package com.apap.SI_IGD.model;

import java.io.Serializable;

public class DokterModel implements Serializable {

	private long id;
	private String nama;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
}