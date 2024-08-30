package Interface;

public class PrincipalGamer {

	public static void main(String[] args) {
		
		Gamer Megatron = new Gamer();
		Home Dell = new Home();
		
		Megatron.ligar();
		Megatron.reiniciar();
		Megatron.desligar();
		Megatron.carregandositema();
		
		System.out.println("********************");
		
		Dell.ligar();
		Dell.reiniciar();
		Dell.desligar();
		Dell.carregandositema();
		
	}

}
