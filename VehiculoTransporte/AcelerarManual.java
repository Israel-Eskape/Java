/**
 * Clase de Acelerar Manual y es la implementación de la interface Acelerar
 */
public class AcelerarManual implements Acelerar{
    @Override
    public float acelerar(int velocidad,float intensidad) {
        // TODO Auto-generated method stub
        System.out.println("\n\tAcelerarManual implements Acelerar");
        return intensidad;
    }
}
