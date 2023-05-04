package com.ultimaschool.pessoas;

public abstract class Pessoa implements PessoaIF {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private char genero;

    public Pessoa(String nome, char genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    private String tratamentoGenero() {
        if (getGenero() == 'M') {
            return "O";
        } else if( getGenero() == 'F') {
            return "A";
        } else {
            return " ";
        }
    }
}
