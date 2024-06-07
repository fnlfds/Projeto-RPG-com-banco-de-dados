package com.mycompany.projeto_poo2;

public class Missao {
    private int id_missoes;
    private String nome;
    private String objetivo;
    private String Recompensa;
    
    public Missao(int id_missoes, String nome, String objetivo, String recompensa) {
        this.id_missoes = id_missoes;
        this.nome = nome;
        this.objetivo = objetivo;
        Recompensa = recompensa;
    }

    //getters e setters
    
    public int getId_Missoes(){
        return id_missoes;
    }
    
    public void setId_Missoes(int id_missoes){
        this.id_missoes = id_missoes;
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
        return Recompensa;
    }

    public void setRecompensa(String recompensa) {
        Recompensa = recompensa;
    }

    
}
