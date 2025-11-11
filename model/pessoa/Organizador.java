package model.pessoa;

public class Organizador extends PessoaResponsavel {
    public String funcaoAdministrativa;

    public Organizador(String nome, String email, String funcaoAdministrativa) {
        this.nome = nome;
        this.email = email;
        this.funcaoAdministrativa = funcaoAdministrativa;
    }

}
