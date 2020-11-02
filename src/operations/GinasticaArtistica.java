package operations;

import model.Atleta;
import operations.util.NoteCalculator;

public class GinasticaArtistica implements Winner {

    @Override
    public void getWinner(Atleta atleta1, Atleta atleta2) {
        String atletaNome1 = atleta1.getNome();
        String atletaNome2 = atleta2.getNome();

        Double notaMaxima1 = NoteCalculator.higherNote(NoteCalculator.removeMinNote(atleta1.getNotas()));
        Double notaMaxima2 = NoteCalculator.higherNote(NoteCalculator.removeMinNote(atleta2.getNotas()));

        if (notaMaxima1 > notaMaxima2) {
            System.out.println("O/A Atleta " + atletaNome1 + " venceu com um total de " + notaMaxima1);
        } else {
            System.out.println("O/A Atleta " + atletaNome2 + " venceu com um total de " + notaMaxima2);
        }

    }
}
