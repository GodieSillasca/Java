package factory.examples.cars.factories;

import factory.examples.cars.products.Camry;
import factory.examples.cars.products.Car;
import factory.examples.cars.products.Corolla;

public class ToyotaFactory extends CarsFactory {
    @Override
    public Car createProduct(String productName) {
        Car car = null;

        if(productName.equalsIgnoreCase("CAMRY")){
            car = new Camry();
        }else if(productName.equalsIgnoreCase("COROLLA")){
            car = new Corolla();
        }

        return car;
    }
}
