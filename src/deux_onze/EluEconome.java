package deux_onze;

public class EluEconome extends Elu{

	public EluEconome(String nom, String prenom, int dotation) {
		super(nom, prenom, dotation);
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
	}
}
