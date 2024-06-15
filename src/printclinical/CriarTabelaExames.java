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
public class CriarTabelaExames {
    
    public static void main(String[] args) {
        // Dados de conexão com o banco de dados
        String url = "jdbc:mysql://localhost:3306/PrintClinical";
        String usuario = "root";
        String senha = "admin123";

        // Declaração SQL para criar a tabela
        String sql = "CREATE TABLE IF NOT EXISTS exames (" +
                     "id INT AUTO_INCREMENT PRIMARY KEY," +
                     "nome_paciente VARCHAR(100) NOT NULL," +
                     "data_consulta VARCHAR(10) NOT NULL," +
                     "nome_medico VARCHAR(100) NOT NULL," +
                     "especialidade VARCHAR(100) NOT NULL," +
                     "exames TEXT NOT NULL" +
                     ")";

        try (Connection conexao = DriverManager.getConnection(url, usuario, senha);
             Statement declaracao = conexao.createStatement()) {
            
            // Executar o comando SQL para criar a tabela
            declaracao.executeUpdate(sql);
            
            System.out.println("Tabela prescricao criada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao criar a tabela prescricao: " + e.getMessage());
        }
    }
    
    
}
