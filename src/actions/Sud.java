package actions;

import main.Lancer;
import moteur.*;

public class Sud extends £Action{

	@Override
	public void fait(Player p, Objet o, Personnage pe) {
		p.setEndroit(p.endroit().Sud);
		Lancer.aff.ActionDone(this, o);
		
	}

	@Override
	public boolean possible(Player p, Objet o, Personnage pe) {
		return (p.endroit().SortieSud);
	}
	
	public Sud(){
		name=Lancer.langue.south();
	}

}
