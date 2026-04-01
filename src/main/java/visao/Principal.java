package visao;

import controle.*;
import modelo.*;
import dao.BancoDeDados;
import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        ControleAluno controleAluno = new ControleAluno();
        ControleProfessor controleProfessor = new ControleProfessor();
        ControleMateria controleMateria = new ControleMateria();
        ControleAtividade controleAtividade = new ControleAtividade();
        ControleCorrecao controleCorrecao = new ControleCorrecao();
        ControleMatricula controleMatricula = new ControleMatricula();

        controleAluno.cadastrarAluno(1, "Maria", "F", LocalDate.of(2000, 5, 10));
        controleAluno.cadastrarAluno(2, "João", "M", LocalDate.of(1999, 8, 20));

        controleProfessor.cadastrarProfessor(1, "Carlos", "M", LocalDate.of(1980, 3, 15));

        Materia matematica = new Materia(1, "Matemática", "Álgebra e Geometria", BancoDeDados.professores.get(0));
        BancoDeDados.materias.add(matematica);

        controleAtividade.cadastrarAtividade(1, "Lista 1", "Exercícios", LocalDate.of(2023, 9, 30), matematica);

        controleMatricula.matricularAluno(1, BancoDeDados.alunos.get(0), matematica);
        controleMatricula.matricularAluno(2, BancoDeDados.alunos.get(1), matematica);

        controleCorrecao.cadastrarCorrecao(1, 9.5, "Muito bom!", LocalDate.now(), BancoDeDados.atividades.get(0), BancoDeDados.alunos.get(0));

        System.out.println("=== Alunos ===");
        controleAluno.listarAlunos();

        System.out.println("=== Professores ===");
        controleProfessor.listarProfessores();

        System.out.println("=== Matérias ===");
        controleMateria.listarMaterias();

        System.out.println("=== Atividades ===");
        controleAtividade.listarAtividades();

        System.out.println("=== Matrículas ===");
        controleMatricula.listarMatriculas();

        System.out.println("=== Correções ===");
        controleCorrecao.listarCorrecoes();
    }
}