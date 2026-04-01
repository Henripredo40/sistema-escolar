package modelo;

import java.time.LocalDate;

public class Correcao {
    private int id;
    private double nota;
    private String observacao;
    private LocalDate data;
    private Atividade atividade;
    private Aluno aluno;

    public Correcao(int id, double nota, String observacao, LocalDate data, Atividade atividade, Aluno aluno) {
        this.id = id;
        this.nota = nota;
        this.observacao = observacao;
        this.data = data;
        this.atividade = atividade;
        this.aluno = aluno;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public double getNota() { return nota; }
    public void setNota(double nota) { this.nota = nota; }

    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public Atividade getAtividade() { return atividade; }
    public void setAtividade(Atividade atividade) { this.atividade = atividade; }

    public Aluno getAluno() { return aluno; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }

    public String toString() {
        return "Correcao{" + "id=" + id + ", nota=" + nota + ", aluno=" + aluno.getNome() + ", atividade=" + atividade.getTitulo() + '}';
    }
}