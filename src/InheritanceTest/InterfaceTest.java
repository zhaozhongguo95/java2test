package InheritanceTest;

/**
 * @author CrazyZ
 * @create 2020-06-15-12:01
 */
public class InterfaceTest {
    public static void main(String[] args) {
        TuHao t1 = new TuHao();
        t1.money();
        WomenStar w1 = new WomenStar();
        t1.marry(w1);
        KoreanMan k1 = new KoreanMan();
        t1.marry(k1);
    }
}
interface Asset{
    public void money();
}
interface White{
    public void white();
}
interface Beautiful{
    public void beautiful();
}
class TuHao implements Asset{
    public void marry(White w){
        w.white();
    }
    public void money(){
        System.out.println("有钱");
    }
}

class WomenStar implements White,Beautiful{
    public void white(){
        System.out.println("超白");
    }
    public void beautiful(){
        System.out.println("漂亮");
    }
}
class KoreanMan implements White{
    public void white(){
        System.out.println("白面小生");
    }
}
