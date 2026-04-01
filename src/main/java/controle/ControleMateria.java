package controle;

import dao.BancoDeDados;
import modelo.Materia;
import modelo.Professor;

public class ControleMateria {
    public void cadastrarMateria(int id, String nome, String descricao, Professor professor) {
        Materia materia = new Materia(id, nome, descricao, professor);
        BancoDeDados.materias.add(materia);
    }

    public void listarMaterias() {
        for (Materia materia : BancoDeDados.materias) {
            System.out.println(materia);
        }
    }
}