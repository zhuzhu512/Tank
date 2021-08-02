package project1;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {

    public static void main(String[] args) throws InterruptedException { // sleep()有可能抛异常

//        // new一个窗口
//        Frame f = new Frame();
//        // 设置窗口大小
//        f.setSize(800,600); // 宽/长：800，高/宽：600
//        // 设置是否能改变窗口大小
//        f.setResizable(false); // 窗口大小固定
//        // 设置标题栏文字
//        f.setTitle("tank war");
//        // 让窗口显示出来
//        f.setVisible(true); // 设置可见
//
//        // 之前无法点击窗口上的“x“关闭窗口
//        // 添加窗口监听器 监听windowClosing 点击窗口上的“x“时关闭窗口
//        f.addWindowListener(new WindowAdapter(){ // 匿名类
//            @Override
//            public void windowClosing(WindowEvent e){
//
//                System.exit(0);
//            }
//        });

        // -------------------分割线-----------------

        TankFrame tf = new TankFrame();

        // 设置成自动不断变化
        while(true){

            Thread.sleep(50); // 休息50ms
            tf.repaint(); // 每隔50ms窗口就重画一次，每重画一次就调用一次paint()方法
        }

    }
}
