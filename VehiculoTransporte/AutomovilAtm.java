public class AutomovilAtm extends VehiculoTransporte{
    AutomovilAtm(){
        frenar = new FrenarAtm();
        acelerar = new AcelerarAtm();
    }
    
}
