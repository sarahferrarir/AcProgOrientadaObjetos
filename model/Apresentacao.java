package model;

import model.pessoa.Aluno;

import java.util.HashSet;
import java.util.Set;

public class Apresentacao {
    public String tema;
    public String nomeAlunoApresentador;
    public String nomeOrientador;
    public Set<Aluno> alunos;

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getNomeAlunoApresentador() {
        return nomeAlunoApresentador;
    }

    public void setNomeAlunoApresentador(String nomeAlunoApresentador) {
        this.nomeAlunoApresentador = nomeAlunoApresentador;
    }

    public String getNomeOrientador() {
        return nomeOrientador;
    }

    public void setNomeOrientador(String nomeOrientador) {
        this.nomeOrientador = nomeOrientador;
    }

    public Set<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Set<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }
    public void removeAluno(Aluno aluno){
        this.alunos.remove(aluno);
    }

    public Apresentacao(String tema, String nomeAlunoApresentador, String nomeOrientador) {
        this.tema = tema;
        this.nomeAlunoApresentador = nomeAlunoApresentador;
        this.nomeOrientador = nomeOrientador;
        this.alunos = new HashSet<Aluno>();
    }
}
