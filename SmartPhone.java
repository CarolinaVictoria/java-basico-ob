package ejercicioTema4;

public class SmartPhone extends SmartDevice{
    public String marca;
    public String modelo;
    public String gama;

    public SmartPhone() {
    }

    public SmartPhone(boolean bluetooth, boolean wifi, int mesesDeGarantia, int minutosDeBateria, String marca, String modelo, String gama) {
        super(bluetooth, wifi, mesesDeGarantia, minutosDeBateria);
        this.marca = marca;
        this.modelo = modelo;
        this.gama = gama;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", gama='" + gama + '\'' +
                '}';
    }
}
