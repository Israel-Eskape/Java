
public class Alinea extends Decorador {
    private char alinear;

    public Alinea(Texto tex, char ta){
        super(tex);
        alinear = ta;
        texto= super.getTexto();
    }
    @Override
    public String getTexto(){
        int tamañoRenglon = 80;
        int numeroEspacios= 0;
        String t = "";
        if(alinear == 'C' || alinear == 'c'){
            numeroEspacios = (tamañoRenglon - texto.length())/2;
            for(int p=0; p < numeroEspacios;p++)
                t+=" ";
        }

        if(alinear == 'D' || alinear == 'd'){
            numeroEspacios = (tamañoRenglon - texto.length());
            for(int p=0; p < numeroEspacios;p++)
                t+=" ";
        }

        if(alinear == 'I' || alinear == 'i'){
            texto = texto.replaceAll("^\\s*", "");
        }
        
        return t+texto;
    }
    @Override
    public void setTexto(String t){
        //throw new UnsupportedOperationException("no sopported yet");
    }
}
