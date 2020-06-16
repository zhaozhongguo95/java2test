package ClassTest;
/*
 *调用静态成员
 *@Author zzg
 *@create 2020 06 07 21:19
 */

public class StaticTest {
    final static double PI=3.1415;//类中定义静态常量
    static int id;//定义静态变量

    public static void method1() {
        //静态方法
    }
    public void method2(){//非静态方法
        System.out.println(StaticTest.PI);//调用静态常量
        System.out.println(StaticTest.id);//调用静态变量
        StaticTest.method1();//调用静态方法
    }
    /*
    1.静态方法中不可以使用this关键字
    2.静态方法中不可以直接调用非静态方法
    3.不能将方法体内的局部变量声明为static
     */
//    public static StaticTest method3(){//静态方法
//        method2(); //调用非静态方法
//        return this;
//    }

}
