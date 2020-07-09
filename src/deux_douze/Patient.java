package deux_douze;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Patient {
	private String nom, prenom, sexe;
	private Instant naissance;
	private ArrayList<ActeMed> parcoursMed = new ArrayList<>();
	
	public Patient(String nom, String prenom, String sexe, int birthYear, int birthMonth, int birthDate) {
		Calendar tmp = new GregorianCalendar();
		tmp.set(birthYear, birthMonth-1, birthDate);
		
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.naissance = tmp.toInstant();
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public String getSexe() {
		return sexe;
	}
	public Instant getNaissance() {
		return naissance;
	}
	public ArrayList<ActeMed> getParcoursMed() {
		return parcoursMed;
	}
	
	public long getAge() {
		return naissance.until(Instant.now(),ChronoUnit.YEARS);
	}
	
	public void addActeMed(ActeMed acte) {
		parcoursMed.add(acte);
	}
}
