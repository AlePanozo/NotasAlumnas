package modelos;

import java.util.Arrays;

public class Notas {

    private int [] nota = new int[3];

    public Notas(int[] nota) {
        this.nota = nota;
    }

    public int[] getNota() {
        return nota;
    }

    public void setNota(int[] nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Notas{" +
                "nota=" + Arrays.toString(nota) +
                '}';
    }


}
