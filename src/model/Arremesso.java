package model;

public class Arremesso{

    private Double distancia;

    public Arremesso (Double distancia) {
        this.distancia = distancia;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public String toString() {
        return "Distancia: " + distancia;
    }
}
