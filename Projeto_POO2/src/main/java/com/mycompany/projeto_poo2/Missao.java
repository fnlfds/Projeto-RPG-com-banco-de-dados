package com.mycompany.projeto_poo2;

public class Missao {
    private int id_missao;
    private String nome;
    private String objetivo;
    private String recompensa;
    
    public Missao(int id_missao, String nome, String objetivo, String recompensa) {
        this.id_missao = id_missao;
        this.nome = nome;
        this.objetivo = objetivo;
        this.recompensa = recompensa;
    }

    //getters e setters
    
    public int getId_Missao(){
        return id_missao;
    }
    
    public void setId_Missao(int id_missao){
        this.id_missao = id_missao;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(String recompensa) {
        this.recompensa = recompensa;
    }

     @Override
    
    public String toString(){
        return this.getNome();
    }      
}
