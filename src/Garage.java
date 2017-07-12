import java.util.ArrayList;
import java.util.List;

public class Garage {
	protected List<Vehicule> voitures = new ArrayList<Vehicule>();
	

	public String toString(){
		return "liste de voitures :";
	}
	
	public void addVoiture(Vehicule voiture) {
		voitures.add(voiture);
	}
}
