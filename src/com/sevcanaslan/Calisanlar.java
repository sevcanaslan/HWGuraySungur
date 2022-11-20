package com.sevcanaslan;

public abstract class Calisanlar {
	
	private String ad, Soyad;
	private int telefon;
	
	
	
	public Calisanlar(String ad, String soyad, int telefon) {
		super();
		this.ad = ad;
		Soyad = soyad;
		this.telefon = telefon;
	}

	public abstract void calismaSaati();

	public String getAd() {
		return ad;
	}



	public void setAd(String ad) {
		this.ad = ad;
	}



	public String getSoyad() {
		return Soyad;
	}



	public void setSoyad(String soyad) {
		Soyad = soyad;
	}



	public int getTelefon() {
		return telefon;
	}



	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}
	
	
	
	

}
