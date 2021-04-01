package com.juaracoding.ujian4.relation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.juaracoding.ujian4.relation.entity.Dosen;
import com.juaracoding.ujian4.relation.entity.Mahasiswa;
import com.juaracoding.ujian4.relation.entity.MataKuliah;
import com.juaracoding.ujian4.relation.entity.Pertanyaan;
import com.juaracoding.ujian4.relation.entity.PlotMatakuliah;
import com.juaracoding.ujian4.relation.entity.Soal;
import com.juaracoding.ujian4.relation.repository.DosenRepository;
import com.juaracoding.ujian4.relation.repository.MatakuliahRepository;
import com.juaracoding.ujian4.relation.repository.NilaiRepository;
import com.juaracoding.ujian4.relation.repository.PertanyaanRepository;
import com.juaracoding.ujian4.relation.repository.PlotMatakuliahRepository;

@SpringBootApplication
public class UjianRelationTableApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UjianRelationTableApplication.class, args);
	}

	@Autowired
	PlotMatakuliahRepository plotmatakuliahRepository;
//	PertanyaanRepository pertanyaanRepository;
//	NilaiRepository nilaiRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		PlotMatakuliah pmk = new PlotMatakuliah();
		
		Dosen dsn = new Dosen();
		dsn.setUsername("Dosen 1");
		dsn.setPassword("123345");
		dsn.setNamaDosen("Ahmad Yakup");
		
		Mahasiswa mhs = new Mahasiswa();
		mhs.setPassword("444556");
		mhs.setJenisKelamin("Laki-Laki");
		mhs.setNamaMahasiswa("Jimmy Rusdi");
		
		MataKuliah mk = new MataKuliah();
		mk.setNamaMatakuliah("Belajar JPA");
		
		Soal sl = new Soal();
		sl.setNama_Soal("Ujian Relation JPA");
		sl.setStatus("Ujian");
		
		Pertanyaan ptny = new Pertanyaan();
		ptny.setPertanyaan("Jawaban 1+1 ADALAH?");
		ptny.setJawaban1("2");
		ptny.setJawaban2("4");
		ptny.setJawaban3("3");
		ptny.setJawaban4("5");
		ptny.setJawabanBenar("1");
		ptny.setGambar("http//juaracoding.com");
		ptny.setStatusGambar("hhh");
		
		pmk.setDosen(dsn);
//		pmk.setMahasiswa(mhs);
//		pmk.setMatakuliah(mk);
		
		this.plotmatakuliahRepository.save(pmk);
		
		
		
   
		
		
	}

}
