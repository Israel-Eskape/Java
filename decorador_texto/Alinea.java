public class Alinea extends Decorador {
    private char alinear;

    public Alinea(Texto tex, char ta){
        super(tex);
        alinear = ta;
        texto= super.getTexto();
    }
    @Override
    public String getTexto(){
        int tamañoRenglon = 50;
        int numeroEspacios= 0;
        String t = "  ";
        if(alinear == 'C' || alinear == 'c'){
            numeroEspacios = (tamañoRenglon - texto.length())/2;
            System.out.println("num Espacios = "+numeroEspacios);
            for(int p=0; p < numeroEspacios;p++)
                t+=" ";
        }
        return t+texto;

    }
    @Override
    public void setTexto(String t){
        //throw new UnsupportedOperationException("no sopported yet");
    }
}
