package InheritanceTest;

/**
 * @author CrazyZ
 * @create 2020-06-15-16:25
 * 匿名内部类DEMO，将类的定义、方法的实现，对象的创建一气呵成
 * 匿名内部类对接口、抽象类、一般类都可以实现
 */
public class NoneNameClass {
    public static void main(String[] args) {
        RichMan r1 = new RichMan();
        r1.findlover(new WRB() {
            @Override
            public void white() {
                System.out.println("白啊");
            }
            @Override
            public void rich() {
                System.out.println("富啊");
            }
            @Override
            public void beautiful() {
                System.out.println("美啊");
            }
        });
    }
}
interface WRB{
    public void white();
    public void rich();
    public void beautiful();
}

class RichMan{
    public void findlover(WRB b){
        b.white();
        b.rich();
        b.beautiful();
    }

}
