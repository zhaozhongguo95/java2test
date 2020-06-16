package ClassTest;
/*
 *对象调用静态成员变量
 *@Author zzg
 *@create 2020 06 07 23:00
 */

public class AccessProperty {
     static int j = 47;//如果不是静态变量，结果大不相同

    public AccessProperty() {
    }

    public void call(){
        System.out.println("调用call()方法");
        for (int j = 0; j < 3; j++) {
            System.out.print(j+"");
            if(j==2){
                System.out.println("\n");
            }
        }
    }

    public static void main(String[] args){
        AccessProperty t1 = new AccessProperty();
        AccessProperty t2 = new AccessProperty();
        t2.j=60;//当j为静态变量，两个对象指向j内存的地址相同。因此t1.j=60
        System.out.println("第一个实例对象调用变量i的结果："+t1.j++);
        t1.call();
        System.out.println("第二个实例对象调用变量i的结果："+t2.j);
        t2.call();
    }
}
