package model.evento;

import model.local.Local;
import model.pessoa.Aluno;
import model.pessoa.PalestranteConvidado;

import java.util.HashSet;

public class Palestra extends Evento {
    public PalestranteConvidado palestrante;

    public PalestranteConvidado getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(PalestranteConvidado palestrante) {
        this.palestrante = palestrante;
    }

    public Palestra(String titulo , String data, int duracaoHoras, int orcamentoReais, PalestranteConvidado palestrante, Local local) {
        this.titulo = titulo;
        this.data = data;
        this.duracaoHoras = duracaoHoras;
        this.orcamentoReais = orcamentoReais;
        this.palestrante = palestrante;
        this.local = local;
        this.participantes = new HashSet<Aluno>();
    }

}
