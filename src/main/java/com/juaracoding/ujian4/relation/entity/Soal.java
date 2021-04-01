package com.juaracoding.ujian4.relation.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="soal")
public class Soal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_Soal;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_Plot_Matakuliah")
	private PlotMatakuliah plotmatakuliah;
	@Column(name="nama_soal")
	private String nama_Soal;
	@Column(name="status")
	private String status;

}
