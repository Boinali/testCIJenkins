package com.OCR;

public enum Langage {
	// objet directement construit
	Java ("Langage JAVA", "Eclipe"),
	Php ("Langage PHP", "PHPStorm"),
	C ("Langage C","Code Block"),
	CPlus ("Langage C++","Visual Studio");
	
	private String name = "";
	private String editor = "";
	
	// constructeur
	Langage(String name, String editor){
		this.name = name;
		this.editor = editor;
	}
	
	public void getEditor(){
		System.out.println("Editeur " + editor);
	}
	
	public String ToString(){
		return name;
	}
	
	
}
