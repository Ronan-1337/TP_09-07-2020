package Cinq_deux;

public abstract class Enseignant {
	
	//Je d�finis les attributs qui vont �tre r�utilis�s plus tard
	String nom,prenom;
	int heures;
	int heuresupp;
	int salaire;
	int mois;
	int charge;
	
	//Mon constructeur qui tout pareil, sera r�utilis� plus tard
	public Enseignant(String nom, String prenom, int heures, int heuresupp, int salaire, int mois, int charge) {
		this.nom = nom;
		this.prenom = prenom;
		this.heures = heures;
		this.heuresupp = 40;
		this.salaire = 0;
		this.mois = 12;
		this.charge = 1;
	}
	
	//Je d�finis une m�thode abstraite, pour pouvoir la r�utiliser plus tard en lui mettant des calculs diff�rents
	public abstract int coutEnseignants();
}