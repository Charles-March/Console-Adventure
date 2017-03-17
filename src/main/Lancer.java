package main;
import affichage.*;
import language.*;
import moteur.*;

public class Lancer {

	public static _Affichage aff;
	public static Player p;
	public static _Language langue;
	private static Objet o;
	
	public static void main(String[] args) {
		p = new Player();
		langue = new Francais();
		aff = new Affichage_Console();
		p.name=aff.Start(p);
		p.InitAction();
		String s;
		
		ActionDefinies ad=null;
		
		while(!p.over()){
			o=null;
			aff.update(p);
			s=aff.GetAction(Player.ListeActionAffichee);
			if(!info(s) || o!=null){
				if(o!=null) s=aff.GetAction(Player.ListeActionAffichee);
				ad=new ActionDefinies(s, o);
				if(!p.fait(ad)){
					aff.PrintMiss();
				}
			}
		}
	}
		
	public static boolean info(String s){
		s=s.toLowerCase();
		if(s.equals(langue.help())){
			System.out.println("help");
			aff.PrintHelp();
		return true;
		}
		
		else if(s.equals(langue.backpack())){
			aff.PrintBackpack(p);
		return true;
		}
		else if(s.equals(langue.observ())){
			aff.PrintItemsNear(p);
		return true;
		}
		else if(s.equals(langue.use())){
			o=aff.ChooseItem(p);
		return true;
		}
		
	return false;
	}
		

}
