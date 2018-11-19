package com.apap.SI_IGD.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "poli")
public class KebutuhanObatModel implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_jenis_penanganan", referencedColumnName = "id", nullable = false)
	@OnDelete(action = OnDeleteAction.NO_ACTION)
	@JsonIgnore
	private JenisPenangananModel jenisPenanganan;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_obat", referencedColumnName = "id", nullable = false)
	@OnDelete(action = OnDeleteAction.NO_ACTION)
	@JsonIgnore
	private MedicalSuppliesModel medicalSupplies;
	
	@NotNull
	@Column(name = "jumlah", nullable = false)
    private int jumlah;
	
	@NotNull
	@Column(name = "harga", nullable = false)
    private long harga;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public JenisPenangananModel getJenisPenanganan() {
		return jenisPenanganan;
	}

	public void setJenisPenanganan(JenisPenangananModel jenisPenanganan) {
		this.jenisPenanganan = jenisPenanganan;
	}

	public MedicalSuppliesModel getMedicalSupplies() {
		return medicalSupplies;
	}

	public void setMedicalSupplies(MedicalSuppliesModel medicalSupplies) {
		this.medicalSupplies = medicalSupplies;
	}

	public int getJumlah() {
		return jumlah;
	}

	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}

	public long getHarga() {
		return harga;
	}

	public void setHarga(long harga) {
		this.harga = harga;
	}

	
}
	
	
	
	