package com.OCR;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Langage lang : Langage.values()){
			if(Langage.Java.equals(lang)){
				System.out.println("J'aime le " + lang);
			}
			else{
				System.out.println(lang);
			}
		} // fin for
		
		
		// affiche editeur de chaques langages
		Langage L1 = Langage.C;
		Langage L2 = Langage.CPlus;
		L1.getEditor();
		L2.getEditor();
	}

}
