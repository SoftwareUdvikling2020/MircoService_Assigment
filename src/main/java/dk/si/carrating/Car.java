package dk.si.carrating;



import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Car {

    @Id
    private Long id;

    private String brand;
    private int year;
    private long km;
    private List<CarRating> carRatingList = new ArrayList<>();

    public Car(Long id, String brand, int year, long km, List<CarRating> carRatingList) {
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.km = km;
        this.carRatingList = carRatingList;
    }

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getKm() {
        return km;
    }

    public void setKm(long km) {
        this.km = km;
    }

    public List<CarRating> getCarRatingList() {
        return carRatingList;
    }

    public void setCarRatingList(List<CarRating> carRatingList) {
        this.carRatingList = carRatingList;
    }
}
