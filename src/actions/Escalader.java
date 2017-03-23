package actions;

import main.Lancer;
import moteur.Objet;
import moteur.Personnage;
import moteur.Player;

public class Escalader extends £Action{

	@Override
	public void fait(Player pl, Objet o, Personnage pe) {
		if(pl.endroit().SortieHauteur<=0 || pl.endroit().SortieHauteur>o.escalader){
			Lancer.aff.cantclimb();
		}
		else if(pl.endroit().SortieHauteur<=o.escalader && pl.endroit().Hauteur!=null){
			pl.setEndroit(pl.endroit().Hauteur);
			Lancer.aff.ActionDone(this, o);
		}
	}

	@Override
	public boolean possible(Player pl, Objet o, Personnage pe) {
		return (o!=null && o.escalader>0);
	}
	
	public Escalader(){
		name=Lancer.langue.climb();
	}

}
