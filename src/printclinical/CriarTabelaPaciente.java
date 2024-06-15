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
public class CriarTabelaPaciente {
    
    public static void main(String[] args) {
        // URL de conexão com o banco de dados
        String url = "jdbc:mysql://localhost:3306/PrintClinical";
        // Nome de usuário do banco de dados
        String usuario = "root";
        // Senha do banco de dados
        String senha = "admin123";

        // Comando SQL para criar a tabela de pacientes
        String sql = "CREATE TABLE paciente (" +
                     "id INT AUTO_INCREMENT PRIMARY KEY," +
                     "nome VARCHAR(100) NOT NULL," +
                     "idade INT NOT NULL," +
                     "cpf VARCHAR(14) NOT NULL," +
                     "rg VARCHAR(12) NOT NULL," +
                     "endereco VARCHAR(200) NOT NULL," +
                     "cidade VARCHAR(100) NOT NULL," +
                     "estado VARCHAR(2) NOT NULL," +
                     "cep VARCHAR(9) NOT NULL," +
                     "convenio VARCHAR(100) NOT NULL," +
                     "numero_convenio VARCHAR(20) NOT NULL," +
                     "comorbidades VARCHAR(200)" +
                     ")";

        try (Connection conexao = DriverManager.getConnection(url, usuario, senha);
             Statement declaracao = conexao.createStatement()) {
            // Executa o comando SQL para criar a tabela de pacientes
            declaracao.executeUpdate(sql);
            System.out.println("Tabela de pacientes criada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao criar a tabela de pacientes: " + e.getMessage());
        }
    }
    
}
