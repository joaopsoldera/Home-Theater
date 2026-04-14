public class HomeTheater {
    private TV tv;
    private Projetor projetor;
    private Receiver receiver;
    private PlayerMidia playerMidia;
    private SistemaSom sistemaSom;
    private LuzAmbiente luzAmbiente;

    public HomeTheater() {}

    public HomeTheater(TV tv, Projetor projetor, Receiver receiver,
                       PlayerMidia playerMidia, SistemaSom sistemaSom,
                       LuzAmbiente luzAmbiente) {
        this.tv = tv;
        this.projetor = projetor;
        this.receiver = receiver;
        this.playerMidia = playerMidia;
        this.sistemaSom = sistemaSom;
        this.luzAmbiente = luzAmbiente;
    }

    public TV getTv() { return tv; }
    public void setTv(TV tv) { this.tv = tv; }

    public Projetor getProjetor() { return projetor; }
    public void setProjetor(Projetor projetor) { this.projetor = projetor; }

    public Receiver getReceiver() { return receiver; }
    public void setReceiver(Receiver receiver) { this.receiver = receiver; }

    public PlayerMidia getPlayerMidia() { return playerMidia; }
    public void setPlayerMidia(PlayerMidia playerMidia) { this.playerMidia = playerMidia; }

    public SistemaSom getSistemaSom() { return sistemaSom; }
    public void setSistemaSom(SistemaSom sistemaSom) { this.sistemaSom = sistemaSom; }

    public LuzAmbiente getLuzAmbiente() { return luzAmbiente; }
    public void setLuzAmbiente(LuzAmbiente luzAmbiente) { this.luzAmbiente = luzAmbiente; }
}
