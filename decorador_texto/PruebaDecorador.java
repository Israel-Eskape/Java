public class PruebaDecorador{

    public static void main(String args[]){
        Texto textob = new TextoC();
        textob.setTexto("Como entre los individuos como entre las naciones");
/*        System.out.println("Texto -> "+textob.getTexto());
        Alinear ta = new Alinear(textob);
        ta.setAlinear('c');
        System.out.println(ta.getTexto());*/

/*        Texto ta = new Alinea(textob,'c');
        System.out.println(ta.getTexto());
        Texto tb = new Alinea(textob,'I');
        System.out.println(tb.getTexto());
  */     
        Texto tv = new Vertical(textob,'d');
        System.out.println("Texto original :\n"+tv.getTexto());
        

        Texto  td = new Vertical(textob,'c');

        System.out.print("\nTexto Modificado :\n");
        System.out.println(td.getTexto());
    }
}