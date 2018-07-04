import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class jdbcUtil {
    private static String OUSERNAME;
    private static String OPASSWORD;
    private static String ODRIVER;
    private static String OURL;
    public static int MILLIS;

    static {
        try
        {
            Properties prop = new Properties();

            String dir = System.getProperty("user.dir");
             InputStream inStream = new FileInputStream(new File(dir+"/jdbc.properties"));
          //  InputStream inStream = jdbcUtil.class.getResourceAsStream("/jdbc.properties");
            prop.load(inStream);

            OUSERNAME = prop.getProperty("oracle.username");
            OPASSWORD = prop.getProperty("oracle.password");
            ODRIVER = prop.getProperty("oracle.driver");
            OURL = prop.getProperty("oracle.url");
            MILLIS = Integer.parseInt(prop.getProperty("millis"));
        }
        catch (Exception e)
        {
            throw new RuntimeException("读取数据库配置文件异常！", e);
        }
    }





    public static Connection getConnection(){
        Connection conn=null;
        try {
            Class.forName(ODRIVER);//找到oracle驱动器所在的类
            conn=DriverManager.getConnection(OURL, OUSERNAME, OPASSWORD);

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(PreparedStatement pstmt){
        if(pstmt !=null){
            try {
                pstmt.close();
            } catch (SQLException e) {

                e.printStackTrace();
            }
        }
    }

    public static void close(ResultSet rs){
        if(rs !=null){
            try {
                rs.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public static void close(Connection conn){
        if(conn !=null){
            try {
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
