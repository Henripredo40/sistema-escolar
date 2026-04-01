package controle;

import dao.BancoDeDados;
import modelo.Aluno;
import modelo.Materia;
import modelo.Matricula;

public class ControleMatricula {
    public void matricularAluno(int id, Aluno aluno, Materia materia) {
        Matricula matricula = new Matricula(id, aluno, materia);
        BancoDeDados.matriculas.add(matricula);
    }

    public void listarMatriculas() {
        for (Matricula matricula : BancoDeDados.matriculas) {
            System.out.println(matricula);
        }
    }
}