package com.mycompany.projeto_poo2;

public class Habilidade {
    private int id_habilidade;
    private String descricao;
    private String efeito;
    private String nome;

    public Habilidade(int id_habilidade,String descricao, String efeito, String nome) {
        this.id_habilidade = id_habilidade;
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
    
    public int getId_Habilidade(){
        return id_habilidade;
    }
    
    public void setId_Habilidade(int id_habilidade){
        this.id_habilidade = id_habilidade;
    }
    
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

     @Override
    
    public String toString(){
        return this.getNome();
    }   
}
