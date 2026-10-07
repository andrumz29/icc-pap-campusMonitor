

package icc.pap.campusmponitor.u01;

import main.java.icc.pap.campusmonitor.u01.Caja;
import main.java.icc.pap.campusmonitor.u01.Sensor;

public class TiposDemo {
    public static void main(String[] args) {
        Caja<String> lugar = new Caja<>("Lab 6");
        Caja<Integer> limite = new Caja<>(30);
        Caja<Sensor> device = new Caja<>(new Sensor("so1", lugar.obtener()));
        System.out.println( lugar.obtener());
        System.out.println(limite.obtener());
        System.out.println(device.obtener());
        System.out.println(device.obtener().id()+" "+device.obtener().ubicacion());
    }
}
