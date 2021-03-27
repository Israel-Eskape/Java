public abstract class VehiculoTransporte{
    protected int capacidad;
    protected int peso;
    protected Frenar frenar;
    protected Acelerar acelerar;

    VehiculoTransporte(){}
    
    public Frenar movoFrenar(){
        return frenar;
    }
    public Acelerar movoAcelerar(){
        return acelerar;
    }
    
}