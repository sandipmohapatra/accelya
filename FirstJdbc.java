import java.sql.*;
public class FirstJdbc 
{
public static void main(String[] args)throws Exception 
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1234");
Statement st=con.createStatement();
//st.execute("create table accelyastudent(empno number,name varchar2(30),address varchar2(30))");
//System.out.println("table created");
st.execute("insert into accelyastudent values(101,'sandip','mumbai')");
System.out.println("row inserted");

}
}
