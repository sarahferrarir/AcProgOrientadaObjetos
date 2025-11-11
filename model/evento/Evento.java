package model.evento;

import model.local.Local;
import model.pessoa.Aluno;
import model.pessoa.Instrutor;

import java.util.Set;

public abstract class Evento {

    public String titulo;
    public String data;
    public int duracaoHoras;
    public int orcamentoReais;
    public Local local;
    public Set<Aluno> participantes;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }



    public int getOrcamentoReais() {
        return orcamentoReais;
    }

    public void setOrcamentoReais(int orcamentoReais) {
        this.orcamentoReais = orcamentoReais;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void addParticipante(Aluno aluno){
            this.participantes.add(aluno);


    }
    public void removeParticipante(Aluno aluno){
        this.participantes.remove(aluno);
    }

}
