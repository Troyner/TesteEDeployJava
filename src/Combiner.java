
public class Combiner implements Combinable {

	@Override
	public Integer combiner(Integer primeiro, Integer acumular) {
		return (primeiro * primeiro) + acumular;
	}

	
	
}
