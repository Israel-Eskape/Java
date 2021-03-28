/**
 * Clase donde se herenda las propiedades de la clase Abstracta VehiculoTransporte
 * es donde va a variar de acuerdo a cada tipo de transporte en este caso es un Automovil Automatico
 */
public class AutomovilAtm extends VehiculoTransporte{
    AutomovilAtm(){
        frenar = new FrenarAtm();
        acelerar = new AcelerarAtm();
        System.out.println("\nSe crea un Automovil Atm");
    }
    public float frenar(float intensidad){
        System.out.println("AutomovilAtm frenar ");
        setIntensidad(intensidad);
        return intensidad;
    }
    public float acelerar(int velocidad, float intensidad){
        System.out.println("AutomovilAtm acelerar");
        setVelocidad(velocidad);
        setIntensidad(intensidad);
        return intensidad;
    }
}
