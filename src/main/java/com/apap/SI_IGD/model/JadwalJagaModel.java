package com.apap.SI_IGD.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "jadwal_jaga")
public class JadwalJagaModel implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_dokter", referencedColumnName = "id", nullable = false)
	@OnDelete(action = OnDeleteAction.NO_ACTION)
	@JsonIgnore
	private DokterModel dokter;
	
	@NotNull
	@Column(name = "status", nullable = false)
	private int status;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_hari", referencedColumnName = "id", nullable = false)
	@OnDelete(action = OnDeleteAction.NO_ACTION)
	@JsonIgnore
	private HariModel hari;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_shift", referencedColumnName = "id", nullable = false)
	@OnDelete(action = OnDeleteAction.NO_ACTION)
	@JsonIgnore
	private ShiftModel shift;
	
	public DokterModel getId_dokter() {
		return dokter;
	}

	public void setId_dokter(DokterModel id_dokter) {
		this.dokter = dokter;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public HariModel getHari() {
		return hari;
	}

	public void setHari(HariModel hari) {
		this.hari = hari;
	}

	public ShiftModel getShift() {
		return shift;
	}

	public void setShift(ShiftModel shift) {
		this.shift = shift;
	}

	
}