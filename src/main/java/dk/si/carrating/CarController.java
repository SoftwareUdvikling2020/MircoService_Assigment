package dk.si.carrating;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import static com.mongodb.client.model.Filters.eq;

@RepositoryRestResource
@ResponseBody
@RequestMapping("/cars")
public class CarController {
    @Autowired

    private Object Car;


    @GetMapping("/{id}")
    public void retrieveCarRating( @PathVariable int id) {
        MongoClient mongo = new MongoClient( "188.166.16.16" , 27017 );
        MongoDatabase database = mongo.getDatabase("myDb");
        MongoCollection<Document> collection = database.getCollection("car");

        Document myDoc = collection.find(eq("carId", 1)).first();
        System.out.println(myDoc.toJson());
    }

}

