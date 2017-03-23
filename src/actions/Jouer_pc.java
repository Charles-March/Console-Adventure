package actions;

import main.Lancer;
import moteur.Objet;
import moteur.Personnage;
import moteur.Player;

public class Jouer_pc extends £Action{

	@Override
	public void fait(Player pl, Objet o, Personnage pe) {
		if(100>=o.fun+pl.fun){
			pl.fun+=o.fun;
		}
		else{
			pl.fun+=o.fun;
		}
		Lancer.aff.ActionDone(this, o);
	}

	@Override
	public boolean possible(Player pl, Objet o, Personnage pe) {
		return (o!=null && o.allumable==true && o.actif==true && o.fun>0);
	}

	public Jouer_pc(){
		name=Lancer.langue.playPc();
	}
}
