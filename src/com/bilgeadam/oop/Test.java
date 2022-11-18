package com.bilgeadam.oop;

public class Test {

	public static void main(String[] args) {
		
		
		
		// Bir classtan nesne oluşturma
		
	// classİsmi		 nesnemizinAdı	 =		new classİSmi() ;
		Insan				 i			 = 		new Insan();
		i.ad="Ahmet";
		i.soyad="Tolay";
		i.yaş=48;
		i.maas=5000.0;
		i.cinsiyet=true;
		
		// Bir metodu parametreli yapacaksak eğer
		// 
		i.Uyu(i.ad,i.soyad);  		//İnsan classı içerisndeki uyu metodunu çağırdık.

		Matematik mat=new Matematik();
		int gelenDeger = 	mat.Topla(5, 5);
		
		System.out.println("Toplam : "+gelenDeger);
		
		
		System.out.println("Fark : "+mat.Cikar(5, 3));
		System.out.println("Çarpım : "+mat.Carp(8, 2));
		System.out.println("Bölüm : "+mat.Bol(15,2));
		System.out.println("Yasiniz : "+mat.Yas(1993));
		
	}

}
