class Main{
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        UberX uberX = new UberX("AMQ1234", new Account("Andres Herrera", "AND1234"), "Chevrolet", "Sonic"); // Constructor
        //uberX.passenger = 4;
        uberX.setPassenger(3);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("FGH345", new Account("Andres Herrera", "AND123"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

        /*Car car2 = new Car("QWE3456", new Account("Maria Rodriguez", "MAR5678"));
        car2.passenger = 3;
        car2.printDataCar();*/
    }
}