public class Funcionario extends Utilizador {
    public Funcionario(String nome, String email, String telefone) {
        super(nome, email, telefone);
    }

    public void adicionarAcomodacao(Hotel hotel, Acomodacao acomodacao) {
        hotel.adicionarAcomodacao(acomodacao);
    }
}
