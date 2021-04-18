
public class Justificar extends Decorador {
    private char justificar;

    public Justificar(Texto tex, char ta){
        super(tex);
        justificar = ta;
        texto= super.getTexto();
    }

    @Override
    public String getTexto(){
        int tamañoRenglon = 80;
        int numeroEspacios= 0;
        String t = "";
        
        if(justificar == 'J' || justificar == 'j'){
            numeroEspacios = tamañoRenglon - texto.length();
            texto = texto.replaceAll("^\\s*", "");
            if(numeroEspacios!= 0){
                for(int p=0; p < texto.length();p++){
                    if(texto.charAt(p) ==  ' '){
                        t+="\t";
                    }else{
                        t+=texto.charAt(p);
                    }
                }
            }
            texto = t;
            t="";               
        }
        return texto;

    }
    @Override
    public void setTexto(String t){
        //throw new UnsupportedOperationException("no sopported yet");
    }
}
