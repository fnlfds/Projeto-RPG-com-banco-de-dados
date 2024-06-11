package com.mycompany.projeto_poo2;

public class Personagem {
    private String nome;
    private int pontoVida;
    private int pontoMana;
    public int nivel;
    private String raca;
    private String classe;

    public Personagem(String classe, int nivel, String nome, int pontoMana, int pontoVida, String raca) {
        this.classe = classe;
        this.nivel = nivel;
        this.nome = nome;
        this.pontoMana = pontoMana;
        this.pontoVida = pontoVida;
        this.raca = raca;
        }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontoVida() {
        return pontoVida;
    }

    public void setPontoVida(int pontoVida) {
        this.pontoVida = pontoVida;
    }

    public int getPontoMana() {
        return pontoMana;
    }

    public void setPontoMana(int pontoMana) {
        this.pontoMana = pontoMana;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }


}
