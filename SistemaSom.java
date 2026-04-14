public class SistemaSom {
    private int quantidadeCaixas;
    private boolean subwoofer;
    private double potenciaTotal;

    public SistemaSom() {}

    public SistemaSom(int quantidadeCaixas, boolean subwoofer, double potenciaTotal) {
        this.quantidadeCaixas = quantidadeCaixas;
        this.subwoofer = subwoofer;
        this.potenciaTotal = potenciaTotal;
    }

    public int getQuantidadeCaixas() { return quantidadeCaixas; }
    public void setQuantidadeCaixas(int quantidadeCaixas) { this.quantidadeCaixas = quantidadeCaixas; }

    public boolean isSubwoofer() { return subwoofer; }
    public void setSubwoofer(boolean subwoofer) { this.subwoofer = subwoofer; }

    public double getPotenciaTotal() { return potenciaTotal; }
    public void setPotenciaTotal(double potenciaTotal) { this.potenciaTotal = potenciaTotal; }
}