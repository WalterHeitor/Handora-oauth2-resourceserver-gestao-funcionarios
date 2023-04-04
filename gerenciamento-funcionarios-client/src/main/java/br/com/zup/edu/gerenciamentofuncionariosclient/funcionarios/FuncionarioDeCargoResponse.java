package br.com.zup.edu.gerenciamentofuncionariosclient.funcionarios;

import br.com.zup.edu.gerenciamentofuncionariosclient.client.FuncionarioResponse;

import java.math.BigDecimal;

public class FuncionarioDeCargoResponse {

    private Long id;
    private String nome;
    private String cpf;
    private String cargo;
    private BigDecimal salario;

    public FuncionarioDeCargoResponse(FuncionarioResponse response) {
        this.id = response.getId();
        this.nome = response.getNome();
        this.cpf = response.getCpf();
        this.cargo = response.getCargo();
        this.salario = response.getSalario();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }
}
