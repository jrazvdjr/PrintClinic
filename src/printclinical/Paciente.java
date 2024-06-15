/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printclinical;

/**
 *
 * @author Win10
 */

public class Paciente extends Usuario {
    private String convenio;
    private String numeroConvenio;
    private String comorbidades;

    // Construtor padrão
    public Paciente() {
        super();
    }

    // Construtor com todos os campos, incluindo os da classe Usuario
    public Paciente(String nome, int idade, String dataNascimento, String logradouro, String bairro, String cidade, String estado, String cep, String telefone, String cpf, String rg, String convenio, String numeroConvenio, String comorbidades) {
        super(nome, idade, dataNascimento, logradouro, bairro, cidade, estado, cep, telefone, cpf, rg);
        this.convenio = convenio;
        this.numeroConvenio = numeroConvenio;
        this.comorbidades = comorbidades;
    }

    // Getters e Setters
    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getNumeroConvenio() {
        return numeroConvenio;
    }

    public void setNumeroConvenio(String numeroConvenio) {
        this.numeroConvenio = numeroConvenio;
    }

    public String getComorbidades() {
        return comorbidades;
    }

    public void setComorbidades(String comorbidades) {
        this.comorbidades = comorbidades;
    }
}
