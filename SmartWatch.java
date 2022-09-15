package ejercicioTema4;

public class SmartWatch extends SmartDevice{
    public String modelo;
    public String forma;
    public String tipo;

    public SmartWatch() {

    }

    public SmartWatch(boolean bluetooth, boolean wifi, int mesesDeGarantia, int minutosDeBateria, String modelo, String forma, String tipo) {
        super(bluetooth, wifi, mesesDeGarantia, minutosDeBateria);
        this.modelo = modelo;
        this.forma = forma;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "modelo='" + modelo + '\'' +
                ", forma='" + forma + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
