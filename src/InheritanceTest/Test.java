package InheritanceTest;
/*
 *继承练习
 *@Author zzg
 *@create 2020 06 08 23:31
 */

public class Test {
    public Test(){

    }
    protected void doSomething(){

    }
    protected Test dolt(){//方法返回值类型为Test类型
        return new Test();
    }
}
