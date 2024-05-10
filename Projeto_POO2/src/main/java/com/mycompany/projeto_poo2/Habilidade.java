package com.mycompany.projeto_poo2;

public class Habilidade {
    private String descricao;
    private String efeito;
    private String nome;

    public Habilidade(String descricao, String efeito, String nome) {
        this.descricao = descricao;
        this.efeito = efeito;
        this.nome = nome;
    }

    public void consultarHabilidade(){

    }

    public void alterarHabilidade(){

    }

    public void excluirHabilidade(){

    }

    public void cadastrarHabilidade(){

    }

    //getters e setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEfeito() {
        return efeito;
    }

    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
