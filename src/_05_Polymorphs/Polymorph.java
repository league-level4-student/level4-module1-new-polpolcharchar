package _05_Polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    int x;
    int y;
    
    int width;
    int height;
    
    
    public Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
   	 
   	 width = 200;
   	 height = 200;
    }
    
    public abstract void update();
    
    public abstract void draw(Graphics g);
    
    public int getX() {
    	return x;
    }
    public int getY() {
    	return y;
    }
    public void setX(int x_) {
    	x = x_;
    }
    public void setY(int y_) {
    	y = y_;
    }
    public int getWidth() {
    	return width;
    }
    public int getHeight() {
    	return height;
    }
    public void setWidth(int w_) {
    	width = w_;
    }
    public void setHeight(int h_) {
    	height = h_;
    }
    
}
