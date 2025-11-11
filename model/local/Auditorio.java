package model.local;

public class Auditorio extends Local {
    public boolean temSistemaSom;
    public boolean temSistemaTraducao;

    public boolean isTemSistemaSom() {
        return temSistemaSom;
    }

    public void setTemSistemaSom(boolean temSistemaSom) {
        this.temSistemaSom = temSistemaSom;
    }

    public boolean isTemSistemaTraducao() {
        return temSistemaTraducao;
    }

    public void setTemSistemaTraducao(boolean temSistemaTraducao) {
        this.temSistemaTraducao = temSistemaTraducao;
    }

    public Auditorio(String nome, int capacidade, String bloco, boolean temSistemaSom, boolean temSistemaTraducao) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.bloco = bloco;
        this.temSistemaSom = temSistemaSom;
        this.temSistemaTraducao = temSistemaTraducao;
    }
}
