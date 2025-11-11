package model.evento;

import model.local.Local;
import model.pessoa.Aluno;
import model.pessoa.Instrutor;

import java.util.HashSet;
import java.util.Set;

public class Minicurso extends Evento {
    public Set<Instrutor> instrutores;
    public String materiaisDeApoio;

    public Set<Instrutor> getInstrutores() {
        return instrutores;
    }

    public void setInstrutores(Set<Instrutor> instrutores) {
        this.instrutores = instrutores;
    }

    public String getMateriaisDeApoio() {
        return materiaisDeApoio;
    }

    public void setMateriaisDeApoio(String materiaisDeApoio) {
        this.materiaisDeApoio = materiaisDeApoio;
    }

    public void addInstrutor(Instrutor instrutor){
        this.instrutores.add(instrutor);
    }
    public void removeInstrutor(Instrutor instrutor){
        this.instrutores.remove(instrutor);
    }

    public Minicurso(int orcamentoReais, String data, String titulo,int duracaoHoras, String materiaisDeApoio, Local local) {
        this.orcamentoReais = orcamentoReais;
        this.data = data;
        this.titulo = titulo;
        this.duracaoHoras = duracaoHoras;
        this.materiaisDeApoio = materiaisDeApoio;
        this.local = local;
        this.participantes = new HashSet<Aluno>();
        this.instrutores = new HashSet<Instrutor>();
    }



}
