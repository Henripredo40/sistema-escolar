package modelo;

import java.time.LocalDate;

public class Professor extends Pessoa {
    public Professor(int id, String nome, String sexo, LocalDate dataNascimento) {
        super(id, nome, sexo, dataNascimento);
    }

    public String toString() {
        return "Professor{" + "id=" + getId() + ", nome='" + getNome() + "'}";
    }
}