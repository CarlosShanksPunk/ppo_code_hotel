

public abstract class Acomodacao implements Reservavel {
    private String tipo;
    private int quantidadeDeLeitos;
    private double precoBase;
    private boolean isDisponivel;

    public Acomodacao(String tipo, int quantidadeDeLeitos, double precoBase) {
        this.tipo = tipo;
        this.quantidadeDeLeitos = quantidadeDeLeitos;
        this.precoBase = precoBase;
        this.isDisponivel = true;
    }

    public String getTipo() {
        return tipo;
    }

    public int getQuantidadeDeLeitos() {
        return quantidadeDeLeitos;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public boolean isDisponivel() {
        return isDisponivel;
    }

    public void setDisponivel(boolean disponivel) {
        isDisponivel = disponivel;
    }

    @Override
    public void reservar() {
        if (isDisponivel) {
            setDisponivel(false);
        }
    }

    @Override
    public void cancelarReserva() {
        if (!isDisponivel) {
            setDisponivel(true);
        }
    }
}
