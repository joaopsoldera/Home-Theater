public class Receiver {
    private String marca;
    private int canais;
    private double potenciaWatts;

    public Receiver() {}

    public Receiver(String marca, int canais, double potenciaWatts) {
        this.marca = marca;
        this.canais = canais;
        this.potenciaWatts = potenciaWatts;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getCanais() { return canais; }
    public void setCanais(int canais) { this.canais = canais; }

    public double getPotenciaWatts() { return potenciaWatts; }
    public void setPotenciaWatts(double potenciaWatts) { this.potenciaWatts = potenciaWatts; }
}