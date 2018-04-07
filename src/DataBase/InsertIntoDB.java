package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertIntoDB {

    private static final String URL = "jdbc:mysql://localhost:3306/PNT?autoReconnect=true&useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "MyNewPass";


    public static void main(String[] args) {

        try {
            Connection myConn = DriverManager.getConnection(URL, USER, PASSWORD);


                Statement myStat = myConn.createStatement();

                String sql = "insert into Students(stID, stName, stDOB)"+ "values ('6403', 'ahmed', '01-24-1992')";

                myStat.executeUpdate(sql);

                System.out.println("insertion complete");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
