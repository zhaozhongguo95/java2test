package SwingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author CrazyZ
 * @create 2020-06-11-17:59
 * JDialog窗体
 */
class MyJDialog extends JDialog {
    public MyJDialog(MyFrame frame){
        //实例化一个JDialog类对象，指定对话框的父窗体、窗体标题和类型
        super(frame,"第一个JDialog窗体",true);
        Container container =getContentPane();//Create a container
        container.add(new JLabel("对话框"));
        setBounds(120,120,300,250);
    }
}
class MyFrame extends JFrame{
    public static void main(String args[]){
        new MyFrame("窗体");
    }
    public MyFrame(String title){
        JFrame jf = new JFrame(title);
        Container container = jf.getContentPane();
        container.setLayout(null);
        JLabel jl = new JLabel("This is a JFrame");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        JButton bl = new JButton("弹出对话框");
        bl.setBounds(10,10,100,21);
        bl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyJDialog(MyFrame.this).setVisible(true);
            }
        });
        container.add(bl);
        jf.setVisible(true);
        jf.setSize(500,450);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
