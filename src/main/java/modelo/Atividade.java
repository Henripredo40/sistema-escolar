package modelo;

import java.time.LocalDate;

public class Atividade {
    private int id;
    private String titulo;
    private String tipo;
    private LocalDate prazo;
    private Materia materia;

    public Atividade(int id, String titulo, String tipo, LocalDate prazo, Materia materia) {
        this.id = id;
        this.titulo = titulo;
        this.tipo = tipo;
        this.prazo = prazo;
        this.materia = materia;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public LocalDate getPrazo() { return prazo; }
    public void setPrazo(LocalDate prazo) { this.prazo = prazo; }

    public Materia getMateria() { return materia; }
    public void setMateria(Materia materia) { this.materia = materia; }

    public String toString() {
        return "Atividade{" + "id=" + id + ", titulo='" + titulo + "', materia=" + materia.getNome() + '}';
    }
}