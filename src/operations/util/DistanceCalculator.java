package operations.util;

import model.Arremesso;
import model.Atleta;
import program.exceptions.IllegalAccessException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class DistanceCalculator {

    private DistanceCalculator() {
        throw new IllegalAccessException("Utility class");
    }

    public static Double higherDistance(Atleta atleta) {
        Arremesso arremesso = atleta.getArremessos().stream().max(Comparator.comparing(Arremesso::getDistancia)).orElseThrow(NoSuchElementException::new);
        return arremesso.getDistancia();
    }

    /*
     * Convertendo lista de Arremesso para Double
     */
    public static Double secondHigherDistance(Atleta atleta) {
        List<Double> list = new ArrayList<>();
        atleta.getArremessos().forEach(x -> list.add(x.getDistancia()));
        return list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(1);
    }
}
