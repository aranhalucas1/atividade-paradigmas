package program;

import model.Arremesso;
import model.Atleta;
import model.Nota;
import program.util.InputVerify;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UI {
    private final static Scanner sc = new Scanner(System.in);

    public static void showMenu() {
        System.out.println();
        System.out.println("Programa - Olimpiadas");
        System.out.println("Selecione uma das opções");
        System.out.println("1 - Arremesso de peso");
        System.out.println("2 - Ginástica artistica");
        System.out.println("0 - Finalizar programa");
    }

    public static Atleta cadastroAtleta() {
        System.out.print("Nome do atleta: ");
        String nome = sc.next();
        System.out.println();
        return new Atleta(nome);
    }

    public static Atleta atletaAddArremesso(Atleta atleta){
        List<Arremesso> arremessos = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite a distancia do " + i + "° arremesso");
            String distancia = sc.next();

            while (!InputVerify.inputValidation(distancia)) {
                System.out.print("Distancia invalida! Digite novamente: ");
                distancia = sc.next();
            }

            arremessos.add(new Arremesso(Double.parseDouble(distancia)));
        }
        System.out.println();
        atleta.getArremessos().addAll(arremessos);
        return atleta;
    }

    public static Atleta atletaAddNota(Atleta atleta) {
        List<Nota> notas = new ArrayList<>();
        System.out.println("Agora, digite suas notas\n");

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " nota: ");
            String nota = sc.next();

            while (!InputVerify.inputValidation(nota)) {
                System.out.print("Nota invalida! Digite novamente: ");
                nota = sc.next();
            }
            notas.add(new Nota(Double.parseDouble(nota)));
        }
        atleta.getNotas().addAll(notas);
        return atleta;
    }
}


