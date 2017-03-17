package prefab_objects;
import moteur.*;

public class Objects_Pc {
	
	static public Objet prefab_PcWindows(){
		Objet a=new Objet("PC");
		a.besoin_intelligence=1;
		a.communication=4;
		a.fun=3;
		a.place=10;
		a.message_echec="Vous ne trouvez pas le bouton pour allumer l'ordinateur.";
		a.besoin_electricite=true;
		return a;
	}
	
	static public Objet prefab_PcUnix(){
		Objet a=new Objet("PC");
		a.besoin_intelligence=4;
		a.communication=4;
		a.fun=3;
		a.place=10;
		a.besoin_electricite=true;
		a.message_echec="Il y a un ecran noir avec des lettres, mais cette langue vous est inconnue.";
		return a;
	}
	
	static public Objet prefab_Tele(){
		Objet a=new Objet("Tele");
		a.besoin_intelligence=1;
		a.fun=8;
		a.degat=5;
		a.place=10;
		a.besoin_electricite=true;
		a.message_echec="Vous ne trouvez pas la telecommande";
		return a;
	}
	
	static public Objet prefab_MultiPrise(){
		Objet a=new Objet("Multiprise");
		a.fun=1;
		a.degat=1;
		a.place=1;
		a.besoin_electricite=true;
		a.brule=1;
		return a;
	}
	
	// pcportable
}
