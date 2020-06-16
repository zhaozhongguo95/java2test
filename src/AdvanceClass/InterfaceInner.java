package AdvanceClass;

/**
 * @author CrazyZ
 * @create 2020-06-11-11:55
 * 内部类的基本用法，只留一个外部类和一个接口，隐藏了内部类的实现细节
 */

interface  OutInterface{
    public void f();
}
public class InterfaceInner {
    public static void main(String[] args) {
        OuterClass2 out = new OuterClass2();
        OutInterface outinter = out.doit();
        outinter.f();
    }
}
class OuterClass2{
    public OuterClass2() {
    }

    private  class  InnerClass implements  OutInterface{//内部类
        public void f(){//实现接口中的f()方法
            System.out.println("访问内部类中的f()方法");
        }
        InnerClass(String s){//内部类构造方法
            System.out.println(s);
        }
    }
    public OutInterface doit(){//定义一个方法，返回值类型为OutInterface接口
        return new InnerClass("访问内部类构造方法");
    }
}



