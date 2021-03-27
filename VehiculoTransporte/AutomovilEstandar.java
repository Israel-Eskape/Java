public class AutomovilEstandar extends VehiculoTransporte{
    AutomovilEstandar(){
        frenar = new FrenarManual();
        acelerar = new AcelerarManual();
    }
    public float acelerar(int velocidad, float intensidad){
        return intensidad;
    }
    public float frenar(float intensidad){
        return intensidad;
    }
}
