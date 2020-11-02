package operations.util;

import model.Arremesso;
import model.Atleta;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class DistanceCalculator {

    public static Double higherDistance(Atleta atleta) {
        Arremesso arremesso = atleta.getArremessos().stream().max(Comparator.comparing(Arremesso::getDistancia)).orElseThrow(NoSuchElementException::new);
        return arremesso.getDistancia();
    }

    public static Double secondHigherDistance(Atleta atleta) {
        List<Double> list = new ArrayList<>();
        atleta.getArremessos().forEach(x -> list.add(x.getDistancia()));
        list.sort(Comparator.reverseOrder());
        return list.get(1);
    }
}
