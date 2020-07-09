package Cinq_deux;

public class Vacataire extends Enseignant{

	//Nouvel attribut : Association uniquement pour cette classe
	String Association;
	
	//Mon constructeur avec le rajout de l'attribut Association
	public Vacataire(String nom, String prenom, int heures, int heuresupp, int salaire, int mois, String association, int charge) {
		super(nom, prenom, heures, heuresupp, salaire, mois, charge);
		Association = association;
	}
	
	//Le calcul de coût des vacataires dans ma méthode abstraite
	public int coutEnseignants() {
		return ((heuresupp*this.heures)*charge);
	}
}