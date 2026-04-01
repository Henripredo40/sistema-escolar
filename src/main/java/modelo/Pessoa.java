package modelo;

import java.time.LocalDate;

public abstract class Pessoa {
    private int id;
    private String nome;
    private String sexo;
    private LocalDate dataNascimento;

    public Pessoa(int id, String nome, String sexo, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public LocalDate getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }

    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome='" + nome + "', sexo='" + sexo + "', nascimento=" + dataNascimento + '}';
    }
}