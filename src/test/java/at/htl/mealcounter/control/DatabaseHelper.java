package at.htl.mealcounter.control;

import org.apache.derby.jdbc.ClientDataSource;

import javax.sql.DataSource;

public class DatabaseHelper {

    public static final String CONSUMATION_TABLE = "CONSUMATION";
    public static final String PERSON_TABLE = "PERSON";


    public static final String USERNAME = "app";
    public static final String PASSWORD = "app";
    public static final String DATABASE = "db";

    public static DataSource getDatasource() {
        ClientDataSource dataSource = new ClientDataSource();
        dataSource.setServerName("localhost");   // ist default Wert
        dataSource.setDatabaseName(DATABASE);
        dataSource.setUser(USERNAME);
        dataSource.setPassword(PASSWORD);
        return dataSource;
    }
}
