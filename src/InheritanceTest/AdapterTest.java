package InheritanceTest;
/**
 * @author CrazyZ
 * @create 2020-06-15-17:09
 * 通过抽象类实现不常用的接口方法，减少匿名内部的方法实现
 */
public class AdapterTest {
    public static void main(String[] args) {
        Button b1 = new Button();
        b1.addListener(new MouseAdapter() {
            public void onClick(){
                System.out.println("单击一下");
            }
            public  void onDBClick(){
                System.out.println("双击一下");
            }
        });
        b1.click();
        b1.dbClick();
        //方法链编程
        new Button().addListener(new MouseAdapter() {
            @Override
            public void onClick() {
                super.onClick();
                System.out.println("单击匿名Button");
            }
            public  void onDBClick(){
                System.out.println("双击匿名Button");
            }
        }).click()
          .dbClick();
    }
}
class Button{
    private MouseListener listener;
    public Button addListener(MouseListener listener){
        this.listener = listener;
        return this;
    }
    public Button click(){
        listener.onClick();
        return this;
    }
    public void dbClick(){
        listener.onDBClick();
    }
}
//鼠标监听器
interface MouseListener{
    public void onClick();
    public void onDBClick();
    public void rightClick();
}
//鼠标适配器
abstract class MouseAdapter implements MouseListener{
    public void rightClick(){}
    public void onClick(){}
    public void onDBClick(){}
}
