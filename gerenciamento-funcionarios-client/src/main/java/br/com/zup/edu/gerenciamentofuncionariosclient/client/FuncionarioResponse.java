package br.com.zup.edu.gerenciamentofuncionariosclient.client;

import java.math.BigDecimal;

public class FuncionarioResponse {
    private Long id;
    private String nome;
    private String cpf;
    private String cargo;
    private BigDecimal salario;

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

    public FuncionarioResponse(Long id, String nome, String cpf, String cargo, BigDecimal salario) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }
}
