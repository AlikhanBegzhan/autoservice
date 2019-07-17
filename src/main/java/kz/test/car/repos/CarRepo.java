package kz.test.car.repos;

import kz.test.car.domain.Car;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface CarRepo extends CrudRepository<Car, Integer> {

    List<Car> findByCarOwnerName(String carOwnerName);
}

