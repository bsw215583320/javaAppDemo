import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    public static void main(String[] args) {
        String bth = null;

        Connection conn=null;
        conn=jdbcUtil.getConnection();
       while (true){
           //String sql = "update PRCS_DATA_RT set val = "+CreateRandom.randomDouble(0.075,0.085,"0.000")+" ,tim = SYSDATE where itm = 1985 ";
           String sql="";
           String insertSql;
           String insertBth;
           bth = getbatch();
           for (int i =1901; i<1914;i++){

               sql = "update PRCS_DATA_RT set val = ";
               insertSql = "insert into PRCS_DATA values(";
               insertBth = "insert into PRCS_DATA_BTH values(";
               Date now = new Date();
               switch (i){
                   case 1901 :
                       sql+= CreateRandom.randomDouble(0.07,0.09,"0.000")+" ,tim = SYSDATE , bth = "+bth+" where itm ="+i;
                       insertSql+=bth+","+1401+","+i+",sysdate,'白班',"+CreateRandom.randomDouble(0.075,0.085,"0.000")+",1,1501)";
                       insertBth+=i+","+bth+",sysdate,sysdate+1/24,1401)";
                       break;
                   case 1902 :
                       sql+= CreateRandom.randomDouble(5.5,6.5,"0.0")+" ,tim = SYSDATE,bth = "+bth+" where itm ="+i;
                       insertSql+=bth+","+1401+","+i+",sysdate,'白班',"+CreateRandom.randomDouble(5.5,6.5,"0.0")+",1,1502)";
                       insertBth+=i+","+bth+",sysdate,sysdate+1/24,1401)";
                       break;
                   case 1903 :
                       sql+= CreateRandom.randomDouble(350,370,"0.0")+" ,tim = SYSDATE,bth = "+bth+" where itm ="+i;
                       insertSql+=bth+","+1401+","+i+",sysdate,'白班',"+CreateRandom.randomDouble(350,370,"0.0")+",1,1502)";
                       insertBth+=i+","+bth+",sysdate,sysdate+1/24,1401)";
                       break;
                   case 1904 :
                       sql+= CreateRandom.randomDouble(75,85,"0.0")+" ,tim = SYSDATE,bth = "+bth+" where itm ="+i;
                       insertSql+=bth+","+1401+","+i+",sysdate,'白班',"+CreateRandom.randomDouble(75,85,"0.0")+",1,1502)";
                       insertBth+=i+","+bth+",sysdate,sysdate+1/24,1401)";
                       break;
                   case 1905 :
                       sql+= CreateRandom.randomDouble(19,21,"0.0")+" ,tim = SYSDATE,bth = "+bth+" where itm ="+i;
                       insertSql+=bth+","+1401+","+i+",sysdate,'白班',"+CreateRandom.randomDouble(19,21,"0.0")+",1,1502)";
                       insertBth+=i+","+bth+",sysdate,sysdate+1/24,1401)";
                       break;
                   case 1906 :
                       sql+= CreateRandom.randomDouble(2,4,"0.0")+" ,tim = SYSDATE,bth = "+bth+" where itm ="+i;
                       insertSql+=bth+","+1401+","+i+",sysdate,'白班',"+CreateRandom.randomDouble(2,4,"0.0")+",1,1502)";
                       insertBth+=i+","+bth+",sysdate,sysdate+1/24,1401)";
                       break;
                   case 1907 :
                       sql+= CreateRandom.randomDouble(-17,-19,"0.0")+" ,tim = SYSDATE,bth = "+bth+" where itm ="+i;
                       insertSql+=bth+","+1401+","+i+",sysdate,'白班',"+CreateRandom.randomDouble(-17,-19,"0.0")+",1,1502)";
                       insertBth+=i+","+bth+",sysdate,sysdate+1/24,1401)";
                       break;
                   case 1908 :
                       sql+= CreateRandom.randomDouble(75,85,"0.0")+" ,tim = SYSDATE,bth = "+bth+" where itm ="+i;
                       insertSql+=bth+","+1401+","+i+",sysdate,'白班',"+CreateRandom.randomDouble(75,85,"0.0")+",1,1502)";
                       insertBth+=i+","+bth+",sysdate,sysdate+1/24,1401)";
                       break;
                   case 1909 :
                       sql+= CreateRandom.randomDouble(19,21,"0.0")+" ,tim = SYSDATE,bth = "+bth+" where itm ="+i;
                       insertSql+=bth+","+1401+","+i+",sysdate,'白班',"+CreateRandom.randomDouble(19,21,"0.0")+",1,1502)";
                       insertBth+=i+","+bth+",sysdate,sysdate+1/24,1401)";
                       break;
                   case 1910 :
                       sql+= CreateRandom.randomDouble(0.0085,0.0115,"0.0000")+" ,tim = SYSDATE,bth = "+bth+" where itm ="+i;
                       insertSql+=bth+","+1401+","+i+",sysdate,'白班',"+CreateRandom.randomDouble(0.0085,0.0115,"0.0000")+",1,1502)";
                       insertBth+=i+","+bth+",sysdate,sysdate+1/24,1401)";
                       break;
                   case 1911 :
                       sql+= CreateRandom.randomDouble(0.04,0.06,"0.000")+" ,tim = SYSDATE,bth = "+bth+" where itm ="+i;
                       insertSql+=bth+","+1401+","+i+",sysdate,'白班',"+CreateRandom.randomDouble(0.04,0.06,"0.000")+",1,1503)";
                       insertBth+=i+","+bth+",sysdate,sysdate+1/24,1401)";
                       break;
                   case 1912 :
                       sql+= CreateRandom.randomDouble(110,190,"0.0")+" ,tim = SYSDATE,bth = "+bth+" where itm ="+i;
                       insertSql+=bth+","+1401+","+i+",sysdate,'白班',"+CreateRandom.randomDouble(110,190,"0.0")+",1,1503)";
                       insertBth+=i+","+bth+",sysdate,sysdate+1/24,1401)";
                       break;
                   case 1913 :
                       sql+= CreateRandom.randomDouble(740,860,"0.0")+" ,tim = SYSDATE,bth = "+bth+" where itm ="+i;
                       insertSql+=bth+","+1401+","+i+",sysdate,'白班',"+CreateRandom.randomDouble(740,860,"0.0")+",1,1503)";
                       insertBth+=i+","+bth+",sysdate,sysdate+1/24,1401)";
                       break;
               }
               System.out.println(sql);
               System.out.println(insertSql);



               PreparedStatement pstmt=null; //通常利用PreparedStatement进行操作，性能得到优化
               PreparedStatement pstmt1=null; //通常利用PreparedStatement进行操作，性能得到优化
               PreparedStatement pstmt2=null;
               try{

                   pstmt=conn.prepareStatement(sql);
                //   pstmt1=conn.prepareStatement(insertSql);
                   if (!bth.equals(getbth(bth,i))){
                       System.out.println(insertBth);
                    pstmt2 = conn.prepareStatement(insertBth);
                    pstmt2.executeUpdate();
                   }


                   pstmt.executeUpdate();//运行增删改操作
                //   pstmt1.executeUpdate();//运行增删改操作

               }catch(SQLException e){
                   e.printStackTrace();
               }finally{
                   jdbcUtil.close(pstmt2);
                   jdbcUtil.close(pstmt);
                   jdbcUtil.close(pstmt1);

               }

           }

           try {
               Thread.sleep(jdbcUtil.MILLIS);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
    @org.junit.Test
    public void randomDouble (){
        for (int i=0 ;i<10;i++){
            System.out.println(CreateRandom.randomDouble(0.075,0.085,"0.000"));
        }
    }
    @org.junit.Test
    public void randomInt(){
        for (int i=0 ;i<10;i++){
            System.out.println(CreateRandom.randomInt(110,190));
        }
    }
    public static String getbatch(){
        Date date = new Date();
        String bth = new SimpleDateFormat("yyMMddHH").format(date);
        return bth;
    }

    public static String getbth(String bth,int itm ){
        String sql = "select bth from PRCS_DATA_BTH where bth = " + bth +"and itm = " + itm;
        Connection conn = jdbcUtil.getConnection();
        PreparedStatement pstmt= null;
        ResultSet rs = null;
        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            if (rs.next()){

                return bth;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }  finally{

        jdbcUtil.close(rs);
        jdbcUtil.close(pstmt);
        jdbcUtil.close(conn);

    }
        return null;
    }

}
