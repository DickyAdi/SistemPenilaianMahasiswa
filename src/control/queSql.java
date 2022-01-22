/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.inputNilai;

/**
 *
 * @author dicky
 */
public class queSql {
    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost/sistempenilaianmahasiswa";
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
            Logger.getLogger(inputNilai.class.getName()).log(Level.SEVERE, null, err);
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
    
    public int searchidMhs(String val) throws SQLException{
        String que = "SELECT * FROM mahasiswa WHERE nama='"+val+"';";
        rs = getData(que);
        int id = 0;
        while(rs.next()){
            id = rs.getInt("idMhs");
        }
        return id;
    }
    
    public int searchidMk(String val) throws SQLException{
        String que = "SELECT * FROM matakuliah WHERE nama='"+val+"';";
        rs = getData(que);
        int id = 0;
        while(rs.next()){
            id = rs.getInt("idMk");
        }
        return id;
    }
    
    public int getSksMk(String val) throws SQLException {
        String que = "SELECT * FROM matakuliah WHERE nama='"+val+"';";
        rs = getData(que);
        int id = 0;
        while (rs.next()){
            id = rs.getInt("sks");
        }
        return id;
    }
    
    public String getNamaMk(String val) throws SQLException {
        String que = "SELECT * FROM matakuliah WHERE nama = '"+val+"';";
        rs = getData(que);
        String mk = "";
        while (rs.next()){
            mk = rs.getString("nama");
        }
        return mk;
    }
    
    public String getNamaMkbyId(int val) throws SQLException {
        String que = "SELECT nama FROM matakuliah WHERE idMk="+val+";";
        rs = conn.createStatement().executeQuery(que);
        rs.next();
        String mk = rs.getString("nama");
        return mk;
    }
    
    public boolean searchNama(String nama){
        String que = "SELECT * "
                + "FROM mahasiswa "+ "WHERE nama = '"+ nama+"'";
        boolean stats = false;
        rs = getData(que);
        try{    
            while(rs.next()){
                if (rs.getString("nama") != null){
                    stats = true;
                }
            }
        } catch(SQLException err){
            System.out.println("Error" + err);
        }
        return stats;
    }
    
    public boolean searchNim(String nim) throws SQLException{
        String que = "SELECT * FROM mahasiswa WHERE nim='"+nim+"';";
        boolean stats = false;
        rs = getData(que);
        while(rs.next()){
            if (rs.getString("nim") != null){
                stats = true;
            }
        }
        return stats;
    }
    
    public boolean isfollowingMk(String nama, String mk) throws SQLException{
        int idMk = searchidMk(mk);
        int idMhs = searchidMhs(nama);
        String que = "SELECT * FROM nilaimatakuliah WHERE NMidMhs="+idMhs+" AND NMidMk="+idMk;
        boolean stats = false;
        rs = getData(que);
        while(rs.next()){
            Integer res = Integer.valueOf(rs.getInt("NMidMk"));
            if (res != null){
                stats = true;
            }
        }
        return stats;
    }
    
    public int getsksMhs(String nama) throws SQLException{
        String que = "SELECT * FROM mahasiswa WHERE nama='"+nama+"';";
        rs = getData(que);
        rs.next();
        int val = 0;
        Integer res = Integer.valueOf(rs.getInt("totSks"));
        if (res == null){
            val = 0;
        } else {
            val = res;
        }
        return res;
    }
    
    public double countIpk(int id) throws SQLException{
        String que = "SELECT * from nilaimatakuliah WHERE NMidMhs="+id;
        rs = getData(que);
        double totIndex = 0;
        int totSks = 0;
        while(rs.next()){
            totIndex = totIndex + rs.getDouble("idx");
            totSks = totSks + rs.getInt("sks");
        }
        rs.close();
        return totIndex/totSks;
    }
    
    public int countTotSks(int id) throws SQLException {
        String que = "SELECT * FROM nilaimatakuliah WHERE NMidMhs="+id;
        rs = getData(que);
        int totSks = 0;
        while(rs.next()){
            totSks = totSks + rs.getInt("sks");
        }
        return totSks;
    }
}
