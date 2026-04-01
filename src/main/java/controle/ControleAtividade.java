package controle;

import dao.BancoDeDados;
import modelo.Atividade;
import modelo.Materia;
import java.time.LocalDate;

public class ControleAtividade {
    public void cadastrarAtividade(int id, String titulo, String tipo, LocalDate prazo, Materia materia) {
        Atividade atividade = new Atividade(id, titulo, tipo, prazo, materia);
        BancoDeDados.atividades.add(atividade);
    }

    public void listarAtividades() {
        for (Atividade atividade : BancoDeDados.atividades) {
            System.out.println(atividade);
        }
    }
}