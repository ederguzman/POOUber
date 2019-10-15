import java.util.ArrayList;
import java.util.Map;

// extends indica que UberX esta heredando de Car
class UberVan extends Car{ 
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    private Integer passenger;

    public UberVan(String license, Account driver,
    Map<String, Map<String, Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial){ //Constructor
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }


    @Override
    public void setPassenger(Integer passenger) {
        // TODO Auto-generated method stub
        if(passenger == 6){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar 6 pasajeros");
        }
    }


}