public class TV {
    private String marca;
    private int polegadas;
    private String resolucao;
    private boolean smart;

    public TV() {}

    public TV(String marca, int polegadas, String resolucao, boolean smart) {
        this.marca = marca;
        this.polegadas = polegadas;
        this.resolucao = resolucao;
        this.smart = smart;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getPolegadas() { return polegadas; }
    public void setPolegadas(int polegadas) { this.polegadas = polegadas; }

    public String getResolucao() { return resolucao; }
    public void setResolucao(String resolucao) { this.resolucao = resolucao; }

    public boolean isSmart() { return smart; }
    public void setSmart(boolean smart) { this.smart = smart; }
}