package ejercicioTema4;

public class SmartDevice {
    protected boolean bluetooth;
    protected boolean wifi;
    protected int mesesDeGarantia;
    protected int minutosDeBateria;

    public SmartDevice() {
    }

    public SmartDevice(boolean bluetooth, boolean wifi, int mesesDeGarantia, int minutosDeBateria) {
        this.bluetooth = bluetooth;
        this.wifi = wifi;
        this.mesesDeGarantia = mesesDeGarantia;
        this.minutosDeBateria = minutosDeBateria;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "bluetooth=" + bluetooth +
                ", wifi=" + wifi +
                ", mesesDeGarantia=" + mesesDeGarantia +
                ", minutosDeBateria=" + minutosDeBateria +
                '}';
    }
}
