package actions;

import main.Lancer;
import moteur.Objet;
import moteur.Personnage;
import moteur.Player;

public class Allumer_Ordinateur extends £Action {

	@Override
	public void fait(Player p, Objet o, Personnage pe) {
		o.actif=true;
		Lancer.aff.ActionDone(this, o);
	}

	@Override
	public boolean possible(Player p, Objet o, Personnage pe) {
		return (o!=null && p.intelligence>=o.besoin_intelligence && o.allumable==true);
	}
	
	public Allumer_Ordinateur() {
		name=Lancer.langue.turnOn();
	}
}
