public class AutomovilEstandar extends VehiculoTransporte{
    AutomovilEstandar(){
        frenar = new FrenarManual();
        acelerar = new AcelerarManual();
    }
    public float frenar(float intensidad){
        setIntensidad(intensidad);
        return intensidad;
    }
    
}
