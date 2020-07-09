package Cinq_deux;

public class Etudiant3eCycle extends Enseignant{
	
	//Constructeur as always + redéfinition de heuresupp par 30€ de l'heure
	public Etudiant3eCycle(String nom, String prenom, int heures, int heuresupp, int salaire, int mois, int charge) {
		super(nom, prenom, heures, heuresupp, salaire, mois, charge);
		this.heuresupp = 30;
	}
	
	//Le calcul dans la classe abstraite
	public int coutEnseignants() {
		if(this.heures > 96) return ((96*this.heuresupp)*charge);
		else return((this.heuresupp*this.heures)*charge);
	}
}