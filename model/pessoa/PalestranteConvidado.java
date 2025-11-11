package model.pessoa;

public class PalestranteConvidado {
    public String nome;
    public String email;
    public String instituicao;

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

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

    public PalestranteConvidado(String nome, String email, String instituicao) {
        this.nome = nome;
        this.email = email;
        this.instituicao = instituicao;
    }
}
