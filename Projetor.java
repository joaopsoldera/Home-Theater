public class Projetor {
    private String marca;
    private int brilhoLumens;
    private String resolucao;
    private boolean 3D;

    public Projetor() {}

    public Projetor(String marca, int brilhoLumens, String resolucao, boolean is3D) {
        this.marca = marca;
        this.brilhoLumens = brilhoLumens;
        this.resolucao = resolucao;
        this._3D = is3D;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getBrilhoLumens() { return brilhoLumens; }
    public void setBrilhoLumens(int brilhoLumens) { this.brilhoLumens = brilhoLumens; }

    public String getResolucao() { return resolucao; }
    public void setResolucao(String resolucao) { this.resolucao = resolucao; }

    public boolean is3D() { return _3D; }
    public void set3D(boolean is3D) { this._3D = is3D; }
}