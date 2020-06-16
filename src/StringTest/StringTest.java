package StringTest;
/*
 *字符串练习
 *@Author zzg
 *@create 2020 06 03 11:25
 */

public class StringTest {

    public static void main(String[] args) {
        char a[] = {'W','e'};
        String s = new String(a);
        String str= s + " are students";
        int size1 = str.length();
        int size2 = str.indexOf("re");
        int size3 = str.lastIndexOf("dent");
        char mychart = str.charAt(5);
        String substring = str.substring(3);
        System.out.println(s);
        System.out.println(str);
        System.out.println(size1);
        System.out.println(size2);
        System.out.println(size3);
        System.out.println(mychart);
        System.out.println(substring);
    }
}
