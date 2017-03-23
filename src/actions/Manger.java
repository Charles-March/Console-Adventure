package actions;

import main.Lancer;
import moteur.*;

public class Manger extends £Action{

	@Override
	public void fait(Player p, Objet o, Personnage pe) {
	
	p.faim+=o.nourir;
	if(p.inventaire.contains(o)){
		p.inventaire.remove(o);
	}
	if(p.endroit().inventaire.contains(o)){
		p.endroit().inventaire.remove(o);
	}
	o=null;
	
		Lancer.aff.ActionDone(this, o);
	}

	@Override
	public boolean possible(Player p,Objet o, Personnage pe) {
		return (o!=null && o.nourir>0 && p.faim<100) ;
	}
	
	public Manger(){
		name=Lancer.langue.eat();
	}

}
