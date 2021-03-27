public class MotoAtm extends VehiculoTransporte {
    MotoAtm(){
        frenar = new FrenarAtm();
        acelerar = new AcelerarAtm();
    }
}
