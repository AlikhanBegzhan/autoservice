package kz.test.car;

import kz.test.car.domain.Car;
import kz.test.car.repos.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import  java.util.Map;

import static javassist.bytecode.StackMapTable.NULL;
import static javassist.bytecode.StackMapTable.tag;

@Controller
public class GreetingController {
    @Autowired
    private CarRepo carRepo;

    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name="name", required=false, defaultValue="World") String name,
            Map<String, Object> model) {
        model.put("name", name);
        return "greeting";
    }

    @GetMapping
    public String main(Map<String, Object> model){
        Iterable<Car> cars = carRepo.findAll();

        model.put("cars", cars);
        return "main";
    }

    @PostMapping
    public String add(@RequestParam String carModel, @RequestParam String carYear,
                      @RequestParam int carMileage, @RequestParam String carOwnerName,
                      @RequestParam String carOwnerNumber, @RequestParam String carOwnerAddress,
                      @RequestParam String carMasterName, @RequestParam String carMasterWork,
                      Map<String, Object> model){
        Car car = new Car( carModel, carYear, carMileage, carOwnerName,
                carOwnerNumber, carOwnerAddress, carMasterName, carMasterWork);
        carRepo.save(car);

        Iterable<Car> cars = carRepo.findAll();
        model.put("cars", cars);

        return "main";
    }

    @PostMapping("filter")
    public String filter(@RequestParam String filter, Map<String, Object> model){
        Iterable<Car> cars;

        if(filter != null && !filter.isEmpty()){
            cars = carRepo.findByCarOwnerName(filter);
        } else{
            cars = carRepo.findAll();
        }
        model.put("cars", cars);

        return "main";
    }

}
