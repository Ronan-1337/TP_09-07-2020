package Cinq_deux;

public class EnseignantChercheurs extends Enseignant{
	
	//Mon constructeur as always
	public EnseignantChercheurs(String nom, String prenom, int heures, int heuresupp, int salaire, int annee, int charge) {
		super(nom, prenom, heures, heuresupp, salaire, annee, charge);
		this.salaire = 2000;
	}
	
	//L� je r�utilise ma m�thode Abstraite de sorte lui donner mon calcul associ� � ma classe
	 public int coutEnseignants() {
		return ((salaire*mois+((this.heures-192)*heuresupp))*charge);
	}
}