package InheritanceTest;
/*
 *继承练习
 *@Author zzg
 *@create 2020 06 08 23:36
 */

public class Test2 extends Test {
    public Test2(){
        super();//构造父类构造方法
        super.doSomething();//调用父类成员方法
    }
    public void doSomthingnew(){//新方法

    }
    public void doSomething(){//重写父类方法

    }
    protected Test2 dolt(){//重写父类方法，方法返回值类型为Test2类型
        return new Test2();
    }
}
