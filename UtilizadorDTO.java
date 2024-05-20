public class UtilizadorDTO {
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String nomeUtilizador;
    private String senha;
    private String tipo;

    // Construtor
    public UtilizadorDTO(String nome, String email, String telefone, String nomeUtilizador, String senha, String tipo) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.nomeUtilizador = nomeUtilizador;
        this.senha = senha;
        this.tipo = tipo;
    }

    // Getters e setters
    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }
}
