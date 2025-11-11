package model.evento;

import model.Apresentacao;
import model.local.Local;
import model.pessoa.Aluno;

import java.util.HashSet;
import java.util.Set;

public class Seminario extends Evento {
    public Set<Apresentacao> apresentacoes;
    public int duracaoHoras;

    public Set<Apresentacao> getApresentacoes() {
        return apresentacoes;
    }

    public void setApresentacoes(Set<Apresentacao> apresentacoes) {
        this.apresentacoes = apresentacoes;
    }

    public void addApresentacao(Apresentacao apresentacao){
        this.apresentacoes.add(apresentacao);
    }
    public void removeApresentacao(Apresentacao apresentacao){
        this.apresentacoes.remove(apresentacao);
    }



    public Seminario(String titulo, String data, int duracaoHoras, int orcamentoReais, Local local) {
        this.titulo = titulo;
        this.data = data;
        this.duracaoHoras = duracaoHoras;
        this.orcamentoReais = orcamentoReais;
        this.local = local;
        this.participantes = new HashSet<Aluno>();
        this.apresentacoes = new HashSet<Apresentacao>();
    }


}
