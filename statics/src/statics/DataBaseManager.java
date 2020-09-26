package statics;


import java.sql.*;
import java.util.ArrayList;

public class DataBaseManager {
   
    Connection con;
    java.sql.Statement stat;

    public void openConection(){
        String sql = "CREATE TABLE DATA "
            + "(namad VARCHAR(255), "
            + " gm VARCHAR(255), "
            + " pe VARCHAR(255), "
            + " gpe VARCHAR(255), "
            + " eps VARCHAR(255), "    
            + " bazar VARCHAR(255));";
        try{
            Class.forName("org.h2.Driver");
            con = DriverManager.getConnection("jdbc:h2:~/dataDB","user","1229444");
            stat = con.createStatement();
            stat.execute(sql);
        }catch(Exception e){
        } 
    }
    
    public DataBaseManager(){
        this.openConection();
    }
       
    public void addData(Data data){
        try{           
            if(this.checkDataExistence(data)){     
                this.editData(data);}
            else{String sql = "INSERT INTO DATA VALUES ('" + data.getNamad() + "', '"
                + data.getGhaimatMeyangin() + "', '" + data.getPE() + "', '" + data.getPEG() + "', '" + data.getEPS() + "', '" + data.getBazar() + "')";                       
                stat.execute(sql);}
        }catch(SQLException e){}
    }
    
    public void editData(Data data){
        try{
            String sql = "UPDATE DATA set gm = '" + data.getGhaimatMeyangin() + "', pe = '" + data.getPE() + "',"
                    + " gpe = '" + data.getPEG() + "', eps = '" + data.getEPS() + "', bazar = '" + data.getBazar() + "' where namad =  '" + data.getNamad() + "'";
            stat.execute(sql);
        }catch(SQLException e){}
    }
    
    public void deleteData(Data data){
        String sql = "DELETE FROM DATA WHERE namad = '" + data.getNamad() + "'" ;
        try{
            stat.execute(sql);
        }catch(SQLException e){System.out.print("cant delete");}        
    }
    
    public ArrayList<Data> searchData(String key){
        ArrayList<Data> data = new ArrayList<>();        
        try{
            String sql;
            if(!key.equals("")){
                sql = "SELECT * FROM DATA WHERE namad LIKE '%" + key + "%'" ;
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                Data curData = new Data();
                curData.setNamad(rs.getString("namad"));
                curData.setGhaimatMeyangin(rs.getString("gm"));
                curData.setPE(rs.getString("pe"));
                curData.setPEG(rs.getString("gpe"));
                curData.setEPS(rs.getString("eps"));
                curData.setBazar(rs.getString("bazar"));
                data.add(curData);
                }
            }
            return data;
        }catch(SQLException e){
            System.out.println("cant search");
        }
        return data;
    }
    
    public ArrayList<Data> getAllData(String str){
        
        ArrayList<Data> data = new ArrayList<>();        
        try{
            String sql;
            if(!str.equals("")){
                sql = "SELECT * FROM DATA ORDER BY " + str ;
            }else{
                sql = "SELECT * FROM DATA";
            }
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                Data curData = new Data();
                curData.setNamad(rs.getString("namad"));
                curData.setGhaimatMeyangin(rs.getString("gm"));
                curData.setPE(rs.getString("pe"));
                curData.setPEG(rs.getString("gpe"));
                curData.setEPS(rs.getString("eps"));
                curData.setBazar(rs.getString("bazar"));
                data.add(curData);
            }
            return data;
        }catch(SQLException e){}
        return data;
    }
    
    public boolean checkDataExistence(Data data) throws SQLException{
        String sql = "SELECT * FROM DATA WHERE namad = '" + data.getNamad() + "'" ;
        ResultSet rs = stat.executeQuery(sql);
        if(rs.next()){
            return true;
        }else{
            return false;
        } 
    } 
}
