package deux_douze;

import java.time.Instant;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ActeMed {
	private Soignant praticien;
	private Instant date;
	
	public ActeMed(Soignant praticien, Instant date, int birthYear, int birthMonth, int birthDate) {
		Calendar tmp = new GregorianCalendar();
		tmp.set(birthYear, birthMonth-1, birthDate);
		
		this.praticien = praticien;
		this.date = tmp.toInstant();
	}
	public Soignant getPraticien() {
		return praticien;
	}
	public Instant getDate() {
		return date;
	}
}
