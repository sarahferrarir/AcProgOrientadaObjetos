package model.local;

public class Laboratorio extends Local {
    public int numeroComputadoresDisponiveis;
    public String tipoLaboratorio;

    public String getTipoLaboratorio() {
        return tipoLaboratorio;
    }

    public void setTipoLaboratorio(String tipoLaboratorio) {
        this.tipoLaboratorio = tipoLaboratorio;
    }

    public int getNumeroComputadoresDisponiveis() {
        return numeroComputadoresDisponiveis;
    }

    public void setNumeroComputadoresDisponiveis(int numeroComputadoresDisponiveis) {
        this.numeroComputadoresDisponiveis = numeroComputadoresDisponiveis;
    }

    public Laboratorio(String nome, int capacidade, String bloco, int numeroComputadoresDisponiveis, String tipoLaboratorio) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.bloco = bloco;
        this.numeroComputadoresDisponiveis = numeroComputadoresDisponiveis;
        this.tipoLaboratorio = tipoLaboratorio;
    }

}
