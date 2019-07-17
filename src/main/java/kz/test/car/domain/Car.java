package kz.test.car.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String carModel;
    private String carYear;
    private Integer carMileage;
    private String carOwnerName;
    private String carOwnerNumber;
    private String carOwnerAddress;
    private String carMasterName;
    private String carMasterWork;

    public Car() {
    }

    public Car(String carModel, String carYear, int carMileage,
               String carOwnerName, String carOwnerNumber, String carOwnerAddress,
               String carMasterName, String carMasterWork) {
        this.carModel = carModel;
        this.carYear = carYear;
        this.carMileage = carMileage;
        this.carOwnerName = carOwnerName;
        this.carOwnerNumber = carOwnerNumber;
        this.carOwnerAddress = carOwnerAddress;
        this.carMasterName = carMasterName;
        this.carMasterWork = carMasterWork;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarYear() {
        return carYear;
    }

    public void setCarYear(String carYear) {
        this.carYear = carYear;
    }

    public Integer getCarMileage() {
        return carMileage;
    }

    public void setCarMileage(Integer carMileage) {
        this.carMileage = carMileage;
    }

    public String getCarOwnerName() {
        return carOwnerName;
    }

    public void setCarOwnerName(String carOwnerName) {
        this.carOwnerName = carOwnerName;
    }

    public String getCarOwnerNumber() {
        return carOwnerNumber;
    }

    public void setCarOwnerNumber(String carOwnerNumber) {
        this.carOwnerNumber = carOwnerNumber;
    }

    public String getCarOwnerAddress() {
        return carOwnerAddress;
    }

    public void setCarOwnerAddress(String carOwnerAddress) {
        this.carOwnerAddress = carOwnerAddress;
    }

    public String getCarMasterName() {
        return carMasterName;
    }

    public void setCarMasterName(String carMasterName) {
        this.carMasterName = carMasterName;
    }

    public String getCarMasterWork() {
        return carMasterWork;
    }

    public void setCarMasterWork(String carMasterWork) {
        this.carMasterWork = carMasterWork;
    }
}
