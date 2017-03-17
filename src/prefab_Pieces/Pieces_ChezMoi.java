package prefab_Pieces;
import moteur.*;

public class Pieces_ChezMoi {
	static public Piece prefab_MaChambre(){
		Piece a=new Piece();
		a.airmetique=10;
		a.taille=3;
		a.electricite=10;
		a.inventaire.add(prefab_objects.Objects_boissons.prefab_BouteilleCocaPleine());
		a.inventaire.add(prefab_objects.Objects_Pc.prefab_PcWindows());
		a.inventaire.add(prefab_objects.Objects_nourriture.prefab_PaquetChipsVide());
		a.inventaire.add(prefab_objects.Objects_ustensiles.prefab_Verre());
		a.inventaire.add(prefab_objects.Objects_livres.prefab_LivreVide());
		a.inventaire.add(prefab_objects.Objects_electromenage.prefab_lit());
		a.inventaire.add(prefab_objects.Objects_outils.prefab_mouchoir());
		return a;
	}
	
	static public Piece prefab_Salon1(){
		Piece a= new Piece();
		a.airmetique=10;
		a.taille=4;
		a.electricite=10;
		a.inventaire.add(prefab_objects.Objects_electromenage.prefab_canape());
		a.inventaire.add(prefab_objects.Objects_nourriture.prefab_PaquetChipsPlein());
		a.inventaire.add(prefab_objects.Objects_boissons.prefab_BouteilleBiereVide());
		a.inventaire.add(prefab_objects.Objects_Pc.prefab_Tele());
		return a;
	}
	
	static public Piece prefab_Cuisine1(){
		Piece a= new Piece();
		a.airmetique=10;
		a.taille=4;
		a.eau_disponible=10;
		a.electricite=10;
		a.inventaire.add(prefab_objects.Objects_electromenage.prefab_frigoPlein());
		a.inventaire.add(prefab_objects.Objects_livres.prefab_LivrePleinInutile());
		a.inventaire.add(prefab_objects.Objects_ustensiles.prefab_Verre());	
		a.inventaire.add(prefab_objects.Objects_ustensiles.prefab_Bol());
		return a;
	}
	
	static public Piece prefab_toilette1(){
		Piece a= new Piece();
		a.airmetique=10;
		a.taille=4;
		a.eau_disponible=10;
		a.electricite=10;
		a.inventaire.add(prefab_objects.Objects_electromenage.prefab_douche());
		a.inventaire.add(prefab_objects.Objects_electromenage.prefab_toilette());
		a.inventaire.add(prefab_objects.Objects_ustensiles.prefab_Verre());
		return a;
	}
	
}
