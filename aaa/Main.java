package aaa;

public class Main {
    public static void main(String[] args) {
        Car f1car = Car.builder()
        .setSeats(2)
        .setEngine("V12")
        .setGPS(true)
        .setTripComputer(true)
        .build();   
        
        System.out.println(f1car);


    } 

    
}
