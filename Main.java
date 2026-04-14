public class Main {
	public static void main(String[] args) {

		TV tv = new TV();
		Projetor projetor = new Projetor();
	    Receiver receiver = new Receiver();
	    PlayerMidia playerMidia = new PlayerMidia("Netflix");
	    SistemaSom sistemaSom = new sistemaSom();
	    LuzAmbiente luzAmbiente = new luzAmbiente();

		HomeTheater ht = new HomeTheater(tv, projetor, receiver, playerMidia, sistemaSom, luzAmbiente);

		Fachada f = new Fachada(ht);
		f.assitirFilme("Projetor");
		f.ouvirMusica();
	}
}