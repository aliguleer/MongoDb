package Data;
import com.mongodb.*;

public class App {


    public static void main(String[] args) {
        //psvm tab short cut
        MongoClient m1= new MongoClient("localhost",27017);
        DB database=m1.getDB("test");
        DBCollection collection =database.getCollection("user");
/*
        //insert data
        BasicDBObject obj = new BasicDBObject()
                .append("name","Denyo İgnasyo"  )
                .append("year","1985")
                .append("country","TR")
                .append("state","Istanbul");


        BasicDBObject obj2 = new BasicDBObject()
                .append("name","Battal Gazi"  )
                .append("year","1910")
                .append("country","Osmalı");
        WriteResult result =collection.insert(obj);
        WriteResult result2 =collection.insert(obj2);

        System.out.println(result);
        System.out.println(result2);
*/
/*
        // data listing
    DBCursor list = collection.find();
    while (list.hasNext())
    {
        System.out.println(list.next());
    }

        DBCursor listx = collection.find(new BasicDBObject("name","Kamil Sonmez"));
        while (listx.hasNext())
        {
            System.out.println(listx.next());
        }
*/
/*
    //update data
        // changed by 1985>1986
        //changed name Denyo İgnasyo > Denyo Ignasyo
        BasicDBObject uobj = new BasicDBObject()
                .append("name","Denyo Ignasyo"  )
                .append("year","1986")
                .append("country","TR")
                .append("state","Istanbul");

        collection.update(
                new BasicDBObject("name","Denyo İgnasyo"),
                new BasicDBObject("$set",new BasicDBObject(uobj))
        );
        */
        //Delete Collection
        collection.drop();
    //delete DB

        database.dropDatabase();
    }
}
