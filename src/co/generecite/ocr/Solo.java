package co.generecite.ocr;

public class Solo<T> {
	
	//var d'instance
	private T valeur;
	
	//getters & setters
	//retourn la valeur deja cast. par la signature de la methode
	public T getValeur() {
		return valeur;
	}
	//def la valeur avec le param
	public void setValeur(T valeur) {
		this.valeur = valeur;
	}

	//constrc par defaut
	public Solo(){
		this.valeur = null;
	}
	
	//constr avec param inconnu 
	public Solo(T val){
		this.valeur = val;
	}
	
}
