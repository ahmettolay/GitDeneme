package com.bilgeadam.oop;

public class Test2 {

	public static void main(String[] args) {
		Anne anne1 = new Anne();
		anne1.ad="Emine";
		anne1.soyad="Tolay";
		anne1.maas=3000;
		anne1.yaş=59;
			
		//anne1.Tanıtma(anne1.ad, anne1.soyad);
		
		Baba baba1=new Baba();
		baba1.ad="Kerim";
		baba1.soyad="Tolay";
		
		//baba1.Tanıtma(baba1.ad, baba1.soyad);
		
		Cocuk cocuk1= new Cocuk();
		cocuk1.ad="Ahmet";
		cocuk1.soyad="Tolay";
		
		
		AkilliCocuk akilliCocuk1=new AkilliCocuk();
		akilliCocuk1.ad="İbrahim";
		akilliCocuk1.soyad="Gökyar";
		akilliCocuk1.sifat="akıllı";
		
		akilliCocuk1.AdSoyadSifatYaz(akilliCocuk1.ad,akilliCocuk1.soyad,akilliCocuk1.sifat);
		
		UsluCocuk usluCocuk1=new UsluCocuk();
		usluCocuk1.ad="Mehmet";
		usluCocuk1.soyad="Yılmaz";
		usluCocuk1.sifat="uslu";
		
		usluCocuk1.AdSoyadSifatYaz(usluCocuk1.ad, usluCocuk1.soyad, usluCocuk1.sifat);
		
		
		
		
	}

}
