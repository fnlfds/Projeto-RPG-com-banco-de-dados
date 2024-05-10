package com.mycompany.projeto_poo2;

public class Inimigo extends Personagem {
    private boolean chefe;
    private int experienciaDrop;
    private String fraqueza;

    public Inimigo(boolean chefe, int experienciaDrop, String fraqueza, String classe, int nivel, String nome, int pontoMana, int pontoVida, String raca) {
        super(classe, nivel, nome, pontoMana, pontoVida, raca);
        this.chefe = chefe;
        this.experienciaDrop = experienciaDrop;
        this.fraqueza = fraqueza;
    }

    //getters e setters
    public boolean getChefe() {
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
