package com.sevcanaslan;

public class İsciler  extends Calisanlar{
	

	private String calisilanBina;
	private int calismaSaati;
	
	
	public İsciler(String ad, String soyad, int telefon,int calismaSaati,String calisilanBina ) {
		super(ad, soyad, telefon);
		this.calisilanBina= calisilanBina;
		this.calismaSaati=calismaSaati;
	}


	public String getCalisilanBina() {
		return calisilanBina;
	}


	public void setCalisilanBina(String calisilanBina) {
		this.calisilanBina = calisilanBina;
	}


	public int getCalismaSaati() {
		return calismaSaati;
	}


	public void setCalismaSaati(int calismaSaati) {
		this.calismaSaati = calismaSaati;
	}
	public void calismaSaati() {
		System.out.println(getAd()+" "+ getSoyad()+" "+ calismaSaati+" kadar çalıştı");		
	}
	
	

}
