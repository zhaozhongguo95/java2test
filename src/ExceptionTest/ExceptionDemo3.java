package ExceptionTest;

/**
 * @author CrazyZ
 * @create 2020-06-16-10:52
 */
public class ExceptionDemo3 {
    public static void main(String[] args) {
        try {
            new People().setBirthday(2001,2,32);
        } catch (InvalidYearException e) {
            e.printStackTrace();
        } catch (InvalidMonthException e) {
            e.printStackTrace();
        } catch (InvalidDayException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.getMessage();
        }
        System.out.println("出生年月日:"+People.year+People.month+People.day);
        System.out.println(People.year+"是："+People.judgeYear(People.year));
        System.out.println(People.month+"是："+People.judgeMonth(People.month,People.year));

    }
}

class People{
    public static int year, month, day;
    public void setBirthday(int year, int month,int day) throws InvalidYearException,InvalidMonthException,InvalidDayException{
        this.year = year;
        this.month = month;
        this.day = day;
        if(year<=1970){
            throw new InvalidYearException("年设置错误");
        }
        if(month<1||month>12){
            throw new InvalidMonthException("月设置错误");
        }
        if(day<1||day>31){
            throw new InvalidDayException("日设置错误");
        }
    }
    //判断大月小月
    public static String judgeYear(int year){
        String yearResult = "平年";
        if(year%4==0||year%400==0){
            yearResult ="闰年";
        }else{
            yearResult = "平年";
        }
        return yearResult;
    }
//    判断平闰年
    public static String judgeMonth(int month,int year){
        String monthResult="大月";
        if(judgeYear(year)=="闰年"){
            if(month==2){
                monthResult="大月";
            }
        }else {
            if (month == 2 ||month == 4 || month == 6 || month == 9 || month == 11) {
                monthResult = "小月";
            }else{
                monthResult="大月";
            }
        }
        return monthResult;
    }
}

class InvalidYearException extends Exception{
    //    public InvalidYearException(){}
    public InvalidYearException(String msg){
        super(msg);
    }
}
class InvalidMonthException extends Exception{
    //    public InvalidYearException(){}
    public InvalidMonthException(String msg){
        super(msg);
    }
}
class InvalidDayException extends Exception{
    //    public InvalidYearException(){}
    public InvalidDayException(String msg){
        super(msg);
    }
}
