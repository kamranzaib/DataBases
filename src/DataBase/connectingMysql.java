package DataBase;


import java.sql.*;

public class connectingMysql {

    private static final String URL = "jdbc:mysql://localhost:3306/PNT?autoReconnect=true&useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "MyNewPass";


    public static void main(String[] args) {

        try {
            Connection myConn = DriverManager.getConnection(URL, USER, PASSWORD);

            Statement myStat = myConn.createStatement();

            ResultSet myRes = myStat.executeQuery("SELECT * FROM Students");

            while (myRes.next()){
                System.out.println("Name" + " " + myRes.getString("stName")+ " "
                        + "ID" + " " + myRes.getString("stID")+ " " + "DOB" + " " + myRes.getString("stDOB"));

            }






        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
