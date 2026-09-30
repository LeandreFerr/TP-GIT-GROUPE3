package nintendo.test;

import java.time.LocalDate;

import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Adresse adresse = new Adresse(10, "rue des Fleurs", "Paris");
		Boutique boutique = new Boutique("Nintendo Paris", adresse);
		
		Console console1 = new Console("Nintendo",469,LocalDate.of(2026, 9, 30));
		Console console2 = new Console("Playsation",689,LocalDate.of(2026, 11, 3));
		Console console3 = new Console("Xbox",569,LocalDate.of(2026, 6, 27));
		
		
		Jeu jeu1 = new Jeu("Zelda",console1,boutique);
		Jeu jeu2 = new Jeu("Pokemon",console1,boutique);
		Jeu jeu3 = new Jeu("Metroid",console1,boutique);
		Jeu jeu4 = new Jeu("GodOfWar",console2,boutique);
		Jeu jeu5 = new Jeu("Halo",console3,boutique);
		
		
		
	
		Client c1 = new Client("Doe", "John");
        Client c2 = new Client("Doe", "Jane");
	}

}
