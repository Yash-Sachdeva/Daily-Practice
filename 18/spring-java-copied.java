package mongoDemo;
import java.util.ArrayList;
import java.util.List;

import org.bson.*;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Projections;
import com.mongodb.client.model.Sorts;
import com.mongodb.client.model.Updates;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;

public class MongoDBOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***MONGO DB OPERATIONS");
		MongoClient mongoClient=MongoClients.create("mongodb://localhost:27017");
		MongoDatabase database=mongoClient.getDatabase("demodb");
		MongoCollection<Document> collection=database.getCollection("Employee");
		/*
		FindIterable<Document>i= collection.find();
		for(Document d:i)
		{
			System.out.println(d.toJson());
		}
		*/
		/*
		Document doc=new Document();
		doc.append("name", "Pooja");
		doc.append("age",33);
		doc.append("salary", 6000);
		doc.append("designation", "Programmer");
		collection.insertOne(doc);
		*/
		//collection.insertOne(new Document().append("name", "Suman").append("age", 49).append("salary", 40000).append("designation", "Manager")	);
		/*
		List<Document> empList=new ArrayList<Document>();
		empList.add(new Document().append("name", "Suresh").append("age", 39).append("salary", 72000).append("designation", "Programmer"));
		empList.add(new Document().append("name", "Yash").append("age", 24).append("salary", 92000).append("designation", "Manager"));
		collection.insertMany(empList);
		*/
		/*
		Bson projection1 = Projections.excludeId();	
		Bson projection2 = Projections.exclude("_id","age","salary");
		Bson filter=Filters.eq("designation","Programmer");
		
		Bson sort=Sorts.ascending("salary");
		
		FindIterable<Document>i=collection.find(filter).projection(projection1).sort(sort);
		for(Document d:i)
		{
			System.out.println(d.toJson());
		}
		*/
		Bson filter=Filters.lt("age", 30);
		Bson update=Updates.set("designation","Manager");
		collection.updateOne(filter, update);
		System.out.println("Successfully did operation on mongodb ");
		mongoClient.close();
	}

}
