package com.mycompany.projeto_poo2;

public class Equipamento {
    private int id;
    private String nome;
    private String tipo;
    private String efeito;
    private boolean consumivel;
    private String raridade;

   public Equipamento(int id,boolean consumivel, String efeito, String nome, String raridade, String tipo) {
        this.id = id;
        this.consumivel = consumivel;
        this.efeito = efeito;
        this.nome = nome;
        this.raridade = raridade;
        this.tipo = tipo;
    }

    

    public void consultarEquipamento(){

    }

    public void alterarEquipamento(){

    }

    public void excluirEquipamento(){

    }

    public void cadastrarEquipamento(){
        
    }

    //getters e setters

    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
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


