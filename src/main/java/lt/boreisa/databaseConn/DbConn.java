package lt.boreisa.databaseConn;

import lt.boreisa.model.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class DbConn {

    private final SessionFactory factory = new Configuration().configure().buildSessionFactory();
    private final Session session = factory.openSession();
    private Transaction tx = null;

    public void insertItem (String name, Double price, Double weight) {
        tx = session.beginTransaction();
        // Database Queries
        Item item = new Item();
        item.setName(name);
        item.setPrice(price);
        item.setWeight(weight);
        item.setArrivalDate(new Date());
        session.save(item);
        // End
        tx.commit();
    }

    public void updateItemPriceUsingId (Integer id, Double price) {
        tx = session.beginTransaction();
        Item item = (Item) session.load(Item.class, new Long(20));
    }
}
