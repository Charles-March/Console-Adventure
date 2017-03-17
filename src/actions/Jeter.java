package actions;

import main.Lancer;
import moteur.Objet;
import moteur.Player;

public class Jeter extends £Action{

	@Override
	public void fait(Player p, Objet o) {
		p.endroit().inventaire.add(o);
		p.inventaire.remove(o);
		Lancer.aff.ActionDone(this, o);
	}

	@Override
	public boolean possible(Player p, Objet o) {
		return (o!=null && p.inventaire.contains(o));
	}
	
	public Jeter(){
		name="jeter";
	}
}
