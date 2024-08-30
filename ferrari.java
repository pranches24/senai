package Interface;

public class ferrari implements VAeiculo{
	
	@Override
	public void Ligar() {
		System.out.println("Ligando");
	}
	
	@Override
	public void Desligar() {
		System.out.println("Desligando");
	}
	
	@Override
	public void Manobrar() {
		System.out.println("Manobrando");
	}
	
	@Override
	public void Engatar() {
		System.out.println("Engatando");
	}
	
	@Override
	public void Acelerar() {
		System.out.println("Acelerando");
	}
	
	@Override
	public void Frear() {
		System.out.println("Freando");
	}

}
