public class AutomovilAtm extends VehiculoTransporte{
    AutomovilAtm(){
        frenar = new FrenarAtm();
        acelerar = new AcelerarAtm();
        System.out.println("Se crea un Automovil Atm");
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
