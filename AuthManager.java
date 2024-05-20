import java.util.HashMap;
import java.util.Map;

public class AuthManager {
    private Map<String, String> users = new HashMap<>(); // Armazena os nomes de usuário e senhas

    public AuthManager() {
        // Adiciona usuários de exemplo
        users.put("cliente", "senha");
        users.put("funcionario", "senha");
    }

    public boolean login(String username, String password) {
        // Verifica se o nome de usuário existe e se a senha corresponde
        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Login bem-sucedido para: " + username);
            return true;
        } else {
            System.out.println("Falha no login para: " + username);
            return false;
        }
    }
}
