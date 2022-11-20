package com.sevcanaslan;

public class akademisyen extends Calisanlar implements IOkul {
	


	private String bolum, ders;
	private int calismaSaati;
	
	
	public akademisyen(String ad, String soyad, int telefon,String bolum, String ders, int calismaSaati ) {
		super(ad, soyad, telefon);
		this.ders= ders;
		this.bolum= bolum;
		this.calismaSaati= calismaSaati;
				
	}


	public String getBolum() {
		return bolum;
	}


	public void setBolum(String bolum) {
		this.bolum = bolum;
	}


	public String getDers() {
		return ders;
	}


	public void setDers(String ders) {
		this.ders = ders;
	}


	public void calismaSaati() {
		System.out.println(getAd()+" "+ getSoyad()+" "+ calismaSaati+" kadar çalıştı");		
	}

	
	@Override
	public String toString() {
		return "akademisyen [bolum=" + bolum + ", ders=" + ders + ", getBolum()=" + getBolum() + ", getDers()="
				+ getDers() + ", getAd()=" + getAd() + ", getSoyad()=" + getSoyad() + ", getTelefon()=" + getTelefon()
				+ ", getClass()=" + getClass() + "]";
	}


	@Override
	public void okul() {
		System.out.println("Akademisyenin çalıştığı okul Atılım Üniversitesi");
		
	}
	

	
	

}
