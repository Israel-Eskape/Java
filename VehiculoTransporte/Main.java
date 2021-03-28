public class Main {
    public static void main(String[] args) {
        
        VehiculoTransporte autoEstandar = new AutomovilEstandar();
        autoEstandar.setVelocidad(4);
        autoEstandar.setIntensidad(30);

        autoEstandar.modoAcelerar();
        autoEstandar.modoFrenar();

        System.out.println("\nIntensidad de frenado  = "+autoEstandar.getIntensidad());

        
        VehiculoTransporte autoAtm = new AutomovilAtm();
        autoAtm.modoAcelerar();
        autoAtm.modoFrenar();

        VehiculoTransporte motoEstandar = new MotoEstandar();
        motoEstandar.modoAcelerar();
        motoEstandar.modoFrenar();

        VehiculoTransporte motoAtm = new MotoAtm();
        motoAtm.modoAcelerar();
        motoAtm.modoFrenar();

        
    }
}
