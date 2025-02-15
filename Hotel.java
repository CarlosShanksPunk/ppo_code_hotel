import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nome;
    private String localizacao;
    private List<Acomodacao> acomodacoes;

    public Hotel(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.acomodacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public List<Acomodacao> getAcomodacoes() {
        return acomodacoes;
    }

    public void adicionarAcomodacao(Acomodacao acomodacao) {
        acomodacoes.add(acomodacao);
    }
}
