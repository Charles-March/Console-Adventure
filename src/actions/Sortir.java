package actions;

import main.Lancer;
import moteur.Objet;
import moteur.Personnage;
import moteur.Player;

public class Sortir extends £Action{

	public void fait(Player p, Objet o , Personnage pe) {
		p.setEndroit(p.PieceActuelle.Sortie);
		Lancer.aff.ActionDone(this, o);
	}

	@Override
	public boolean possible(Player p, Objet o, Personnage pe) {
		return (p.PieceActuelle!=null && p.PieceActuelle.sortie==true);
	}

	public Sortir(){
		name=Lancer.langue.goOut();
	}
}
