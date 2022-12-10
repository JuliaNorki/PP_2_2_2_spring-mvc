package web.Dao;

import web.module.Car;

import java.util.List;

    public interface CarDao {
        List<Car> getListCar(int count);
    }

