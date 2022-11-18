package com.bilgeadam.etud3;

public abstract class Akademisyen extends Calisan {

	String bolum;
	String unvan;
	int kapiNo;
	
	
	
	


	public Akademisyen(String ad, String soyad, String telefon, String eposta, String bolum, String unvan, int kapiNo) {
		super(ad, soyad, telefon, eposta);
		this.bolum = bolum;
		this.unvan = unvan;
		this.kapiNo = kapiNo;
	}

	void labDersineGir() {
		System.out.println("Lab asistanı lab dersine girdi.");
	}

	void yemekhaneyiKullan() {
		System.out.println("yemekane kullanıldı.");
	}
	
	void deneyYap() {
		System.out.println("ogretim göverlisi ve asistan deney yaptı.");
	}

}
