package com.gameCovid;

public class Player {
    private String[] nome = new String[20];
    private byte[] età = new byte[20];
    private boolean [] genere= new boolean [20];
    private boolean[]statoVita = new boolean[20];
    public byte totaleInseriti = 0;

    public String getNome (byte i){
        return nome[i];
    }

    public void setNome(String nome, byte i) {
        this.nome[i] = nome;
    }

    public byte getEtà(byte i) {
        return età[i];
    }

    public void setEtà(byte i, int età) {
        this.età[i] = (byte) età;
    }

    public boolean getGenere(byte i) {
        return genere[i];
    }

    public void setGenere(byte i, boolean genere) {
        this.genere[i] = genere;
    }

    public boolean getStatoVita(byte i) {
        return statoVita[i];
    }

    public void setStatoVita(boolean statoVita, byte i) {
        this.statoVita[i] = statoVita;
    } //




}
