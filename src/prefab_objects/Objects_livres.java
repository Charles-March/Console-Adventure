package prefab_objects;
import moteur.*;

public class Objects_livres {
	static public Objet prefab_LivreVide(){
		Objet a=new Objet("Livre");
		a.support_ecriture=10;
		a.fumer=5;
		a.brule=10;
		a.degat=1;
		return a;
	}
	
	static public Objet prefab_LivrePleinInutile(){
		Objet a=new Objet("Livre");
		a.fun=10;
		a.fumer=5;
		a.brule=10;
		a.degat=1;
		return a;
	}
}
