package com.sevcanaslan;

public class OOPMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		akademisyen akademisyen1 = new akademisyen("Sevcan", "Aslan", 1541654656, "endüstri" , "ERP",8);
		Memurlar memur1= new Memurlar("mete", "ölçer", 86648748, "Bilgi işlem", 5);
		İsciler isci1= new İsciler("hüseyin", "şebek", 0656464, 8, "A blok");
		
		akademisyen1.calismaSaati();
		memur1.calismaSaati();
		isci1.calismaSaati();
		akademisyen1.okul();
		System.out.println(akademisyen1.toString());
		
	}

}
