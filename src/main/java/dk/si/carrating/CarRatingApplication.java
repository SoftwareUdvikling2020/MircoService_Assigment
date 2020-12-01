package dk.si.carrating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CarRatingApplication {

    public static void main(String[] args)
    {
       SpringApplication.run(CarRatingApplication.class, args);

    }

}
