package dk.si.carrating;


import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

    @Id
    private Long id;

    private String name;
    private List<CarRating> carsRated = new ArrayList<>();

    public User() {
    }

    public User(Long id, String name, List<CarRating> carsRated) {
        this.id = id;
        this.name = name;
        this.carsRated = carsRated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CarRating> getCarsRated() {
        return carsRated;
    }

    public void setCarsRated(List<CarRating> carsRated) {
        this.carsRated = carsRated;
    }
}
