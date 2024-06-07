package com.mycompany.projeto_poo2;

public class Protagonista extends Personagem{
    private int id_protagonista;
    private int experiencia;
    private int forca;
    private int destreza;
    private int inteligencia;
    private int carisma;
    private String efeito;
    private int dinheiro;

    public Protagonista(int id_protagonista,int carisma, int destreza, int dinheiro, String efeito, int experiencia, int forca, int inteligencia, String classe, int nivel, String nome, int pontoMana, int pontoVida, String raca) {
        super(classe, nivel, nome, pontoMana, pontoVida, raca);
        this.id_protagonista = id_protagonista;
        this.carisma = carisma;
        this.destreza = destreza;
        this.dinheiro = dinheiro;
        this.efeito = efeito;
        this.experiencia = experiencia;
        this.forca = forca;
        this.inteligencia = inteligencia;
    }

    public void calcularNivel(int experienciaAdquirida) {
        this.experiencia += experienciaAdquirida;

        while (this.experiencia >= 1000) {
            this.nivel++;
            this.experiencia -= 1000;
        }
    }

    //getters e setters
    public int getId_Protagonista(){
        return id_protagonista;
    }
    
    public void setId_Protagonista(int id_protagonista) {
        this.id_protagonista = id_protagonista;
    }
    
    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public String getEfeito() {
        return efeito;
    }

    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }
}
