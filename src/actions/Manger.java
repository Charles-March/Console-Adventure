package actions;

import main.Lancer;
import moteur.*;

public class Manger extends £Action{

	@Override
	public void fait(Player p, Objet o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean possible(Player p,Objet o) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public Manger(){
		name=Lancer.langue.eat();
	}

}
