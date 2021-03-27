public class AutomovilEstandar extends VehiculoTransporte{
    AutomovilEstandar(){
        frenar = new FrenarManual();
        acelerar = new AcelerarManual();
        System.out.println("Se crea un Automovil Estandar");
    }
    public float frenar(float intensidad){
        System.out.println("AutomovilEstandar frenar ");
        setIntensidad(intensidad);
        return intensidad;
    }
    public float acelerar(int velocidad, float intensidad){
        System.out.println("AutomovilEstandar acelerar");
        setVelocidad(velocidad);
        setIntensidad(intensidad);
        return intensidad;
    }
    
}
