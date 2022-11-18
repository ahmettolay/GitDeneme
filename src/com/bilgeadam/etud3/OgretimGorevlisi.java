package com.bilgeadam.etud3;

public class OgretimGorevlisi extends Akademisyen implements IAkademisyenFonksiyonları {


	public OgretimGorevlisi(String ad, String soyad, String telefon, String eposta, String bolum, String unvan,
			int kapiNo) {
		super(ad, soyad, telefon, eposta, bolum, unvan, kapiNo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void derseGir() {
		System.out.println("öğretim görevlisi derse girildi");
		
	}

	@Override
	public void quizYap() {
		System.out.println("öğretim görevlisi quiz yaptı");
		
	}

	@Override
	public void sınavYap() {
		System.out.println("öğretim görevlisi sınav yaptı");
		
	}
	

	void yemekhaneyiKullan() {
		System.out.println("yemekane kullanıldı.");
	}
	
	void deneyYap() {
		System.out.println("ogretim göverlisi ve asistan deney yaptı.");
	}

	@Override
	public String toString() {
		return "OgretimGorevlisi [ad=" + ad + ", soyad=" + soyad + ", bolum=" + bolum + ", unvan=" + unvan
				+ ", telefon=" + telefon + ", eposta=" + eposta + ", kapiNo=" + kapiNo + "]";
	}
	

	

	
	
	

}
