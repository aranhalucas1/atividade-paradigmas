package model;

import java.util.ArrayList;
import java.util.List;

public class Atleta {

    private String nome;
    private List<Arremesso> arremessos = new ArrayList<>();
    private List<Nota> notas = new ArrayList<>();

    public Atleta(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Arremesso> getArremessos() {
        return arremessos;
    }

    public void setArremessos(List<Arremesso> arremessos) {
        this.arremessos = arremessos;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }
}
