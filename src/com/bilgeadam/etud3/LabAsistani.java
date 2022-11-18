package com.bilgeadam.etud3;

public class LabAsistani extends Akademisyen implements IAkademisyenFonksiyonları {

	

	public LabAsistani(String ad, String soyad, String telefon, String eposta, String bolum, String unvan, int kapiNo) {
		super(ad, soyad, telefon, eposta, bolum, unvan, kapiNo);
		
	}

	@Override
	public void derseGir() {
		System.out.println("LabAsistanı derse girdi");
		
	}

	@Override
	public void quizYap() {
		System.out.println("LabAsistanı quiz yaptı");
		
	}

	@Override
	public void sınavYap() {
		System.out.println("LabAsistanı sınav yaptı");
		
	}
	
	void labDersineGir() {
		super.labDersineGir();
		
	}
}
