public class Alinear extends Decorador{
    private char alinear;

    Alinear(Texto textob){
        super(textob);
        texto = super.getTexto();
        //System.out.print(texto);
    }
    public void setAlinear(char ta){
        alinear = ta;
    }

    @Override
    public String getTexto(){
        int tamañoRenglon = 80;
        int numeroEspacios= 0;
        String t = "  ";
        if(alinear == 'C' || alinear == 'c'){
            numeroEspacios = (tamañoRenglon -texto.length())/2;
            for(int p=0; p < numeroEspacios;p++)
                t.concat(" ");
        }
        return t+texto;

    }
    @Override
    public void setTexto(String t){
        //Soporte 
    }
}