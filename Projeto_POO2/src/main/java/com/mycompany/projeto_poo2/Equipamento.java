package com.mycompany.projeto_poo2;

public class Equipamento {
    private int id_equipamento;
    private String nome;
    private String tipo;
    private String efeito;
    private boolean consumivel;
    private String raridade;

   public Equipamento(int id_equipamento,boolean consumivel, String efeito, String nome, String raridade, String tipo) {
        this.id_equipamento = id_equipamento;
        this.consumivel = consumivel;
        this.efeito = efeito;
        this.nome = nome;
        this.raridade = raridade;
        this.tipo = tipo;
    }


    //getters e setters

    public int getId_Equipamento(){
        return id_equipamento;
    }
    
    public void setId_Equipamento(int id_equipamento){
        this.id_equipamento = id_equipamento;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEfeito() {
        return efeito;
    }

    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }

    public boolean isConsumivel() {
        return consumivel;
    }

    public void setConsumivel(boolean consumivel) {
        this.consumivel = consumivel;
    }

    public String getRaridade() {
        return raridade;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }
    
    @Override
    
    public String toString(){
        return this.getNome();
    }
}


