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
public class CriarTabelaMedico {
    
    // URL de conexão com o banco de dados (substitua com suas próprias configurações)
    static final String URL = "jdbc:mysql://localhost:3306/PrintClinical";
    static final String USUARIO = "root";
    static final String SENHA = "admin123";

    // Comando SQL para criar a tabela de médico
    static final String SQL_CRIAR_TABELA = "CREATE TABLE IF NOT EXISTS medico (" +
            "id INT AUTO_INCREMENT PRIMARY KEY," +
            "nome VARCHAR(100) NOT NULL," +
            "idade INT NOT NULL," +
            "cpf VARCHAR(14) NOT NULL," +
            "rg VARCHAR(12) NOT NULL," +
            "crm VARCHAR(20) NOT NULL," +
            "especialidade VARCHAR(100) NOT NULL," +
            "logradouro VARCHAR(100) NOT NULL," +
            "bairro VARCHAR(100) NOT NULL," +
            "cidade VARCHAR(100) NOT NULL," +
            "estado VARCHAR(100) NOT NULL," +
            "cep VARCHAR(9) NOT NULL," +
            "telefone VARCHAR(20) NOT NULL" +
            ")";

    public static void main(String[] args) {
        try (Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
             Statement declaracao = conexao.createStatement()) {

            // Executar o comando SQL para criar a tabela de médico
            declaracao.executeUpdate(SQL_CRIAR_TABELA);

            System.out.println("Tabela de médico criada com sucesso.");

        } catch (SQLException e) {
            System.out.println("Erro ao criar a tabela de médico: " + e.getMessage());
        }
    }
    
}
