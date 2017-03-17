package prefab_objects;
import java.util.LinkedList;
import moteur.*;

public class Objects_boissons {
	
	static public Objet prefab_Eau(){
		Objet a=new Objet("Eau");
		a.boire=10;
		a.place=1;
		a.liquide=10;
		return a;
	}
	
	static public Objet prefab_biere(){
		Objet a=new Objet("Biere");
		a.liquide=10;
		a.boire=5;
		a.place=1;
		a.alcool=1;
		return a;
	}
	
	static public Objet prefab_whisky(){
		Objet a=new Objet("Whisky");
		a.liquide=10;
		a.boire=2;
		a.place=1;
		a.alcool=5;
		return a;
	}
	
	static public Objet prefab_coca(){
		Objet a=new Objet("Coca");
		a.liquide=10;
		a.boire=5;
		a.place=1;
		a.nourir=1;
		return a;
	}
	
	static public Objet prefab_BouteilleEauVide(){
		Objet a=new Objet("Bouteille d'eau");
		a.fun=1;
		a.reservoir=3;
		a.fumer=3;
		a.transport_objet=1;
		a.inventaire=new LinkedList<Objet>();
		return a;
	}
	
	static public Objet prefab_BouteilleEauPleine(){
		Objet a=new Objet("Bouteille d'eau");
		a.fun=1;
		a.reservoir=3;
		a.fumer=3;
		a.transport_objet=1;
		a.inventaire=new LinkedList<Objet>();
		Objet b=prefab_Eau();
		Objet c=prefab_Eau();
		Objet d=prefab_Eau();
		a.inventaire.add(b);
		a.inventaire.add(c);
		a.inventaire.add(d);
		return a;
	}
	
	static public Objet prefab_BouteilleCocaPleine(){
		Objet a=new Objet("Bouteille de coca");
		a.fun=1;
		a.reservoir=3;
		a.transport_objet=1;
		a.fumer=3;
		a.inventaire=new LinkedList<Objet>();
		Objet b=prefab_coca(),c=prefab_coca(),d=prefab_coca();
		a.inventaire.add(b);
		a.inventaire.add(c);
		a.inventaire.add(d);
		return a;
	}
	
	static public Objet prefab_BouteilleCocaVide(){
		Objet a=new Objet("Bouteille de coca");
		a.fun=1;
		a.reservoir=3;
		a.fumer=3;
		a.transport_objet=1;
		a.inventaire=new LinkedList<Objet>();
		return a;
	}
	
	static public Objet prefab_BouteilleBiereVide(){
		Objet a=new Objet("Bouteille de biere");
		a.fun=1;
		a.reservoir=2;
		a.transport_objet=1;
		a.inventaire=new LinkedList<Objet>();
		return a;
	}
	
	static public Objet prefab_BouteilleBierePleine(){
		Objet a=new Objet("Bouteille de biere");
		a.fun=1;
		a.reservoir=2;
		a.transport_objet=1;
		a.inventaire=new LinkedList<Objet>();
		Objet b=prefab_biere(),c=prefab_biere();
		a.inventaire.add(b);
		a.inventaire.add(c);
		return a;
	}
	
	public Objet prefab_BouteillewhiskyPleine(){
		Objet a=new Objet("Bouteille de whisky");
		a.fun=1;
		a.reservoir=3;
		a.transport_objet=1;
		a.inventaire=new LinkedList<Objet>();
		Objet b=prefab_whisky(),c=prefab_whisky(),d=prefab_whisky();
		a.inventaire.add(b);
		a.inventaire.add(c);
		a.inventaire.add(d);
		return a;
	}
	
	public Objet prefab_BouteilleWhiskyVide(){
		Objet a=new Objet("Bouteille de whisky");
		a.degat=2;
		a.fun=1;
		a.reservoir=3;
		a.transport_objet=1;
		a.inventaire=new LinkedList<Objet>();
		return a;
	}
}
