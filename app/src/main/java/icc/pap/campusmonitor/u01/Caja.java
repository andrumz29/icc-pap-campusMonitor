
package icc.pap.campusmonitor.u01;

import java.util.function.Function;

public class Caja <T> {
    //atributo de la clase
    private final T valor;
    //constructor de la clase
    public Caja(T valor) {
        this.valor = valor;
    }
    //metodo de la clase
    public T obtener() {
        return valor;
    }
//Metodo generico 
//el objetiva es lo que retorna
// comparamos el T de arriva con el R de abajo
public <R> R mapear(Function<T,R> operacion) {
        R resultado = operacion.apply(valor);
        return resultado;
    }
    
}
