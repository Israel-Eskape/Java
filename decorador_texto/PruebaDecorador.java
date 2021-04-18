public class PruebaDecorador{
    public static void main(String args[]){
        Texto textob = new TextoC();
        textob.setTexto("                       Como entre los individuos como entre las naciones");
/*        System.out.println("Texto -> "+textob.getTexto());
        Alinear ta = new Alinear(textob);
        ta.setAlinear('c');
        System.out.println(ta.getTexto());*/

        Texto ta = new Alinea(textob,'c');
        System.out.println(ta.getTexto());
        Texto tb = new Alinea(textob,'I');
        System.out.println(tb.getTexto());
        
        Texto tc = new Justificar(textob,'j');
        System.out.println(tc.getTexto());
    }
}