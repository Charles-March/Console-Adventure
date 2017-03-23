package actions;

import main.Lancer;
import moteur.Objet;
import moteur.Personnage;
import moteur.Player;

public class Casser extends £Action{

	@Override
	public void fait(Player pl, Objet o, Personnage pe) {
		if(o.Onbreak!=null) pl.inventaire.add(o.Onbreak);
		o.RemoveFromAnywhere(pl);
		Lancer.aff.ActionDone(this, o);
	}

	@Override
	public boolean possible(Player pl, Objet o, Personnage pe) {
		return (o!=null && o.breakable==true);
	}

	public Casser(){
		name=Lancer.langue.onbreak();
	}
}
