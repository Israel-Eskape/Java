public class Vertical extends Decorador {
    private char vertical;

    public Vertical(Texto tex, char ta){
        super(tex);
        vertical = ta;
        texto= super.getTexto();
    }
    @Override
    public String getTexto(){
        int tamañoRenglon = 80;
        int numeroEspacios= 0;
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

        if(vertical == 'C' || vertical == 'c'){
            String td = "";
            numeroEspacios = (tamañoRenglon - texto.length())/2;
            for(int p=0; p < numeroEspacios;p++)
                td+=" ";

            for(int p=0; p < texto.length();p++){
                
                if(texto.charAt(p) ==  ' ' ||texto.charAt(p) ==  '\n'){
                    t+="\n"+td;
                    
                }else{
                    
                    t+=texto.charAt(p);
                }
            }
            texto = td+t;
                           
        }


        if(vertical == 'd' || vertical == 'd'){
            String td = "";
            numeroEspacios = (tamañoRenglon - texto.length());
            for(int p=0; p < numeroEspacios;p++)
                td+=" ";

            
            for(int p=0; p < texto.length();p++){
                
                if(texto.charAt(p) ==  ' ' ||texto.charAt(p) ==  '\n' ){
                    t+="\n"+td;
                    
                }else{
                    
                    t+=texto.charAt(p);
                }
            }
            texto = td+t;
                           
        }

        if(vertical == 'I' || vertical == 'i'){
            texto = texto.replaceAll("^\\s*", "");
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
