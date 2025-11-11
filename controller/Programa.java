package controller;

import model.Apresentacao;
import model.evento.*;
import model.local.*;
import model.pessoa.*;

public class Programa {
    public static void main(String[] args) {

        Laboratorio laboratorio1 = new Laboratorio("lab1",30, "E", 30, "química");
        Laboratorio laboratorio2 = new Laboratorio("lab2",50, "F", 40, "infromática");

        Auditorio auditorio1 = new Auditorio("aud1", 60, "A", true, true);
        Auditorio auditorio2 = new Auditorio("aud2", 80, "B", true, false);

        Sala sala1 = new Sala("sala1", 30, "C", "105", true);
        Sala sala2 = new Sala("sala2", 35, "E", "307", true);

        Aluno aluno1 =new Aluno("aluno1", "email@email.com","123456789", "engSoftware");
        Aluno aluno2 =new Aluno("aluno2", "gmail@gmail.com","987654321", "CDIA");

        Instrutor instrutor1 = new Instrutor("inst1", "inst1@email.com", "mestre","informatica");
        Instrutor instrutor2 = new Instrutor("inst2", "inst2@email.com", "mestre","qupimica");

        Organizador organizador1 = new Organizador("org1", "org1@email.com", "coordenador");
        Organizador organizador2 = new Organizador("org2", "org2@email.com", "responsável por inscrições");

        PalestranteConvidado palestrante1 = new PalestranteConvidado("pal1", "pal1@email.com", "IBMEC");
        PalestranteConvidado palestrante2 = new PalestranteConvidado("pal2", "pal2@email.com", "USP");

        Apresentacao apres1 =new Apresentacao("IA", "aluno1", "ori1");
        apres1.addAluno(aluno1);
        apres1.addAluno(aluno2);
        Apresentacao apres2 =new Apresentacao("IA", "aluno2", "ori1");
        apres2.addAluno(aluno1);
        apres2.addAluno(aluno2);

        Minicurso minicurso1 = new Minicurso(10000, "24/07/2025", "título1", 40, "material de apoio1", laboratorio1);
        minicurso1.addParticipante(aluno1);
        minicurso1.addParticipante(aluno2);
        minicurso1.addInstrutor(instrutor1);
        Minicurso minicurso2 = new Minicurso(20000, "14/09/2025", "título2", 60, "material de apoio2", laboratorio2);
        minicurso2.addParticipante(aluno1);
        minicurso2.addParticipante(aluno2);
        minicurso2.addInstrutor(instrutor2);

        Palestra palestra1 = new Palestra("palestra1", "16/08/2025", 5, 32730, palestrante1, auditorio1);
        palestra1.addParticipante(aluno1);
        palestra1.addParticipante(aluno2);
        Palestra palestra2 = new Palestra("palestra2", "19/09/2026", 10, 38910, palestrante2, auditorio2);
        palestra2.addParticipante(aluno1);
        palestra2.addParticipante(aluno2);

        Seminario seminario1 = new Seminario("semin1", "19/11/2025", 8, 123456, sala1);
        seminario1.addParticipante(aluno1);
        seminario1.addParticipante(aluno2);
        seminario1.addApresentacao(apres1);
        seminario1.addApresentacao(apres2);
        Seminario seminario2 = new Seminario("semin2", "29/11/2025", 8, 123456, sala2);
        seminario2.addParticipante(aluno1);
        seminario2.addParticipante(aluno2);
        seminario2.addApresentacao(apres1);
        seminario2.addApresentacao(apres2);

    }
}
