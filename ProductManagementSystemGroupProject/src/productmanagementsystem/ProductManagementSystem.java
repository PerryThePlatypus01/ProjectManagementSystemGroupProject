/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productmanagementsystem;
import java.sql.*;
/**
 *
 * @author Navneet
 */
public class ProductManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String dbURL = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String username ="root";
        String password = "root";
//        Connection dbCon =DriverManager.getConnection(dbURL,username, password);
        try{
            Connection dbCon =DriverManager.getConnection(dbURL,username, password);
            Statement stmt = dbCon.createStatement();
            System.out.println("idkkasas");
        }catch(SQLException ex){
        System.out.println(ex.getMessage());
        }
    }
    
}
