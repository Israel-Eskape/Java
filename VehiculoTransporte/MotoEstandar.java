public class MotoEstandar extends VehiculoTransporte{
    MotoEstandar(){
        frenar = new FrenarManual();
        acelerar = new AcelerarManual();
        System.out.println("Se crea una Moto Estandar");
    }

    public float frenar(float intensidad){
        System.out.println("MotoEstandar frenar ");
        setIntensidad(intensidad);
        return intensidad;
    }

    public float acelerar(int velocidad, float intensidad){
        System.out.println("MotoEstandar acelerar");
        setVelocidad(velocidad);
        setIntensidad(intensidad);
        return intensidad;
    }
}
