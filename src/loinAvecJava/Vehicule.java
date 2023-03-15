package loinAvecJava;

public abstract class Vehicule {
public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}
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
@Override
public String toString() {
	return "Vehicule [marque=" + marque + ", prix=" + prix + ", usine=" + usine + "]";
}

}
