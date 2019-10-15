class UberX extends Car{ // extends indica que UberX esta heredando de Car
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model){ //Constructor
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }

    @Override
    void printDataCar() {
        // TODO Auto-generated method stub
        super.printDataCar();
        System.out.println("Model: " + model + " Brand: " + brand);
    }
}