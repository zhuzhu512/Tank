package project1;

import java.awt.*;

// 子弹类
public class Bullet {

    //子弹速度
    private static final int SPEED = 10;

    // 子弹大小 设置为不可变
    private static int WIDTH = 5, HEIGHT = 5;

    // 子弹位置
    private  int x,y;
    // 子弹方向
    private Dir dir;

    public Bullet(int x,int y,Dir dir){

        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public void paint(Graphics g){

        Color c = g.getColor(); // 保存当前画笔颜色
        g.setColor(Color.RED); // 将子弹设置为红色
        g.fillOval(x,y,WIDTH,HEIGHT); // 设置大小的矩形的内切圆作为子弹形状
        g.setColor(c); // 把画笔颜色设置回去

        move();
    }

    public void move(){

        // 子弹没有静止状态
        switch (dir){
            case LEFT:
                x -= SPEED;
                break;
            case UP:
                y -= SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            case DOWN:
                y += SPEED;
                break;

        }
    }
}
