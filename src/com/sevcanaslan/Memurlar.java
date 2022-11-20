package com.sevcanaslan;

public class Memurlar extends Calisanlar implements ICalisma{
	

	private String departman;
	private int calismaSaati;
	
	
	public Memurlar(String ad, String soyad, int telefon,String departman,int calismaSaati) {
		super(ad, soyad, telefon);
		this.departman= departman;
		this.calismaSaati= calismaSaati;
	
	}


	public String getDepartman() {
		return departman;
	}


	public void setDepartman(String departman) {
		this.departman = departman;
	}


	public int getCalismaSaati() {
		return calismaSaati;
	}


	public void setCalismaSaati(int calismaSaati) {
		this.calismaSaati = calismaSaati;
	}


	@Override
	public void giris() {
		System.out.println("Giriş yapıldı");
		
	}


	@Override
	public void cikis() {
		System.out.println("Çıkış yapıldı");
		
	}


	@Override
	public boolean yemek(int sayi) {
		System.out.println("Yemek yendi");
		return true;
	}


	@Override
	public void calismaSaati() {
		System.out.println(getAd()+" "+ getSoyad()+" "+ calismaSaati+" kadar çalıştı");		
	}
	

}
