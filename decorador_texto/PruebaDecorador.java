public class PruebaDecorador{
    public static void main(String args[]){
        Texto textob = new TextoC();
        textob.setTexto("Ejemplo decorador");
/*        System.out.println("Texto -> "+textob.getTexto());
        Alinear ta = new Alinear(textob);
        ta.setAlinear('c');
        System.out.println(ta.getTexto());*/

        Texto ta = new Alinea(textob,'c');
        System.out.println(ta.getTexto());
 
    }
}