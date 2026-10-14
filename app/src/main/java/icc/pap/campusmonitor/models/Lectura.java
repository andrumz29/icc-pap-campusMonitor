package icc.pap.campusmonitor.models;

import java.util.function.Function;

public class Lectura <T> {
    private String idSensor;
    private T valor;
    private String unidad;
    
    public Lectura(String idSensor, T valor, String unidad){
        this.idSensor = idSensor;
            this.unidad = unidad;
            this.valor = valor;
    }
    public String getIdSensor() {
        return idSensor;
    }
    public T getValor() {
        return valor;
    }
    public String getUnidad() {
        return unidad;
    }
     public <R> Lectura<R> transformar(Function<T, R> conversor, String nuevaUnidad) {

        if (conversor == null) {
            throw new IllegalArgumentException("El conversor no puede ser nulo");
                
        }

        R conversion = conversor.apply(getValor());

        if (conversion == null) {
            throw new IllegalArgumentException("El resultado de la conversión no puede ser nulo");
                
        }

        return new Lectura<R>(getIdSensor(),conversion, nuevaUnidad );
    }
}