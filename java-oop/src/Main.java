
public class Main {


    public static void main(String[] args) {
        //object car:///
        Car car = new Car();

        // == fields == //

        car.brand = "BMW";

        car.model = "320i";

        car.year = 2022;

        // == arguments == //

        updateCar(car, "Mercedez-Benz", 2025);


        showCar(car);


    }

    //method showCar: //
    public static void showCar(Car car) {
        //car 1//
        System.out.println("Car brand: " + car.brand);
        System.out.println("Car model: " + car.model);
        System.out.println("Car year: " + car.year);


    }
   // == method updateCar == //
    public static void updateCar(Car car, String newBrand, int newYear) {
        car.brand = newBrand;
        car.year = newYear;

    }
}
