package nintendo.test;

import nintendo.model.Client;
import nintendo.model.Console;
import nintendo.model.Jeu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import nintendo.model.Achat;
import nintendo.model.Adresse;
import nintendo.model.Boutique;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Adresse adresse = new Adresse(10, "rue des Fleurs", "Paris");
		Boutique boutique = new Boutique("Nintendo Paris", adresse);
		
		Console console1 = new Console("Nintendo");
		Console console2 = new Console("Playsation");
		Console console3 = new Console("Xbox");
		
		
		Jeu jeu1 = new Jeu("Zelda",console1,boutique);
		Jeu jeu2 = new Jeu("Pokemon",console1,boutique);
		Jeu jeu3 = new Jeu("Metroid",console1,boutique);
		Jeu jeu4 = new Jeu("GodOfWar",console2,boutique);
		Jeu jeu5 = new Jeu("Halo",console3,boutique);
		
		Client c1 = new Client("Doe", "John");
        Client c2 = new Client("Doe", "Jane");
        
        List<Achat> achatsJohn = new ArrayList<>();
        achatsJohn.add(new Achat(jeu1, LocalDate.now(), 59.99));
        achatsJohn.add(new Achat(jeu2, LocalDate.now(), 49.99));
        c1.setListeAchat(achatsJohn);
        
        List<Achat> achatsJane = new ArrayList<>();
        achatsJane.add(new Achat(jeu4, LocalDate.now(), 69.99));
        c2.setListeAchat(achatsJane);

        System.out.println(c1);
        System.out.println(c2);
	}

}
