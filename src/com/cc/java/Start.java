package com.cc.java;

import com.cc.java.tools.RechnerStat;

public class Start {

	static String preStr = "Das Ergebnis ist: ";
	
	public static void main(String[] args) {
	
	/*
	RechnerInst rechnerInst	= new RechnerInst();	
	ausgabe(preStr + rechnerInst.summe(10, 3));
	ausgabe(preStr + rechnerInst.differenz(10, 3));
	ausgabe(preStr + rechnerInst.produkt(10, 3));
	ausgabe(preStr + rechnerInst.quotient(2,5));
	*/
		
	ausgabe(preStr + RechnerStat.summe(10, 3));
	ausgabe(preStr + RechnerStat.differenz(10, 3));
	ausgabe(preStr + RechnerStat.produkt(10, 3));
	ausgabe(preStr + RechnerStat.quotient(2, 4));
	ausgabe("---------------");
	ausgabe("PI ist:" + Math.PI);
	
	}
	
	
	public static void ausgabe(String outStr) {
		System.out.println(outStr);		
	}

}
