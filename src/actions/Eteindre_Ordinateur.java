package actions;

import main.Lancer;
import moteur.Objet;
import moteur.Personnage;
import moteur.Player;

public class Eteindre_Ordinateur extends £Action{

	@Override
	public void fait(Player p, Objet o, Personnage pe) {
		o.actif=false;
		Lancer.aff.ActionDone(this, o);
	}

	@Override
	public boolean possible(Player p, Objet o, Personnage pe) {
		return (o!=null && o.allumable==true);
	}

	public Eteindre_Ordinateur(){
		name=Lancer.langue.turnOff();
	}
}
