package deux_dix;

public class Sujet {
	Question[] questions = new Question[20];
	
	private void setQuestions() {
	for (int i = 0; questions[i] != null; i++)
		questions[i] = new Question("Es-tu grenouille ?", "Je croa", "je croa oui", "Je croa non", "Je croa");
	}
	
	private float moyenne() {
		float moyenne = questions[0].getDifficulte();
		for (int i = 1; questions[i] != null; i++)
			moyenne = (moyenne + questions[i].getDifficulte())/2;
		return moyenne;
	}
}
