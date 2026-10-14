package icc.pap.campusmonitor.u01;

public class MetodosDemo {
    public static void main(String[] args) {
       //mini proyecto dentro de otro proyecto este tiene otro main
       Caja<String> original = new Caja<>("algoritmo");
       //mapper el valor string de la caja a un integer con el metodo length
      // Function<String,Integer> fun = texto -> texto.length();
       Integer longitud = original.mapear(texto -> texto.length());
       String etiqueta = original.mapear(texto -> "Materia"+texto);
       System.out.println("original: "+original.obtener());
       System.out.println("longitud: "+longitud);
       System.out.println("etiqueta: "+etiqueta);
       
    }
}
