package deux_dix;

public class Question {
		String enonce;
		int difficulte=50; // la difficulte varie de 0 à 100
		String[] reponse = new String[3];
		String verite;

		public Question(String enonce, String verite, String reponse1, String reponse2, String reponse3) {
			super();
			this.enonce = enonce;
			this.reponse[0] = reponse1;
			this.reponse[1] = reponse2;
			this.reponse[2] = reponse3;
			this.verite = verite;
		}

		void setDifficulte(int d){
		this.difficulte = d;
		}
		
		int getDifficulte(){
		return this.difficulte;
		}
		
		String getEnonce(){
		return this.enonce;
		}
}
