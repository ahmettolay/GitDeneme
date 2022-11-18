package com.bilgeadam.etud3;

public class Asistan extends Akademisyen implements IAkademisyenFonksiyonları {



	public Asistan(String ad, String soyad, String telefon, String eposta, String bolum, String unvan, int kapiNo) {
		super(ad, soyad, telefon, eposta, bolum, unvan, kapiNo);
	
	}

	@Override
	public void derseGir() {
		System.out.println("asistan derse girdi");
		
	}

	@Override
	public void quizYap() {
		System.out.println("Asistan görevlisi quiz yaptı");
		
	}

	@Override
	public void sınavYap() {
		System.out.println("asistan sınav yaptı");
		
	}
	
	void yemekhaneyiKullan() {
		System.out.println("yemekane kullanıldı.");
	}

	
	void deneyYap() {
		System.out.println("ogretim göverlisi ve asistan deney yaptı.");
	}
}
