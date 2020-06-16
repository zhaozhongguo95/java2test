package InheritanceTest;

/**
 * @author CrazyZ
 * @create 2020-06-15-15:33
 * 多态demo
 */
public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Benz();
        System.out.println(c1.getColor());
    }
}
class Car{
    private String color = "white";
    public  String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
}

class Benz extends Car{
    private String color="black";
    public  String getColor(){
        return super.getColor();//返回父类的颜色
    }
    public void setColor(String color){
        super.setColor(color);
    }
}