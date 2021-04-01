package com.juaracoding.ujian4.relation.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="plotmatakuliah")
public class PlotMatakuliah {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_PlotMatakuliah;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id_matakuliah")
	private MataKuliah matakuliah;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id_dosen")
	private Dosen dosen;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="nim")
	private Mahasiswa mahasiswa;
	

}
