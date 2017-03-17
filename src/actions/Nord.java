package actions;

import main.Lancer;
import moteur.*;

public class Nord extends £Action{

	@Override
	public void fait(Player p, Objet o) {
		p.setEndroit(p.endroit().Nord);
		Lancer.aff.ActionDone(this, o);
		
	}

	@Override
	public boolean possible(Player p,Objet o) {
		return (p.endroit().SortieNord);
	}

	public Nord(){
		name=Lancer.langue.north();
	}
}
