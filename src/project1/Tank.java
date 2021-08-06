package project1;

import java.awt.*;

// 坦克类
public class Tank {

    private int x, y;
    private Dir dir = Dir.DOWN;
    private  static  final  int SPEED = 10;

    // 坦克静止
    private boolean moving = false;

    public Tank(int x,int y,Dir dir){

        super();
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    public Dir getDir() {
        return dir;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    public boolean isMoving() {
        return moving;
    }

    public void paint(Graphics g){

        g.fillRect(x,y,50,50);

        move();

    }

    public void move(){

        if(!moving) return; // 坦克静止 直接返回

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
