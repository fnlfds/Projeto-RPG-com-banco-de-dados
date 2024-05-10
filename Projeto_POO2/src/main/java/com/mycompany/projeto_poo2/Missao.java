package com.mycompany.projeto_poo2;

public class Missao {
    private String nome;
    private String objetivo;
    private String Recompensa;
    
    public Missao(String nome, String objetivo, String recompensa) {
        this.nome = nome;
        this.objetivo = objetivo;
        Recompensa = recompensa;
    }

    //getters e setters
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
