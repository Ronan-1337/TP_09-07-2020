package deux_douze;

import java.time.Instant;

class Diagnostic extends ActeMed{
	private Maladie maladie;
	private int validite; // fiabilité du diagnostic, entre 0 et 100%
	
	public Diagnostic(Soignant praticien, Instant date, int birthYear, int birthMonth, int birthDate, Maladie maladie,
			int validite) throws IllegalArgumentException {
		super(praticien, date, birthYear, birthMonth, birthDate);
		this.maladie = maladie;
		if (validite < 0 || validite > 100)
			throw new IllegalArgumentException("La fiabilité du diagnostic doit être entre 0 et 100 %");
		else
			this.validite = validite;
	}
	public Maladie getMaladie() {
		return maladie;
	}
	public int getValidite() {
		return validite;
	}
	
} 