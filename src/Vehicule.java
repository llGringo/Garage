import java.util.ArrayList;
import java.util.List;

import fr.garage.options.Options;

public class Vehicule extends Garage{
	protected Double prix = null;
	protected String nom = "";
	protected List<Options> options = new ArrayList<Options>();
	protected Marque nomMarque = Marque.valueOf(null);
}
