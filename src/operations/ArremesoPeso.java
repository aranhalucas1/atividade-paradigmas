package operations;

import model.Atleta;
import operations.util.DistanceCalculator;

public class ArremesoPeso implements Winner {

    @Override
    public void getWinner(Atleta atleta1, Atleta atleta2) {
        String atletaNome1 = atleta1.getNome();
        String atletaNome2 = atleta2.getNome();

        Double higherA1 = DistanceCalculator.higherDistance(atleta1);
        Double higherA2 = DistanceCalculator.higherDistance(atleta2);

        if(higherA1.equals(higherA2)) {
            empate(atleta1, atleta2);
            return;
        }

        if (higherA1 > higherA2) {
            System.out.println("O/A Atleta " + atletaNome1 + " venceu com " + higherA1 + "m");
        } else {
            System.out.println("O/A Atleta " + atletaNome2 + " venceu com " + higherA2 + "m");
        }

    }

    public void empate(Atleta atleta1, Atleta atleta2) {
        Double empate1 = DistanceCalculator.secondHigherDistance(atleta1);
        Double empate2 = DistanceCalculator.secondHigherDistance(atleta2);

        System.out.println("EMPATE");
        System.out.println("Agora, será avaliado a segunda maior distancia dos/das atletas");


        if(empate1 > empate2) {
            System.out.println("O/A Jogador " + atleta1.getNome() + " venceu com a segunda maior distancia de" + empate1 + " metros");
        } else {
            System.out.println("O/A Jogador " + atleta2.getNome() + " venceu com a segunda maior distancia de " + empate2 + " metros");
        }
    }

}
