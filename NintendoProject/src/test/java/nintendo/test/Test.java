package nintendo.test;

import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Console console1 = new Console("Nintendo");
		Console console2 = new Console("Playsation");
		Console console3 = new Console("Xbox");
		
		
		Jeu jeu1 = new Jeu("Zelda",console1);
		Jeu jeu2 = new Jeu("Pokemon",console1);
		Jeu jeu3 = new Jeu("Metroid",console1);
		Jeu jeu4 = new Jeu("GodOfWar",console2);
		Jeu jeu5 = new Jeu("Halo",console3);
		
		
	}

}
