/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author Win10
 */
public class MarcarConsultas extends javax.swing.JFrame {

    private String nomePaciente;
   
    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }
    /**
     * Creates new form MarcarConsultas
     */
    public MarcarConsultas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
      
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtnEspecialidades = new javax.swing.ButtonGroup();
        rbtnHorarios = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rbtnOrtopedia = new javax.swing.JRadioButton();
        rbtnCardiologia = new javax.swing.JRadioButton();
        rbtnDermatologia = new javax.swing.JRadioButton();
        rbtnOftalmologia = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        txtDiaCerto = new javax.swing.JTextField();
        rbtnNove = new javax.swing.JRadioButton();
        rbtnTreze = new javax.swing.JRadioButton();
        rbtnDez = new javax.swing.JRadioButton();
        rbtnCatorze = new javax.swing.JRadioButton();
        rbtnDoze = new javax.swing.JRadioButton();
        rbtnQuinze = new javax.swing.JRadioButton();
        rbtnOnze = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        btnMarcar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnPrescricao = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Especialidades: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 150, 130, 18);

        rbtnEspecialidades.add(rbtnOrtopedia);
        rbtnOrtopedia.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rbtnOrtopedia.setText("Ortopedia");
        rbtnOrtopedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnOrtopediaActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnOrtopedia);
        rbtnOrtopedia.setBounds(50, 180, 110, 23);

        rbtnEspecialidades.add(rbtnCardiologia);
        rbtnCardiologia.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rbtnCardiologia.setText("Cardiologia");
        getContentPane().add(rbtnCardiologia);
        rbtnCardiologia.setBounds(160, 180, 130, 23);

        rbtnEspecialidades.add(rbtnDermatologia);
        rbtnDermatologia.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rbtnDermatologia.setText("Dermatologia");
        getContentPane().add(rbtnDermatologia);
        rbtnDermatologia.setBounds(50, 210, 130, 23);

        rbtnEspecialidades.add(rbtnOftalmologia);
        rbtnOftalmologia.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rbtnOftalmologia.setText("Oftalmologia");
        getContentPane().add(rbtnOftalmologia);
        rbtnOftalmologia.setBounds(160, 210, 130, 23);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Dia");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 150, 21, 18);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Mês");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(420, 150, 26, 18);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ano");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(500, 150, 25, 18);

        txtMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtMes);
        txtMes.setBounds(410, 180, 50, 22);

        txtAno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtAno);
        txtAno.setBounds(490, 180, 50, 22);

        txtDiaCerto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDiaCerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaCertoActionPerformed(evt);
            }
        });
        getContentPane().add(txtDiaCerto);
        txtDiaCerto.setBounds(330, 180, 50, 22);

        rbtnHorarios.add(rbtnNove);
        rbtnNove.setText("09:00");
        rbtnNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNoveActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnNove);
        rbtnNove.setBounds(610, 180, 70, 21);

        rbtnHorarios.add(rbtnTreze);
        rbtnTreze.setText("13:00");
        getContentPane().add(rbtnTreze);
        rbtnTreze.setBounds(670, 200, 60, 21);

        rbtnHorarios.add(rbtnDez);
        rbtnDez.setText("10:00");
        getContentPane().add(rbtnDez);
        rbtnDez.setBounds(670, 180, 60, 21);

        rbtnHorarios.add(rbtnCatorze);
        rbtnCatorze.setText("14:00");
        getContentPane().add(rbtnCatorze);
        rbtnCatorze.setBounds(730, 200, 60, 21);

        rbtnHorarios.add(rbtnDoze);
        rbtnDoze.setText("12:00");
        getContentPane().add(rbtnDoze);
        rbtnDoze.setBounds(610, 200, 60, 21);

        rbtnHorarios.add(rbtnQuinze);
        rbtnQuinze.setText("15:00");
        getContentPane().add(rbtnQuinze);
        rbtnQuinze.setBounds(670, 220, 60, 21);

        rbtnHorarios.add(rbtnOnze);
        rbtnOnze.setText("11:00");
        getContentPane().add(rbtnOnze);
        rbtnOnze.setBounds(730, 180, 60, 21);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setText("Selecione um Horário");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(630, 150, 150, 18);

        btnMarcar.setBackground(new java.awt.Color(0, 0, 102));
        btnMarcar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnMarcar.setForeground(new java.awt.Color(255, 255, 255));
        btnMarcar.setText("Marcar Consulta");
        btnMarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMarcar);
        btnMarcar.setBounds(360, 230, 150, 25);

        btnSair.setBackground(new java.awt.Color(255, 0, 0));
        btnSair.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair X");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(760, 20, 70, 25);

        btnPrescricao.setBackground(new java.awt.Color(0, 0, 102));
        btnPrescricao.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnPrescricao.setForeground(new java.awt.Color(255, 255, 255));
        btnPrescricao.setText("Visualizar Prontuário");
        btnPrescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrescricaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrescricao);
        btnPrescricao.setBounds(350, 370, 190, 25);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TelasImgs/MarcaConsulta.jpeg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 860, 500);

        setSize(new java.awt.Dimension(873, 511));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnOrtopediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnOrtopediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnOrtopediaActionPerformed

    private void txtDiaCertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaCertoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaCertoActionPerformed

    private void rbtnNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnNoveActionPerformed

   private String buscarTextoExames(String nomePaciente) {
    String textoExames = "";

    try {
        // Conectar ao banco de dados
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PrintClinical", "root", "admin123");

        // Preparar a declaração SQL para buscar o texto dos exames
        String sql = "SELECT exames FROM exames WHERE nome_paciente = ? ORDER BY data_consulta DESC LIMIT 1";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, nomePaciente);

        // Executar a consulta
        ResultSet rs = statement.executeQuery();

        // Verificar se há resultados
        if (rs.next()) {
            textoExames = rs.getString("exames");
        }

        // Fechar a conexão com o banco de dados
        conn.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }

    return textoExames;
}
    
    private void btnMarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcarActionPerformed
        // TODO add your handling code here:
        // Passo 1: Capturar o nome do paciente (vamos supor que este método existe em sua classe de login)
        String nomePaciente = this.nomePaciente;

        // Passo 2: Capturar a especialidade selecionada
        String especialidade = "";
        if (rbtnOrtopedia.isSelected()) {
            especialidade = "Ortopedista";
        } else if (rbtnCardiologia.isSelected()) {
            especialidade = "Cardiologista";
        } else if (rbtnDermatologia.isSelected()) {
            especialidade = "Dermatologista";
        } else if (rbtnOftalmologia.isSelected()) {
            especialidade = "Oftalmologista";
        }

        // Passo 3: Capturar a data e o horário selecionados
        String dia = txtDiaCerto.getText();
        String mes = txtMes.getText();
        String ano = txtAno.getText();
        String data = dia + "/" + mes + "/" + ano;
        String horario = "";
        if (rbtnNove.isSelected()) {
            horario = "09:00";
        } else if (rbtnDez.isSelected()) {
            horario = "10:00";
        } else if (rbtnOnze.isSelected()) {
            horario = "11:00";
        } else if (rbtnDoze.isSelected()) {
            horario = "12:00";
        } else if (rbtnTreze.isSelected()) {
            horario = "13:00";
        } else if (rbtnCatorze.isSelected()) {
            horario = "14:00";
        } else if (rbtnQuinze.isSelected()) {
            horario = "15:00";
        }
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dataAtual = new Date();
        try {
            Date dataSelecionadaDate = dateFormat.parse(data);
            if (dataSelecionadaDate.before(dataAtual)) {
                JOptionPane.showMessageDialog(null, "A data selecionada é anterior à data atual. Por favor, selecione uma data futura.");
                return;
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

        // Passo 5: Verificar se a data selecionada é igual à data atual e se o horário selecionado é posterior ao horário atual
        if (data.equals(dateFormat.format(dataAtual))) {
            DateFormat horaFormat = new SimpleDateFormat("HH:mm");
            Date horaAtual = new Date();
            try {
                Date horarioSelecionadoDate = horaFormat.parse(horario);
                if (horarioSelecionadoDate.before(horaAtual)) {
                    JOptionPane.showMessageDialog(null, "O horário selecionado é anterior ao horário atual. Por favor, selecione um horário futuro.");
                    return;
                }
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }
        

        // Passo 4: Conectar ao banco de dados e buscar o nome do médico com a especialidade selecionada
                String nomeMedico = ""; // Inicializa o nome do médico como vazio
        try {
            // Conectar ao banco de dados
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PrintClinical", "root", "admin123");

            // Preparar a declaração SQL para buscar o nome do médico
            String sqlMedico = "SELECT nome FROM medico WHERE especialidade = ?";
            PreparedStatement statementMedico = conn.prepareStatement(sqlMedico);

            // Definir o parâmetro da especialidade na declaração SQL
            statementMedico.setString(1, especialidade);

            // Executar a consulta
            ResultSet rsMedico = statementMedico.executeQuery();

            // Se encontrar um médico com a especialidade, usar o nome dele na consulta
            if (rsMedico.next()) {
                nomeMedico = rsMedico.getString("nome");
            }

            // Fechar a conexão com o banco de dados
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        // Passo 5: Conectar ao banco de dados e inserir os dados da consulta
        try {
            // Conectar ao banco de dados
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PrintClinical", "root", "admin123");

            // Preparar a declaração SQL para inserir os dados da consulta
            String sqlConsulta = "INSERT INTO consultas (nome_paciente, nome_medico, especialidade_escolhida, data, horario) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statementConsulta = conn.prepareStatement(sqlConsulta);

            // Definir os parâmetros da declaração SQL
            statementConsulta.setString(1, nomePaciente);
            statementConsulta.setString(2, nomeMedico); // Usar o nome do médico recuperado ou um valor padrão
            statementConsulta.setString(3, especialidade);
            statementConsulta.setString(4, data);
            statementConsulta.setString(5, horario);

            // Executar a declaração SQL
            int rowsInserted = statementConsulta.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Consulta marcada com sucesso!\nEspecialidade: " + especialidade + "\nData: " + data + "\nHorário: " + horario + "\nMédico: " + nomeMedico);
            }

            // Fechar a conexão com o banco de dados
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao marcar a consulta. Por favor, tente novamente mais tarde.");
        }
        
    }//GEN-LAST:event_btnMarcarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        Login telaLogin = new Login();
        dispose();
        telaLogin.setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    private String buscarTextoPrescricao(String nomePaciente) {
    String textoPrescricao = "";

    try {
        // Conectar ao banco de dados
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PrintClinical", "root", "admin123");

        // Preparar a declaração SQL para buscar o texto dos exames
        String sql = "SELECT prescricao FROM prescricao WHERE nome_paciente = ? ORDER BY data_consulta DESC LIMIT 1";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, nomePaciente);

        // Executar a consulta
        ResultSet rs = statement.executeQuery();

        // Verificar se há resultados
        if (rs.next()) {
            textoPrescricao = rs.getString("prescricao");
        }

        // Fechar a conexão com o banco de dados
        conn.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }

    return textoPrescricao;
}
  
    
    private void btnPrescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrescricaoActionPerformed
        // TODO add your handling code here:
         String textoPrescricao = buscarTextoPrescricao(nomePaciente);

            // Cria uma instância da classe PacienteExames
            PacientePrescicao PacientePrescricaoFrame = new PacientePrescicao();

            // Define o texto dos exames na JTextArea na classe PacienteExames
            PacientePrescricaoFrame.setTextoPrescricao(textoPrescricao);

            // Torna visível a janela PacienteExames
            PacientePrescricaoFrame.setVisible(true); 
        
    }//GEN-LAST:event_btnPrescricaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MarcarConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarcarConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarcarConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarcarConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarcarConsultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMarcar;
    private javax.swing.JButton btnPrescricao;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton rbtnCardiologia;
    private javax.swing.JRadioButton rbtnCatorze;
    private javax.swing.JRadioButton rbtnDermatologia;
    private javax.swing.JRadioButton rbtnDez;
    private javax.swing.JRadioButton rbtnDoze;
    private javax.swing.ButtonGroup rbtnEspecialidades;
    private javax.swing.ButtonGroup rbtnHorarios;
    private javax.swing.JRadioButton rbtnNove;
    private javax.swing.JRadioButton rbtnOftalmologia;
    private javax.swing.JRadioButton rbtnOnze;
    private javax.swing.JRadioButton rbtnOrtopedia;
    private javax.swing.JRadioButton rbtnQuinze;
    private javax.swing.JRadioButton rbtnTreze;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtDiaCerto;
    private javax.swing.JTextField txtMes;
    // End of variables declaration//GEN-END:variables

    
}
