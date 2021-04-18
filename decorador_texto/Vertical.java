public class Vertical extends Decorador {
    private char vertical;

    public Vertical(Texto tex, char ta){
        super(tex);
        vertical = ta;
        texto= super.getTexto();
    }
    @Override
    public String getTexto(){
        String t = "";
        
        if(vertical == 'V' || vertical == 'v'){

            for(int p=0; p < texto.length();p++){
                if(texto.charAt(p) ==  ' '){
                    t+="\n";
                }else{
                    t+=texto.charAt(p);
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
