public class FachadaHT {
	private HomeTheater ht;

	public FachadaHT(HomeTheater ht) {
		this.ht = ht;
	}

	public void assistirFilme(String tipoImagem) {
        if (tipoImagem == "Projetor") {
        	ht.projetor.ligarProjetor();
        } else {
        	ht.tv.ligarTV();
        }

        ht.sistemaSom.ligarSom();

        ht.playerMidia.ligarPlayerMidia();

        ht.luzAmbiente.desligarLuz();
    }

    public void ouvirMusica() {
    	ht.sistemaSom.ligarSom();
    }
}
