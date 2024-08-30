package Interface;

public class Calculos implements Calculo {
	
	
	@Override
	public double somar() {
		return 10+14;
	}
	
	@Override
	public double sub() {
		return 15-14;
	}
	
	@Override
	public double multi() {
		return 15*12;
	}
	
	@Override
	public int div() {
		return 15/5;
	}
	
	@Override
	public int exp() {
		return 2*2*2;
	}
}
