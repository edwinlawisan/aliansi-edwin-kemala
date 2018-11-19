package com.apap.SI_IGD.model;

import java.io.Serializable;


public class MedicalSuppliesModel implements Serializable {

	private long id;
	private String nama;
	private long price;
	private int jumlah;
	private int id_jenis_medical_supplies;
	private String deskripsi;

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

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public int getJumlah() {
		return jumlah;
	}

	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}

	public int getId_jenis_medical_supplies() {
		return id_jenis_medical_supplies;
	}

	public void setId_jenis_medical_supplies(int id_jenis_medical_supplies) {
		this.id_jenis_medical_supplies = id_jenis_medical_supplies;
	}

	public String getDeskripsi() {
		return deskripsi;
	}

	public void setDeskripsi(String deskripsi) {
		this.deskripsi = deskripsi;
	}
	
	
}