package com.bilgeadam.oop2;

public class Test2 {

	public static void main(String[] args) {
		Car car1 =new Car();
		car1.marka="BMW";
		car1.model="3.20";
		car1.kapiSayisi=5;
		car1.pencereSayisi=8;
		car1.boyaDegisen=true;
		
		//car1.aracDurumu(car1.marka,car1.model);
		//car1.CarTanitim(car1.marka,car1.model);
		
		Bmw bmw1=new Bmw();
		bmw1.marka="BMW";
		bmw1.model="3.20";
		
		bmw1.CarTanitim(bmw1.marka,bmw1.model);
		
		Mercedes mercedes1= new Mercedes();
		mercedes1.marka="Mercedes";
		mercedes1.model="A-3";
		
		mercedes1.CarTanitim(mercedes1.marka,mercedes1.model);
		
		
		Fiat fiat1= new Fiat();
		fiat1.marka="Fiat";
		fiat1.model="Egea";
		
		fiat1.CarTanitim(fiat1.marka,fiat1.model);

	}

}
