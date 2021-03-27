public abstract class VehiculoTransporte{
    protected int capacidad;
    protected int peso;
    protected Frenar frenar;
    protected Acelerar acelerar;
    protected float intensidad;
    protected int velocidad;

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