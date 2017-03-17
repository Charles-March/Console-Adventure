package prefab_objects;

import java.util.LinkedList;
import java.util.List;

import moteur.*;

public class Objects_electromenage {
	static public Objet prefab_frigoPlein(){
		Objet a=new Objet("Frigo");
		a.place=20;
		a.transport_objet=30;
		a.escalader=4;
		a.degat=10;
		a.inventaire=new LinkedList<Objet>();
		a.inventaire=remplir_frigo();
		a.besoin_electricite=true;
		return a;
	}
	
	static public Objet prefab_frigoVide(){
		Objet a=new Objet("Frigo");
		a.besoin_electricite=true;
		a.place=20;
		a.transport_objet=30;
		a.escalader=4;
		a.degat=10;
		a.inventaire=new LinkedList<Objet>();
		return a;
	}
	
	static public Objet prefab_canape(){
		Objet a=new Objet("Canape");
		a.repose=7;
		a.brule=5;
		a.escalader=2;
		a.place=20;
		return a;
	}
	
	static public Objet prefab_lit(){
		Objet a=new Objet("Lit");
		a.repose=10;
		a.brule=5;
		a.escalader=2;
		a.place=20;
		return a;	
	}
	
	static public Objet prefab_toilette(){
		Objet a=new Objet("Toilette");
		a.repose=2;
		a.escalader=2;
		a.place=20;
		a.hygiene=1;
		a.besoin_eau=true;
		a.degat=5;
		return a;
	}
	
	static public Objet prefab_douche(){
		Objet a=new Objet("Douche");
		a.repose=1;
		a.place=20;
		a.besoin_eau=true;
		a.hygiene=10;
		return a;
	}
	
	static public Objet prefab_chaiseBois(){
		Objet a=new Objet("Chaise en bois");
		a.escalader=1;
		a.place=4;
		a.fun=1;
		a.degat=3;
		a.fumer=1;
		a.brule=5;
		a.support_ecriture=1;
		return a;
	}
	
	
	private static List<Objet> remplir_frigo() {
		return null;
	}
}
