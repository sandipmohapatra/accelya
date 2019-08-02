import java.sql.*;
import java.util.*;
public class FirstJdbc 
{
public static void main(String[] args)throws Exception 
{
	Scanner ob=new Scanner(System.in);
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1234");
System.out.println("enter empno,name,address");
int eno=ob.nextInt();
String name=ob.next();
String add=ob.next();
PreparedStatement st=con.prepareStatement("insert into accelyastudent values(?,?,?)");
st.setInt(1,eno);st.setString(2, name);st.setString(3,add);
st.execute();System.out.println("row inserted");
Statement st1=con.createStatement();
ResultSet rs=st1.executeQuery("select * from accelyastudent");
while(rs.next())
{	System.out.println(rs.getString(1)+"  "+rs.getString(2)+" "+rs.getString(3));}}}
















