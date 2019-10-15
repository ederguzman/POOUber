class UberPool extends Car{ // extends indica que UberX esta heredando de Car
    String brand;
    String model;

    public UberPool(String license, Account driver, String brand, String model){ //Constructor
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
}