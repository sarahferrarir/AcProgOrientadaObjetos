package model.pessoa;

public class Aluno {
    public String nome;
    public String email;
    public String cpf;
    public String curso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Aluno(String nome, String email, String cpf, String curso) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.curso = curso;
    }
}
