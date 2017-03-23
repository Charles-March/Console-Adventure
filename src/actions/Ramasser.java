package actions;

import main.Lancer;
import moteur.Objet;
import moteur.Personnage;
import moteur.Player;

public class Ramasser extends £Action{

	@Override
	public void fait(Player p, Objet o, Personnage pe) {
		p.endroit().inventaire.remove(o);
		p.inventaire.add(o);
		Lancer.aff.ActionDone(this, o);
	}

	@Override
	public boolean possible(Player p, Objet o, Personnage pe) {
		return (o!=null && p.endroit().inventaire.contains(o) && p.PlaceDispo()>o.place);
	}
	
	public Ramasser(){
		name=Lancer.langue.pick();
	}

	
}
