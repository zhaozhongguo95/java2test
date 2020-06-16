package InheritanceTest;

/**
 * @author CrazyZ
 * @create 2020-06-15-13:34
 */
public class InterfaceTest3 {
    public static void main(String[] args) {
        RichMans rm = new RichMans();
        Jing8 j8 = new Jing8();
        Eater e1 = new Eater();
        rm.buy(j8);
        rm.feed(j8);
        e1.eat(j8);

    }
}
interface Eatable{
    public void eat();
}
interface  Pet{
    public void meng();
}
class Eater{
    public void eat(Eatable ea){
        System.out.println("尝起来，味道不错");
    }
}
abstract class Animal{
    abstract public void bar();
}
class Dog extends Animal{
    public void bar(){
        System.out.println("汪汪");
    }
}
class Jing8 extends Dog implements Eatable,Pet{
    public void eat(){
        System.out.println("好吃！汪汪");
    }
    public void meng(){
        System.out.println("撒娇卖萌");
    }
}
class RichMans {
    public void buy(Pet p){
        System.out.println("今天我买了一个宠物");
        p.meng();
    }
    public void feed(Eatable e){
        System.out.println("給宠物喂食");
        e.eat();
    }
}
