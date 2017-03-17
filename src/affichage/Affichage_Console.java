package affichage;

import java.util.LinkedList;
import java.util.Scanner;

import actions.*;
import main.Lancer;
import moteur.*;

public class Affichage_Console implements _Affichage {
	
	public static Scanner sc = new Scanner(System.in);
	
	
	public static void clearScreen() {  
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	    System.out.flush();  
	   }
	
	public static void PressToGo(){
		System.out.println("Appuyez sur entree pour continuer..");
		try{System.in.read();}
		catch(Exception e){}
		sc.nextLine();
		clearScreen();
	}
	
	@Override
	public String Start(Player p) {
			String s;
			System.out.println("Bienvenue dans ce monde..");
			System.out.println("Petit conseil, agrandissez la fenetre");
			System.out.print("Quel est ton prenom ? ");
			s=sc.nextLine();
			System.out.println("Bonne chance "+ s +"..");
			
			System.out.println("Tout commence dans votre chambre.");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			clearScreen();
		return s;
	}

	@Override
	public void PrintBackpack(Player p) {
				System.out.println("Inventaire :");
		if(p.inventaire.size()==0){
				System.out.println("     - Vide...   R.I.P.");
		}
		else{
			for(int i=0;i<p.inventaire.size();i++){
				System.out.println("     - "+p.inventaire.get(i).name);
			}
		}
		
		PressToGo();
	}

	@Override
	public void PrintItemsNear(Player p) {
			endroit e = p.endroit();
			if(e.inventaire.size()==0){
				System.out.println("Cet endroit est plus que vide..");
			}
			else{
					System.out.println("Liste des objets :");
				for(int i=0;i<e.inventaire.size();i++){
					System.out.println("    - "+e.inventaire.get(i).name);
				}
			}
		PressToGo();
	}

	@Override
	public Objet ChooseItem(Player p) {
		Objet o;
		String s;
		int choix;
		System.out.println("Objet de l'inventaire ou du lieu ?");
		s=sc.nextLine().toLowerCase();
		if(s.equals("inventaire")){
			System.out.println("Entrez le numero de l'objet voulu :");
			for(int i=0;i<p.inventaire.size();i++){
				System.out.println("    "+(i+1)+"- "+p.inventaire.get(i).name);
			}
			choix=sc.nextInt();
			
			if(choix<1 || choix>p.inventaire.size()){
				System.out.println("Cet objet n'existe pas.");
				return null;
			}
			o=p.inventaire.get(choix-1);
			System.out.println("Objet choisit : "+o.name);
			sc.nextLine();
		return o;
		}
		else if(s.equals("lieu")){
			System.out.println("Entrez le numero de l'objet voulu :");
			for(int i=0;i<p.endroit().inventaire.size();i++){
				System.out.println("    "+(i+1)+"- "+p.endroit().inventaire.get(i).name);
			}
			choix=sc.nextInt();
			if(choix<1 || choix>p.endroit().inventaire.size()){
				System.out.println("Cet objet n'existe pas.");
				return null;
			}
			o=p.endroit().inventaire.get(choix-1);
			System.out.println("Objet choisit : "+o.name);
			sc.nextLine();
		return o;
		}
		
		
		return null;
	}

	@Override
	public void update(Player p) {
		int count = (p.endroit().SortieEst?1:0) + (p.endroit().SortieSud?1:0) + (p.endroit().SortieOuest?1:0) + (p.endroit().SortieNord?1:0);
		if(p.PieceActuelle!=null){
				System.out.println("Vous voilà dans une piece..");
			if(count>0){
				System.out.println("Vous remarquez " +count+" porte"+ ((count>1)?"s ":" "));
				System.out.println(((count>1)?"leur positions ":"sa position :"));
				
				if(p.endroit().SortieNord) System.out.println("    - Nord");
				if(p.endroit().SortieEst) System.out.println("    - Est");
				if(p.endroit().SortieSud) System.out.println("    - Sud");
				if(p.endroit().SortieOuest) System.out.println("    - Ouest");
					
				
				
			}
			else{
				System.out.println("Aucune porte de visible..");
			}
				if(((Piece)p.endroit()).sortie){
					System.out.println("Il y a une sortie !");
				}
				
				
			System.out.println("Entrez " + Lancer.langue.help()+ " pour plus d'info sur les commandes");
			
		}
		else{
			System.out.println("Vous voilà dehors..");
			
			if(count>0){
				System.out.println("Vous remarquez " +count+" sortie"+ ((count>1)?"s ":" ") );
				System.out.println("leur position"+ ((count>1)?"s : ":" :"));
				
				if(p.endroit().SortieNord) System.out.println("    - Nord");
				if(p.endroit().SortieEst) System.out.println("    - Est");
				if(p.endroit().SortieSud) System.out.println("    - Sud");
				if(p.endroit().SortieOuest) System.out.println("    - Ouest");
					
				
				
			}
			else{
				System.out.println("Impossible de se deplacer depuis l'exterieur..");
			}
			
			if(((Lieu)p.endroit()).entree){
				System.out.println("Il y a une porte !");
			}
			
			System.out.println("Entrez " + Lancer.langue.help()+ " pour plus d'info sur les commandes");

		}
		
		
	}

	@Override
	public String GetAction(LinkedList<£Action> l) {
		String s;
		System.out.print("\nQue voulez-vous faire ? ");
		s=sc.nextLine();
		return s;
	}

	@Override
	public void PrintHelp() {
		System.out.println("Aide :");
		System.out.println("    - help       : Affiche certaine commande");
		System.out.println("    - observer   : Affiche la liste des objets proche");
		System.out.println("    - inventaire : Affiche l'inventaire du joueur");
		System.out.println("    - utiliser   : Permet d'utiliser un objet");
		System.out.println("");
		System.out.println("Pour vous deplacer, entrez une direction (exemple : \"nord\") ou \"sortir\" et \"entrer\"");
		System.out.println("\nIl manque plein d'autre commandes, a vous de les trouver :D");
		
		
		PressToGo();
	}

	@Override
	public void PrintMiss() {
		System.out.println("Je n'ai pas compris..");
		PressToGo();
	}

	@Override
	public void PositionChanged(String direction) {
		System.out.println("Vous allez donc au "+direction);
		
	}

	@Override
	public void ActionDone(£Action a, Objet o) {
		if(a instanceof Nord || a instanceof Sud || a instanceof Est || a instanceof Ouest || a instanceof Sortir || a instanceof Entrer){
			System.out.println("Vous vous deplacez..");
			
		}
		else if(a instanceof Jeter){
			System.out.println("Vous Jetez "+o.name+" par terre.");
		}
	
		PressToGo();
	}

}
