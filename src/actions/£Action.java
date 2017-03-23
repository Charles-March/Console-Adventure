package actions;

import java.util.LinkedList;
import moteur.*;

public abstract class £Action {
	public String name;
	
	public abstract void fait(Player pl, Objet o, Personnage pe);
	
	
	public abstract boolean possible(Player pl,Objet o, Personnage pe);
	
	public boolean equal(String s){
		String t=name.toLowerCase();
		s=s.toLowerCase();
		return s==t;
	}
	
	public boolean AppartientA(LinkedList<£Action> l){
		for(int i=0;i<l.size();i++){
			if(l.get(i).getClass() == getClass()){
				return true;
			}
		}
				
		return false;
	}
}
