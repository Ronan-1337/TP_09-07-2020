package deuPoainOnz;

import java.util.ArrayList;

public class Elu extends Personne{
	ArrayList<Personne> assistants = new ArrayList<Personne>();
	int dotation;

	public Elu(String nom, String prenom, int dotation) {
		super(nom, prenom);
		this.dotation = dotation;
	}

	public void embaucher(Personne assistant){
		assistants.add(assistant);
	}
	
	public void licencier(Personne assistant) {
		for (int i = 0; assistants.get(i) != null; i++) {
			if (assistants.get(i) == assistant)
				assistants.remove(i);
		}
			
	}
	
	public void giveSous(Personne assistant) {
		for (int i = 0; assistants.get(i) != null; i++) {
			assistants.get(i).addSous(dotation/assistants.size());
			dotation = dotation - (dotation/assistants.size());
		}
	}
}
