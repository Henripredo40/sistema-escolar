package controle;

import dao.BancoDeDados;
import modelo.Professor;
import java.time.LocalDate;

public class ControleProfessor {
    public void cadastrarProfessor(int id, String nome, String sexo, LocalDate dataNascimento) {
        Professor professor = new Professor(id, nome, sexo, dataNascimento);
        BancoDeDados.professores.add(professor);
    }

    public void listarProfessores() {
        for (Professor professor : BancoDeDados.professores) {
            System.out.println(professor);
        }
    }
}