public class MotoAtm extends VehiculoTransporte {
    MotoAtm(){
        frenar = new FrenarAtm();
        acelerar = new AcelerarAtm();
        System.out.println("Se crea una MotoAtm");
    }
    public float frenar(float intensidad){
        System.out.println("MotoAtm frenar ");
        setIntensidad(intensidad);
        return intensidad;
    }
    public float acelerar(int velocidad, float intensidad){
        System.out.println("motoAtm acelerar");
        setVelocidad(velocidad);
        setIntensidad(intensidad);
        return intensidad;
    }
}
