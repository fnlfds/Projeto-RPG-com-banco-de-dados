package com.mycompany.projeto_poo2;

public class Inimigo extends Personagem {
    private int id_inimigo;
    private boolean chefe;
    private int experienciaDrop;
    private String fraqueza;
    private Equipamento equipamento;
    private Habilidade habilidade;

    public Inimigo(int id_inimigo, boolean chefe, int experienciaDrop, String fraqueza, String classe, int nivel, String nome,
            int pontoMana, int pontoVida, String raca, Equipamento equipamento, Habilidade habilidade) {
        super(classe, nivel, nome, pontoMana, pontoVida, raca);
        this.id_inimigo = id_inimigo;
        this.chefe = chefe;
        this.experienciaDrop = experienciaDrop;
        this.fraqueza = fraqueza;
        this.equipamento = equipamento;
        this.habilidade = habilidade;
    }

    public void consultarInimigo(){

    }

    public void alterarInimigo(){

    }

    public void excluirInimigo(){

    }

    public void cadastrarInimigo(){

    }

    //getters e setters
    public Habilidade getHabilidade(){
        return habilidade;
    }
    
    public void setHabilidade(Habilidade habilidade){
        this.habilidade = habilidade;
    }
    public Equipamento getEquipamento(){
        return equipamento;
    }
    
    public void setEquipamento(Equipamento equipamento){
        this.equipamento = equipamento;
    }
    
    public int getId_Inimigo(){
        return id_inimigo;
    }
    
    public void setId_Inimigo(int id_inimigo){
        this.id_inimigo = id_inimigo;
    }
    
    public boolean isChefe() {
        return chefe;
    }

    public void setChefe(boolean chefe) {
        this.chefe = chefe;
    }

    public int getExperienciaDrop() {
        return experienciaDrop;
    }

    public void setExperienciaDrop(int experienciaDrop) {
        this.experienciaDrop = experienciaDrop;
    }

    public String getFraqueza() {
        return fraqueza;
    }

    public void setFraqueza(String fraqueza) {
        this.fraqueza = fraqueza;
    }

    
}
