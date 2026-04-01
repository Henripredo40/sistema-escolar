package modelo;

public class Matricula {
    private int id;
    private Aluno aluno;
    private Materia materia;

    public Matricula(int id, Aluno aluno, Materia materia) {
        this.id = id;
        this.aluno = aluno;
        this.materia = materia;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Aluno getAluno() { return aluno; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }

    public Materia getMateria() { return materia; }
    public void setMateria(Materia materia) { this.materia = materia; }

    public String toString() {
        return "Matricula{" + "id=" + id + ", aluno=" + aluno.getNome() + ", materia=" + materia.getNome() + '}';
    }
}