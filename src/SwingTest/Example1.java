package SwingTest;

import javax.swing.*;
import java.awt.*;

/**
 * @author CrazyZ
 * @create 2020-06-11-17:35
 * JFrame窗体
 */
public class Example1 extends JFrame {
    public void CreateJFrame(String title){
        JFrame jf = new JFrame(title);
        Container container=jf.getContentPane();//获取一个容器
        JLabel jl =new JLabel("This is a JFrame");//创建一个JLabel标签
        //使标签上的文字居中
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        container.setBackground(Color.white);
        jf.setVisible(true);
        jf.setSize(500,400);
        //set the close style of frame
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Example1().CreateJFrame("Hello-world");
    }
}
