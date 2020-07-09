package deux_douze;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Patient {
	String nom, prenom, sexe;
	Instant naissance;
	ArrayList<ActeMed> parcoursMed = new ArrayList<>();
	
	public Patient(String nom, String prenom, String sexe, int birthYear, int birthMonth, int birthDate) {
		Calendar tmp = new GregorianCalendar();
		tmp.set(birthYear, birthMonth-1, birthDate);
		
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.naissance = tmp.toInstant();
	}
}
