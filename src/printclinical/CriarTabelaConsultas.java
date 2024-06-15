/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printclinical;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Win10
 */
public class CriarTabelaConsultas {
    
    public static void main(String[] args) {
        // URL de conexão com o banco de dados
        String url = "jdbc:mysql://localhost:3306/PrintClinical";
        // Nome de usuário do banco de dados
        String usuario = "root";
        // Senha do banco de dados
        String senha = "admin123";

        // Comando SQL para criar a tabela de consultas
        String sql = "CREATE TABLE consultas (" +
                     "id INT AUTO_INCREMENT PRIMARY KEY," +
                     "nome_paciente VARCHAR(100) NOT NULL," +
                     "nome_medico VARCHAR(100) NOT NULL," +
                     "especialidade_escolhida VARCHAR(100) NOT NULL," +
                     "data VARCHAR(10) NOT NULL," +
                     "horario VARCHAR(5) NOT NULL" +
                     ")";

        try (Connection conexao = DriverManager.getConnection(url, usuario, senha);
             Statement declaracao = conexao.createStatement()) {
            // Executa o comando SQL para criar a tabela de consultas
            declaracao.executeUpdate(sql);
            System.out.println("Tabela de consultas criada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao criar a tabela de consultas: " + e.getMessage());
        }
    }
    
}
