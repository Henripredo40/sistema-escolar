package modelo;

import java.time.LocalDate;

public class Aluno extends Pessoa {
    public Aluno(int id, String nome, String sexo, LocalDate dataNascimento) {
        super(id, nome, sexo, dataNascimento);
    }

    public String toString() {
        return "Aluno{" + "id=" + getId() + ", nome='" + getNome() + "', sexo='" + getSexo() + "', nascimento=" + getDataNascimento() + '}';
    }
}