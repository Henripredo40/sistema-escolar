package controle;

import dao.BancoDeDados;
import modelo.Aluno;
import java.time.LocalDate;

public class ControleAluno {
    public void cadastrarAluno(int id, String nome, String sexo, LocalDate dataNascimento) {
        Aluno aluno = new Aluno(id, nome, sexo, dataNascimento);
        BancoDeDados.alunos.add(aluno);
    }

    public void listarAlunos() {
        for (Aluno aluno : BancoDeDados.alunos) {
            System.out.println(aluno);
        }
    }
}