package prefab_objects;

import java.util.LinkedList;

import moteur.Objet;

public class Objects_nourriture {
	static public Objet prefab_chips(){
		Objet a=new Objet("Chips");
		a.nourir=5;
		a.fumer=3;
		a.brule=10;
		a.fun=3;
		a.place=1;
		return a;
	}
	
	static public Objet prefab_frites(){
		Objet a=new Objet("frites");
		a.nourir=5;
		a.fumer=4;
		a.brule=10;
		a.fun=3;
		a.place=1;
		return a;
	}
	
	static public Objet prefab_PaquetChipsVide(){
		Objet a=new Objet("Paquet de chips");
		a.brule=10;
		a.fun=1;
		a.inventaire=new LinkedList<Objet>();
		a.transport_objet=3;
		return a;
	}
	
	static public Objet prefab_PaquetChipsPlein(){
		Objet a=new Objet("Paquet de chips");
		a.brule=10;
		a.fun=1;
		a.transport_objet=3;
		a.reservoir=1;
		a.inventaire=new LinkedList<Objet>();
		Objet b=prefab_chips(),c=prefab_chips(),d=prefab_chips();
		a.inventaire.add(b);
		a.inventaire.add(c);
		a.inventaire.add(d);
		return a;
	}
	
	
	
}
