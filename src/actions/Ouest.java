package actions;

import main.Lancer;
import moteur.*;

public class Ouest extends £Action{

	@Override
	public void fait(Player p, Objet o, Personnage pe){
		p.setEndroit(p.endroit().Ouest);
		Lancer.aff.ActionDone(this, o);
		
	}

	@Override
	public boolean possible(Player p, Objet o, Personnage pe) {
		return (p.endroit().SortieOuest);
	}
	
	public Ouest(){
		name=Lancer.langue.west();
	}

}
