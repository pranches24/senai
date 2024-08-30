package Interface;

public class Home  implements Computador {
	
	@Override
	public void ligar() {
		System.out.println("Ligando");
	}
	
	@Override
	public void reiniciar() {
		System.out.println("reiniciando");
	}
	
	@Override
	public void desligar() {
		System.out.println("desligando");
	}
	
	@Override
	public void carregandositema() {
		System.out.println("carregandosistema");
	}

}


