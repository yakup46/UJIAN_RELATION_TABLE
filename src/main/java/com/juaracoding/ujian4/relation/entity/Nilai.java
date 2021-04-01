package com.juaracoding.ujian4.relation.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="nilai")
public class Nilai {
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_soal")
	private Soal soal;
	@Column(name="nilai")
	private String nilai;

}
