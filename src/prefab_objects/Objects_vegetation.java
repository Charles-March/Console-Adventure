package prefab_objects;

import moteur.Objet;

public class Objects_vegetation {
	static public Objet Arbre(){
		Objet a=new Objet("Arbre");
		a.fumer=5;
		a.brule=7;
		a.degat=10;
		a.place=15;
		a.creuse=4;
		a.fun=1;
		a.support_ecriture=2;
		a.repose=1;
	return a;
	}
}
