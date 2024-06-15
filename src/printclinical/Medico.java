/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printclinical;

/**
 *
 * @author Win10
 */
 
 
public class Medico extends Usuario {
    private String crm;
    private String especialidade;

    // Construtor padrão
    public Medico() {
        super();
    }

    // Construtor com todos os campos, incluindo os da classe Usuario
    public Medico(String nome, int idade, String dataNascimento, String logradouro, String bairro, String cidade, String estado, String cep, String telefone, String cpf, String rg, String crm, String especialidade) {
        super(nome, idade, dataNascimento, logradouro, bairro, cidade, estado, cep, telefone, cpf, rg);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    // Getters e Setters
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
