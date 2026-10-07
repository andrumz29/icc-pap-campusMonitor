
package main.java.icc.pap.campusmonitor.u01;
public class Caja <T> {
    private final T valor;
    public Caja(T valor) {
        this.valor = valor;
    }
    public T obtener() {
        return valor;
    }
}
