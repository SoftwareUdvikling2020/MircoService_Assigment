package dk.si.carrating;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CarRating {

    @Id
    private long ratingId;

    private long carId;
    private double rating;

    public CarRating(long ratingId, long carId, double rating) {
        this.ratingId = ratingId;
        this.carId = carId;
        this.rating = rating;
    }

    public CarRating() {
    }

    public long getRatingId() {
        return ratingId;
    }

    public void setRatingId(long ratingId) {
        this.ratingId = ratingId;
    }

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
