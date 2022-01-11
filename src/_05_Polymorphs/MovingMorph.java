package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{

	
	int Xv;
	int Yv;
	
	public MovingMorph(int x, int y) {
		super(x, y);
		Xv = 1;
		Yv = 2;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, width, height);
	}

    @Override
    public void update() {
        x += Xv;
        y += Yv;
        
        if(x + width > 500 || x < 0) {
        	Xv *= -1;
        }
        if(y + height > 500 || y < 0) {
        	Yv *= -1;
        }
    }
	
}
