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
public class PenangananPasienModel implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pasien", referencedColumnName = "id", nullable = false)
	@OnDelete(action = OnDeleteAction.NO_ACTION)
	@JsonIgnore
	private PasienModel pasien;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_dokter", referencedColumnName = "id", nullable = false)
	@OnDelete(action = OnDeleteAction.NO_ACTION)
	@JsonIgnore
	private DokterModel dokter;
	
	@NotNull
	@Column(name = "waktu_masuk", nullable = false)
	private Date waktu_masuk;
	
	@NotNull
	@Column(name = "waktu_update", nullable = false)
	private Date waktu_update;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_status", referencedColumnName = "id", nullable = false)
	@OnDelete(action = OnDeleteAction.NO_ACTION)
	@JsonIgnore
	private StatusModel status;
	
	@NotNull
	@Size(max = 255)
	@Column(name = "keterangan", nullable = false)
	private String keterangan;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_poli", referencedColumnName = "id", nullable = false)
	@OnDelete(action = OnDeleteAction.NO_ACTION)
	@JsonIgnore
	private PoliModel poli;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public PasienModel getPasien() {
		return pasien;
	}

	public void setPasien(PasienModel pasien) {
		this.pasien = pasien;
	}

	public DokterModel getDokter() {
		return dokter;
	}

	public void setDokter(DokterModel dokter) {
		this.dokter = dokter;
	}

	public Date getWaktu_masuk() {
		return waktu_masuk;
	}

	public void setWaktu_masuk(Date waktu_masuk) {
		this.waktu_masuk = waktu_masuk;
	}

	public Date getWaktu_update() {
		return waktu_update;
	}

	public void setWaktu_update(Date waktu_update) {
		this.waktu_update = waktu_update;
	}

	public StatusModel getStatus() {
		return status;
	}

	public void setStatus(StatusModel status) {
		this.status = status;
	}

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}

	public PoliModel getPoli() {
		return poli;
	}

	public void setPoli(PoliModel poli) {
		this.poli = poli;
	}
	
	
}