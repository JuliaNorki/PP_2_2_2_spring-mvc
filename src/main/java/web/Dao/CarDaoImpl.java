package web.Dao;

import org.springframework.stereotype.Repository;
import web.module.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

    @Repository
    public class CarDaoImpl implements CarDao {
        private  static List<Car> getListCar = new ArrayList<>();

       static  {
            getListCar.add(new Car("Volga", "blake", "1"));
            getListCar.add(new Car("Porsche", "white", "2"));
            getListCar.add(new Car("Land Cruiser", "white", "3"));
            getListCar.add(new Car("BMW", "blake", "4"));
            getListCar.add(new Car("Audi", "silver", "5"));
        }


        public List<Car> getListCar(int count) {
            return getListCar.stream().limit(count).toList();
        }
    }

