import java.time.LocalDate;

public class Reserva {
    private Cliente cliente;
    private Hotel hotel;
    private Acomodacao acomodacao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private double valorTotal;

    public Reserva(Cliente cliente, Hotel hotel, Acomodacao acomodacao, LocalDate dataInicio, LocalDate dataFim, double valorTotal) {
        this.cliente = cliente;
        this.hotel = hotel;
        this.acomodacao = acomodacao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valorTotal = valorTotal;
    }

    // Getters e setters...

    public void atualizarReserva(LocalDate novaDataInicio, LocalDate novaDataFim, double novoValorTotal) {
        this.dataInicio = novaDataInicio;
        this.dataFim = novaDataFim;
        this.valorTotal = novoValorTotal;
    }

    public void cancelarReserva() {
        acomodacao.cancelarReserva();
    }
}
