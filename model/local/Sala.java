package model.local;

public class Sala extends Local {
    public String numero;
    public boolean temMultiMidia;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isTemMultiMidia() {
        return temMultiMidia;
    }

    public void setTemMultiMidia(boolean temMultiMidia) {
        this.temMultiMidia = temMultiMidia;
    }

    public Sala(String nome, int capacidade, String bloco, String numero, boolean temMultiMidia) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.bloco = bloco;
        this.numero = numero;
        this.temMultiMidia = temMultiMidia;
    }
}
