package com.bilgeadam.oop;

public class Matematik {
	
	//2 tane int paramatre alan ve geriye int tipinde değer dönen bir metot
	
	public int Topla (int sayi1, int sayi2) {
		
		int sonuc =0;
		
		sonuc = sayi1+sayi2;
		
		return sonuc;
	}
	
	public int Cikar(int sayi1,int sayi2) {
		int sonuc;
		
		sonuc=sayi1-sayi2;
		
		return sonuc;
	}
	
	public int Carp(int sayi1,int sayi2) {
		int sonuc;
		
		sonuc=sayi1*sayi2;
		
		return sonuc;
	}
	public double Bol(double sayi1,double sayi2) {
	double	sonuc;
	
	sonuc=sayi1/sayi2;
	
	return sonuc;
	
		
	}
	
	public int Yas(int dogumTarihin) {
		int yil =2022;
		int	yas=yil-dogumTarihin;
		return yas;
	}

	
	
}
