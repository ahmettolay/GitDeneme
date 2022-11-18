package com.bilgeadam.oop2;

public class Car {
	public String marka;
	public String model;
	public int kapiSayisi;
	public int pencereSayisi;
	public boolean boyaDegisen;
	
	
	
	public void aracDurumu(String markasi,String modeli) {
		System.out.println(markasi + " " + modeli + " Gidiyor.");
	}
	
	
	public void CarTanitim(String markasi,String modeli) {
		System.out.println("Arabanın markası "+ markasi + " modeli " + modeli + ".");
	}

}
