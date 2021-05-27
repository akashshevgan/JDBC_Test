import java.sql.*;
class MysqlCon{
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/addressbookservice","root","root");
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from addressbook");
            while(rs.next())
                System.out.println(rs.getString("firstname")+"  "+rs.getString(2)+"  "
                        +rs.getString(3)+" "+rs.getString(4)+" "
                        +rs.getString(5)+" "+rs.getInt(6)+" "+rs.getInt(7)
                +" "+rs.getString(8));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}
