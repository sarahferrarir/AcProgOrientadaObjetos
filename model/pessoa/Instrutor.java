package model.pessoa;

public class Instrutor extends PessoaResponsavel {
    public String formacao;
    public String areaEspecializacao;

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getAreaEspecializacao() {
        return areaEspecializacao;
    }

    public void setAreaEspecializacao(String areaEspecializacao) {
        this.areaEspecializacao = areaEspecializacao;
    }

    public Instrutor(String nome, String email, String formacao, String areaEspecializacao) {
        this.nome = nome;
        this.email = email;
        this.formacao = formacao;
        this.areaEspecializacao = areaEspecializacao;
    }

}
