public abstract class VehiculoTransporte{
    protected int capacidad;
    protected int peso;
    private Frenar frenar;
    private Acelerar acelerar;

    VehiculoTransporte(){}
    
    public Frenar movoFrenar(){
        return frenar;
    }
    public Acelerar movoAcelerar(){
        return acelerar;
    }
    

    
}