package deux_douze;

import java.time.Instant;

public class Soin extends ActeMed{
	int amelioration; //amelioration de l'etat du patient d�e au soin, entre 0 et 100%

	public Soin(Soignant praticien, Instant date, int birthYear, int birthMonth, int birthDate, int amelioration) throws IllegalArgumentException {
		super(praticien, date, birthYear, birthMonth, birthDate);
		if (amelioration < 0 || amelioration > 100)
			throw new IllegalArgumentException("L'amelioration de l'�tat du patient doit �tre entre 0 et 100%");
		else
			this.amelioration = amelioration;
	}
	
}
