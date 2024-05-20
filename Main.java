import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static UtilizadorDAO utilizadorDAO = new UtilizadorDAO(); // Instância do DAO de Utilizadores

    public static void main(String[] args) {
        exibirMenuPrincipal();
    }

    private static void exibirMenuPrincipal() {
        int opcao;
        do {
            System.out.println("Bem-vindo ao sistema de gestão de reservas de hotéis!");
            System.out.println("1. Login");
            System.out.println("2. Criar nova conta");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    fazerLogin();
                    break;
                case 2:
                    criarConta();
                    break;
                case 0:
                    System.out.println("Obrigado por utilizar nosso sistema. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    private static void fazerLogin() {
        System.out.println("=== Login ===");
        System.out.print("Nome de utilizador: ");
        String nomeUtilizador = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        // Verificar autenticação
        UtilizadorDTO utilizador = utilizadorDAO.lerUtilizadorPorNome(nomeUtilizador);
        if (utilizador != null && utilizador.getSenha().equals(senha)) {
            System.out.println("Login bem-sucedido. Bem-vindo, " + utilizador.getNome() + "!");
            // Chamar menu após login bem-sucedido
            // exibirMenuUtilizador(); // Você pode implementar este método para o menu do utilizador
        } else {
            System.out.println("Nome de utilizador ou senha inválidos. Por favor, tente novamente.");
        }
    }

    private static void criarConta() {
        System.out.println("=== Criar nova conta ===");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Nome de utilizador: ");
        String nomeUtilizador = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        // Defina o tipo de utilizador como cliente por padrão
        UtilizadorDTO novoUtilizador = new UtilizadorDTO(nome, email, telefone, nomeUtilizador, senha, "cliente");

        // Crie o utilizador no banco de dados
        UtilizadorDTO utilizadorCriado = utilizadorDAO.criarUtilizador(novoUtilizador);
        if (utilizadorCriado != null) {
            System.out.println("Conta criada com sucesso para o utilizador " + utilizadorCriado.getNome() + ".");
        } else {
            System.out.println("Ocorreu um erro ao criar a conta. Por favor, tente novamente.");
        }
    }
}

