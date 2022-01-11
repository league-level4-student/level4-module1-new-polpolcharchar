package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class RedPolymorph extends Polymorph{

	public RedPolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.drawRect(x, y, width, height);
	}

    @Override
    public void update() {
        
    }
	
}
