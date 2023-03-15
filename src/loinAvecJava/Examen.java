package loinAvecJava;

enum Niveau
{
Débutant,
Novice,
Expert,
}

public class Examen {
	private String titre;
	private int note_Max;
	private String matiere;
	private double coeficient;
	private Niveau nv;
	private Groupes groupe;
	
	
	
	public Groupes getGroupe() {
		return groupe;
	}
	public void setGroupe(Groupes groupe) {
		this.groupe = groupe;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getNote_Max() {
		return note_Max;
	}
	public void setNote_Max(int note_Max) {
		this.note_Max = note_Max;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public double getCoeficient() {
		return coeficient;
	}
	public void setCoeficient(double coeficient) {
		this.coeficient = coeficient;
	}
	public Niveau getNv() {
		return nv;
	}
	public void setNv(Niveau nv) {
		this.nv = nv;
	}
	
	

}
