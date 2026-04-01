package controle;

import dao.BancoDeDados;
import modelo.Correcao;
import modelo.Atividade;
import modelo.Aluno;
import java.time.LocalDate;

public class ControleCorrecao {
    public void cadastrarCorrecao(int id, double nota, String observacao, LocalDate data, Atividade atividade, Aluno aluno) {
        Correcao correcao = new Correcao(id, nota, observacao, data, atividade, aluno);
        BancoDeDados.correcoes.add(correcao);
    }

    public void listarCorrecoes() {
        for (Correcao correcao : BancoDeDados.correcoes) {
            System.out.println(correcao);
        }
    }
}