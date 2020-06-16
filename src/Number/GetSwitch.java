package Number;
/*
 *查看当前日期为星期几
 *@Author zzg
 *@create 2020 06 02 20:07
 */
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;


public class GetSwitch {

    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat dataFormat = new SimpleDateFormat();
        String nowString = dataFormat.format(now);

        Calendar cal = Calendar.getInstance();//可以对每个时间域单独修改
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int weekend = cal.get(Calendar.DAY_OF_WEEK);
        int day = cal.get(Calendar.DATE);
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);

        switch (weekend-1){
            case 0:
                System.out.println("星期日");
                break;
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
            default:
                System.out.println("星期六");
        }

        System.out.println(now);
        System.out.println(nowString);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(hour);
        System.out.println(minute);
    }
}
