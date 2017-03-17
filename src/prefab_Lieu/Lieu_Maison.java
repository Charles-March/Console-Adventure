package prefab_Lieu;

import moteur.*;

public class Lieu_Maison {
	
	static public Lieu maMaison1(){
		Lieu a=new Lieu();
		Piece chambre=prefab_Pieces.Pieces_ChezMoi.prefab_MaChambre();
		Piece cuisine=prefab_Pieces.Pieces_ChezMoi.prefab_Cuisine1();
		Piece toilette=prefab_Pieces.Pieces_ChezMoi.prefab_toilette1();
		Piece Salon = prefab_Pieces.Pieces_ChezMoi.prefab_Salon1();
		
		chambre.Nord=cuisine;
		chambre.SortieNord=true;
		
		cuisine.Sud=chambre;
		cuisine.Ouest=toilette;
		cuisine.Nord=Salon;
		cuisine.SortieEst=true;
		cuisine.SortieNord=true;
		cuisine.SortieSud=true;
		
		toilette.Est=cuisine;
		toilette.SortieEst=true;
		
		Salon.Sud=cuisine;
		Salon.SortieSud=true;
		
		a.EntreePiece=Salon;
		a.entree=true;
		
		Salon.sortie=true;
		Salon.Nord=a;
		a.EntreePiece.Sortie=a;
		
		a.inventaire.add(prefab_objects.Objects_vegetation.Arbre());
		return a;
	}
}
