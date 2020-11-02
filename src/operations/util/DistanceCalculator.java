package operations.util;

import model.Arremesso;
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

    public static Double higherDistance(List<Arremesso> arremessos) {
        Arremesso max = arremessos.stream().max(Comparator.comparing(Arremesso::getDistancia)).orElseThrow(NoSuchElementException::new);
        return max.getDistancia();
    }

    /*
     * Convertendo lista de Arremesso para Double
     */
    public static Double secondHigherDistance(List<Arremesso> arremessos) {
        List<Double> list = new ArrayList<>();
        arremessos.forEach(x -> list.add(x.getDistancia()));
        return list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(1);
    }
}
