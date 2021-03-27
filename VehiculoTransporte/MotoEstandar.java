public class MotoEstandar extends VehiculoTransporte{
    MotoEstandar(){
        frenar = new FrenarManual();
        acelerar = new AcelerarManual();
    }
    
}
