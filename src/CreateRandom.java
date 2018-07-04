import java.text.DecimalFormat;

public class CreateRandom {

    /**
     * 生成num个整数，整数分布在start~end之间
     * @param start 数值的起范围
     * @param end 数值的止范围
     */
    public static void genNum(int start,int end,int num){
        for(int i=0;i<num;i++){
            System.out.println(randomInt(start,end));
        }
    }
    /**
     * @param start 数值的起范围
     * @param end 数值的止范围
     * @return 一个在这个范围内的整数值
     */
    public static int randomInt(int start,int end){
        int rtnn = new Long(start + (long) (Math.random() * (end - start))).intValue();
        if (rtnn == start || rtnn == end) {
            return randomInt(start, end);
        }
        return rtnn;
    }
    public static void genDouble(double start,double end,int num,String pattern){
        for(int i=0;i<num;i++){
            System.out.println(randomDouble(start,end,pattern));
        }
    }
    public static double randomDouble(double start,double end,String pattern){
        DecimalFormat df=new DecimalFormat(pattern);
        double rtnn = start + Math.random() * (end - start);
        if (rtnn == start || rtnn == end) {
            return randomDouble(start, end,pattern);
        }
        return new Double(df.format(rtnn).toString());
    }


}
