package hospital.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class data {
    Connection connection;

    Statement statement;

    public data(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_management_system","root","Rohit@0606");
            statement = connection.createStatement();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
