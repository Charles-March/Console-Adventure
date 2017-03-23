package actions;

import main.Lancer;
import moteur.Objet;
import moteur.Personnage;
import moteur.Player;

public class Jongler extends £Action{

	@Override
	public void fait(Player p, Objet o, Personnage pe) {
		if(p.fun< 100) p.fun+=1;
		Lancer.aff.ActionDone(this, o);		
	}

	@Override
	public boolean possible(Player p, Objet o, Personnage pe) {
		return (o!=null && o.place<=2);
	}
	
	public Jongler(){
		name=Lancer.langue.juggle();
	}
}
