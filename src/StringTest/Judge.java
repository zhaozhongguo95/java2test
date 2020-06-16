package StringTest;
/*
 *正则表达式
 *@Author zzg
 *@create 2020 06 03 12:07
 */

public class Judge {
    //匹配邮箱地址
    public static void main(String[] args) {
//        String regex = "\\w+ @\\W+ (\\.\\w{2,3})* \\.\\w{2,3}";
        String regex = "^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$";

        String str1 = "aaaa";
        String str2 ="as@123.com";
        String str3 = "123522@qq.dpg.com";
        if(str1.matches(regex)){
            System.out.println(str1+ "是一个合法邮箱地址格式");
        }else{
            System.out.println(str1+ "不是一个合法邮箱地址格式");
        }
        if(str2.matches(regex)){
            System.out.println(str2+ "是一个合法邮箱地址格式");
        }else{
            System.out.println(str2+ "不是一个合法邮箱地址格式");
        }
        if(str3.matches(regex)){
            System.out.println(str3+ "是一个合法邮箱地址格式");
        }else{
            System.out.println(str3+ "不是一个合法邮箱地址格式");
        }

    }

}
