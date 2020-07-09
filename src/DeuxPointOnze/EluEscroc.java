package DeuxPointOnze;

public class EluEscroc extends Elu{
	int compteEnSuisse;

	public EluEscroc(String nom, String prenom, int dotation, int compteEnSuisse) {
		super(nom, prenom, dotation);
		this.compteEnSuisse = compteEnSuisse;
	}

	@Override
	public void giveSous(Personne assistant) {
		if ((dotation/assistants.size())> 1480) {
			for (int i = 0; assistants.get(i) != null; i++) {
				assistants.get(i).addSous(1480);
				dotation = dotation - 1480;
			}
		}
		else {
			for (int i = 0; assistants.get(i) != null; i++) {
				assistants.get(i).addSous(dotation/assistants.size());
				dotation = dotation - (dotation/assistants.size());
			}
		}
		compteEnSuisse = dotation;
		dotation = 0;
	}
}
