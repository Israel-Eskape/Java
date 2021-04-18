public abstract class Decorador extends Texto{
    protected Texto iTexto;

    public Decorador(Texto t){
        iTexto = t;
    }

    public String getTexto(){
        return iTexto.getTexto(); 
    }
}