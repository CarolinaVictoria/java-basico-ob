package ejercicioTema4;

public class Main {

    public static void main(String[] args) {
        SmartDevice dispositivo1 = new SmartDevice(true, false, 12, 1200);

        SmartPhone dispositivo2 = new SmartPhone(true, true, 24, 4000, "Motorola", "G3", "media");

        SmartWatch dispositivo3 = new SmartWatch(false, true, 6, 1000, "deportivo", "cuadrado", "analogico");

        System.out.println("Dispositivo 1" + " meses de garantía: " + dispositivo1.mesesDeGarantia);
        System.out.println("Dispositivo 2" + " gama: " + dispositivo2.gama);
        System.out.println("Dispositivo 3" + " tipo: " + dispositivo3.tipo);


    }


}
