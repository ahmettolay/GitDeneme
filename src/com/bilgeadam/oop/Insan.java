package com.bilgeadam.oop;

public class Insan { // Başlangıç Scoope
	// access modifiare 					Veri Tipi		DeğişkenAdı
			public							String 			ad ;
public	String soyad ;
public int yaş;//Tam Sayısıal Verileri Saklayabiliriz
public double maas;// .Noktalı kesirli İfadelerde Kullanılır.
public boolean cinsiyet; // True yada False şekinde değer döndürür.



//Metotlar 2 ye ayrlırlar
//Değer döndüren metotlar
//Değer döndürmeyen metotlar
	


//Geriye Değer döndürmeyen adı uyuyor olan bir metot tanımladık
//access modifiare			dönüşTipi			metotAdı()  {}
public						void					Uyu(String adi,String soyadi) {
	
	System.out.println(adi+" "+ soyadi +" Uyuyor.");
	
}




public void Tanıtma(String adi,String soyadi) {
	System.out.println("Kişinin adı " + adi +" kişinin soyadı " + soyadi);
}






}// Bitiş Scoope
