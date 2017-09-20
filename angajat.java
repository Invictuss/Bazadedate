package admin;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Razvan on 9/13/2017.
 */
public class angajat {
    int id;
    String nume;
    String adresa;
    double salariu;

    public angajat(int id, String nume, String adresa, double salariu) {
        this.id = id;
        this.nume = nume;
        this.adresa = adresa;
        this.salariu = salariu;
    }
    public void inregistreaza (Statement stmt, String table){
        String reg = "insert into " +table
                +"(pk_id,nume,adresa,salariu) values (" +
        this.id + ", ' " + this.nume + "', ' " + this.adresa + "', " + this.salariu+ ");";
                System.out.println(reg);
        try {
            stmt.executeUpdate(reg);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
