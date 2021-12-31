/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


import java.sql.*;

/**
 *
 * @author dicky
 */
public class queSql {
    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost/penduduk";
    static final String USER="root";
    static final String PASS="";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public queSql(){
        try{
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
        } catch (SQLException err){
            System.out.println("Error " + err);
        }
    }
    
    public ResultSet getData(String sql){
        try{
            rs = stmt.executeQuery(sql);
        }catch(SQLException err){
            System.out.println("Error on get data" + err);
        }
        return rs;
    }
    
    public void query(String sql){
        try{
            stmt.executeUpdate(sql);
        }catch(SQLException err){
            System.out.println("Error on querry " + err);
        }
    }
}
