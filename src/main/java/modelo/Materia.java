package modelo;

public class Materia {
    private int id;
    private String nome;
    private String descricao;
    private Professor professor;

    public Materia(int id, String nome, String descricao, Professor professor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.professor = professor;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Professor getProfessor() { return professor; }
    public void setProfessor(Professor professor) { this.professor = professor; }

    public String toString() {
        return "Materia{" + "id=" + id + ", nome='" + nome + "', professor=" + professor.getNome() + '}';
    }
}