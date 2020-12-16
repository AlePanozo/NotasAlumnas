package modelos;

import java.util.ArrayList;
import java.util.List;

public class Notas {
    private List<Integer> notas;

    public Notas(List<Integer> notas) {
        this.notas = notas;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Notas{" +
                "notas=" + notas +
                '}';
    }
}
