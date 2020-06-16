package InheritanceTest;

/**
 * @author CrazyZ
 * @create 2020-06-15-12:26
 */
public class InterfaceTest2 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Camera ca = new Camera();
        Fan f = new Fan();
        Mp3 m = new Mp3();
        computer.insert(f);
        computer.insert(ca);
        computer.insert(m);

    }
}
class Computer{
    public void insert(USB usb){
        System.out.println("USB准备就绪");
        usb.player();
    }
}
interface USB{
    public void player();
}
class Fan implements USB{
    public void player(){
        System.out.println("呼呼呼呼");
    }
}
class Camera implements USB{
    public void player(){
        System.out.println("咔擦咔擦");
    }
}
class Mp3 implements USB{
    public void player(){
        System.out.println("滴答滴答");
    }
}

