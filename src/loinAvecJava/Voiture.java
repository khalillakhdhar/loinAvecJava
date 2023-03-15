package loinAvecJava;

public class Voiture extends Vehicule {
private String carburant;
private String mode;
private int nbporte;
public Voiture(String marque, double prix, String usine, String carburant, String mode, int nbporte) {
	super(marque, prix, usine);
	this.carburant = carburant;
	this.mode = mode;
	this.nbporte = nbporte;
}
public String getCarburant() {
	return carburant;
}
public void setCarburant(String carburant) {
	this.carburant = carburant;
}
public String getMode() {
	return mode;
}
public void setMode(String mode) {
	this.mode = mode;
}
public int getNbporte() {
	return nbporte;
}
public void setNbporte(int nbporte) {
	this.nbporte = nbporte;
}
@Override
public String toString() {
	return "Voiture [carburant=" + carburant + ", mode=" + mode + ", nbporte=" + nbporte + ", Vehicule="
			+ super.toString() + "]";
}





}
