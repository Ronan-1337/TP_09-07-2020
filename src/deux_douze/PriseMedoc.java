package deux_douze;

import java.time.Instant;

public class PriseMedoc extends Soin{
	int posologie;
	int frequence;
	
	public PriseMedoc(Soignant praticien, Instant date, int birthYear, int birthMonth, int birthDate, int amelioration,
			int posologie, int frequence) throws IllegalArgumentException {
		super(praticien, date, birthYear, birthMonth, birthDate, amelioration);
		this.posologie = posologie;
		this.frequence = frequence;
	}

	public void medocParJour() {
		System.out.println("le patient doit prendre "+posologie+" medicaments, "+frequence+" fois par jour, il doit donc prendre au total "+posologie*frequence+" medicaments par jour.");
	}
}
