package lt.boreisa;

import lt.boreisa.databaseConn.DbConn;

public class Run {

    public static void main(String[] args) {

        DbConn conn = new DbConn();

        conn.insertItem("Microwave", 429.99, 8.21);
        conn.insertItem("Scooter", 219.99, 10.41);
    }
}
