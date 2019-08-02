import java.io.*;
import java.sql.*;
import java.util.*;
public class ResultSetWriteInToTextFile {
    public static void main(String[] args) {
            List data = new ArrayList();
            try {
                    Connection con = null;
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1234");
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("Select * from accelyastudent");

                    while (rs.next()) {
                            String empno = rs.getString("empno");
                            String name = rs.getString("name");
                            String address = rs.getString("address");
                            data.add(empno + " " + name + " " + address);

                    }
                    writeToFile(data, "Employee.txt");
                    rs.close();
                    st.close();
            } catch (Exception e) {
                    System.out.println(e);
            }
    }

    private static void writeToFile(java.util.List list, String path) {
            BufferedWriter out = null;
            try {
                    File file = new File(path);
                    out = new BufferedWriter(new FileWriter(file, true));
                    for (Object s : list) 
                    {
                            out.write((String) s);
                            out.newLine();

                    }
                    out.close();
            } catch (IOException e) {
            }
    }
}

