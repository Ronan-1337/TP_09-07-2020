package DeuxPointOnze;

public class EluMafieux extends Elu{

	public EluMafieux(String nom, String prenom, int dotation) {
		super(nom, prenom, dotation);
	}
	
	@Override
	public void embaucher(Personne assistant) throws IllegalArgumentException{
		if (assistant.nom == this.nom)
			assistants.add(assistant);
		else
			throw new IllegalArgumentException("T'es pas de ma famille !");
	}
	
}
