package program;

import model.Atleta;
import operations.ArremesoPeso;
import operations.GinasticaArtistica;

import java.util.Scanner;

/*
 * Projeto feito utilizando intelliJ como compilador
 * Pode haver inconsistencias no projeto se compilado utilizando outra IDE
 */

public class AtividadeParadigmas {

    private static final Scanner sc = new Scanner(System.in);
    private static final String ATLETA2 = "Segundo atleta\n";

    public static void main(String[] args) {
        String choose = "";

        Atleta atleta = UI.cadastroAtleta();
        System.out.println(ATLETA2);
        Atleta atleta2 = UI.cadastroAtleta();

        do {
            UI.showMenu();
            choose = sc.next();
            switch (choose) {
                case "1":     // arremesso
                    atleta = UI.atletaAddArremesso(atleta);
                    System.out.println(ATLETA2);
                    atleta2 = UI.atletaAddArremesso(atleta2);
                    new ArremesoPeso().getWinner(atleta, atleta2);
                    break;

                case "2": // nota
                    atleta = UI.atletaAddNota(atleta);
                    System.out.println(ATLETA2);
                    atleta2 = UI.atletaAddNota(atleta2);
                    new GinasticaArtistica().getWinner(atleta, atleta2);
                    break;

                case "0":
                    System.out.println("Programa finalizado!");
                    break;

                default:
                    System.out.println("Opção invalida!");
            }
        } while (!choose.equals("0"));


    }
}


