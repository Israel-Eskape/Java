
public class AutomovilEstandar extends VehiculoTransporte{
/**
 * Clase donde se herenda las propiedades de la clase Abstracta VehiculoTransporte
 * es donde va a variar de acuerdo a cada tipo de transporte en este caso es un Automovil Estandar
 */    AutomovilEstandar(){
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