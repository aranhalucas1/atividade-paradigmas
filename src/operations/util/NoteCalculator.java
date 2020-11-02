package operations.util;

import model.Nota;
import program.exceptions.IllegalAccessException;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class NoteCalculator {

    private NoteCalculator() {
        throw new IllegalAccessException("Utiliy class");
    }

    public static List<Nota> removeMinNote(List<Nota> notas) {
        Nota nota = notas.stream().min(Comparator.comparing(Nota::getNota)).orElseThrow(NoSuchElementException::new);
        notas.remove(nota);
        return notas;
    }

    public static Double higherNote(List<Nota> notas) {
        Double maxNota = 0.0;
        for(Nota nota : notas) {
            maxNota += nota.getNota();
        }

        return maxNota;
    }
}
