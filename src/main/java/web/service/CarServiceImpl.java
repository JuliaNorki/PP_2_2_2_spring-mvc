package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Dao.CarDao;
import web.module.Car;

import java.util.List;



    @Service
    public class CarServiceImpl implements CarService {

        private final CarDao cars;

        @Autowired
        public CarServiceImpl(CarDao cars) {
            this.cars = cars;
        }
        @Override
        public List<Car> getListCar(int count) {
            return cars.getListCar(count);
        }
    }



