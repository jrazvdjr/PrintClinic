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
public class CriarTabelaAdmin {
    
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/PrintClinical";
        String username = "root";
        String password = "admin123";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String createTableQuery = "CREATE TABLE admin (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "email VARCHAR(255) NOT NULL," +
                    "senha VARCHAR(255) NOT NULL" +
                    ");";

            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(createTableQuery);
                System.out.println("Tabela 'admin' criada com sucesso!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
