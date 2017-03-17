package prefab_objects;
import moteur.*;

public class Objects_outils {
	
	static public Objet prefab_pelleClassique(){
		Objet a=new Objet("Pelle");
		a.creuse=3;
		a.degat=3;
		a.besoin_force=2;
		a.place=5;
		a.message_echec="Vous arrivez a peine à soulever la pelle.. aucune action possible.";
		return a;
	}
	
	static public Objet prefab_cleDedouze(){
		Objet a=new Objet("Clé de 12");
		a.degat=4;
		a.besoin_force=1;
		a.place=1;
		a.message_echec="Cet objet est beaucoup trop lourd pour vous.";
		return a;
	}
	
	static public Objet prefab_mouchoir(){
		Objet a=new Objet("Mouchoirs");
		a.place=1;
		a.brule=1;
		return a;
	}
	
}
