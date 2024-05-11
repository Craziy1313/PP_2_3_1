package web.servise;

import org.springframework.stereotype.Controller;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
@Controller
public class CarsServise {
    private List<Car> cars;
    {
        cars = new ArrayList<Car>();

        cars.add(new Car(1,1994,"Toyota"));
        cars.add(new Car(13,2008,"Toyota"));
        cars.add(new Car(7,1999,"BMW"));
        cars.add(new Car(15,2023,"Mercedes"));
        cars.add(new Car(11,2019,"Audi"));

    }
    public List<Car> getCars() {
        return cars;
    }
    public Car showCar(int car) {
        return cars.get(car);
    }
}
