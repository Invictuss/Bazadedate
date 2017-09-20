package admin;

import java.sql.*;

/**
 * Created by Razvan on 9/13/2017.
 */
public class Admin {
    public static void main(String[] args) {
        String dburl = "jdbc:postgresql:bazajava";
        String user = "postgres";
        String password = "stelian";

        try {
            Connection baza = DriverManager.getConnection(dburl, user, password);
            System.out.println("Ce fain!");
            Statement mySmt = baza.createStatement();
         angajat pers1 = new angajat (1, "Ion", "Strada marinescu", 2500);
         angajat pers2 = new angajat (2, "Marian", "Strada iosif", 3500);
         angajat pers3 = new angajat (3, "Ionut", "Strada florin", 4500);
            pers1.inregistreaza(mySmt,"angajat");
            pers2.inregistreaza(mySmt,"angajat");
            pers3.inregistreaza(mySmt,"angajat");

            /*
         String crTable = "Create Table admin.angajat ( " +
                    "pk_id int Primary key not null, " +
                 "nume char (60), " +
                 "adresa char (120), " +
                 "salariu real);";
         myStmt.executeUpdate(crTable);*/
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Nu merge");
        }
    }
}
