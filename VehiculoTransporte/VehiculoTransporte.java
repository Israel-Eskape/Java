/**
 * Es la clase Padre donde es la que va a heredar sus propiedades a sus clases hijas
 */
public abstract class VehiculoTransporte{
    private int capacidad;
    private int peso;
    protected Frenar frenar;
    protected Acelerar acelerar;
    private float intensidad;
    private int velocidad;

    VehiculoTransporte(){}
    
    public void setIntensidad(float intensidad){
        this.intensidad = intensidad;
    }
    public float getIntensidad(){
        return intensidad;
    }
    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }
    public float getVelocidad(){
        return velocidad;
    }

    public float modoFrenar(){
        return frenar.frenar(intensidad);
    }
    public float modoAcelerar(){
        return acelerar.acelerar(velocidad, intensidad);
    }

}   