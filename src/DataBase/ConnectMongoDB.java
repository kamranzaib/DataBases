package DataBase;

import com.mongodb.DB;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

import javax.swing.text.Document;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;

public class ConnectMongoDB {

    public static  MongoClientURI mongoClientURI = null;
    public static MongoClient mongoClient = null;
    public static MongoDatabase mongoDatabase = null;
    public Collections collections = null;

    public static DB  connectLocalMongoDB() throws java.net.UnknownHostException, KeyStoreException, NoSuchAlgorithmException,
            KeyManagementException{
        mongoClientURI = new MongoClientURI("mongodb://localhost:27017");
        mongoClient = new MongoClient(mongoClientURI);
        DB mongoDatabase = mongoClient.getDB("kam");
        System.out.println("Database Connected");
        System.out.println("Database Connected");

        return mongoDatabase;

    }
    public static void setUpDB() throws java.net.UnknownHostException, KeyStoreException,
            NoSuchAlgorithmException, KeyManagementException {
        DB db = connectLocalMongoDB();
        DBCursor cursor = db.getCollection("students").find();

        while (cursor.hasNext()){
            System.out.println(cursor.next());
        }




    }

    public static void main(String[] args) throws  java.net.UnknownHostException, KeyStoreException,
    NoSuchAlgorithmException, KeyManagementException{
        setUpDB();

    }


}
