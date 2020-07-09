package Cinq_deux;

public abstract class Enseignant {
	
	//Je définis les attributs qui vont être réutilisés plus tard
	String nom,prenom;
	int heures;
	int heuresupp;
	int salaire;
	int mois;
	int charge;
	
	//Mon constructeur qui tout pareil, sera réutilisé plus tard
	public Enseignant(String nom, String prenom, int heures, int heuresupp, int salaire, int mois, int charge) {
		this.nom = nom;
		this.prenom = prenom;
		this.heures = heures;
		this.heuresupp = 40;
		this.salaire = 0;
		this.mois = 12;
		this.charge = 1;
	}
	
	//Je définis une méthode abstraite, pour pouvoir la réutiliser plus tard en lui mettant des calculs différents
	public abstract int coutEnseignants();
}