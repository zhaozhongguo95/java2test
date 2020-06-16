package SwingTest;

import javax.swing.*;
import java.awt.*;

/**
 * @author CrazyZ
 * @create 2020-06-11-19:32
 */
public class DrawIco implements Icon{
    private int width;
    private int height;
    public int getIconHeight(){
        return this.height;
    }
    public int getIconWidth(){
        return this.width;
    }
    public DrawIco(int width,int height){
        this.height=height;
        this.width=width;
    }
    //实现paintIcon()
    public void paintIcon(Component arg0, Graphics args1,int x,int y){
        DrawIco ico = new DrawIco(15,15);
        //创建一个标签，并设置标签上的文字在标签正中间
        JLabel jl  = new JLabel("测试",ico,SwingConstants.CENTER);
        JFrame jf = new JFrame();
        Container container = jf.getContentPane();
        //...
    }
}
