package loinAvecJava;

public class Vehicule {
private String marque;
private double prix;
private String usine;
public Vehicule(String marque, double prix, String usine) {
	super();
	this.marque = marque;
	this.prix = prix;
	this.usine = usine;
}
public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public String getUsine() {
	return usine;
}
public void setUsine(String usine) {
	this.usine = usine;
}

}
