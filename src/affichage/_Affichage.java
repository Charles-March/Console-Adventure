package affichage;

import java.util.LinkedList;
import actions.*;
import moteur.*;

public interface _Affichage {
	public String Start(Player p);
	public void PrintBackpack(Player p);
	public void PrintItemsNear(Player p);
	public Objet ChooseItem(Player p);
	public void update(Player p);
	public String GetAction(LinkedList<£Action> l);
	public void PrintHelp();
	public void PrintMiss();
	public void PositionChanged(String direction);
	public void ActionDone(£Action a, Objet o);
	
}
