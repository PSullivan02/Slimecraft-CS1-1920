package slimecraft;

import java.awt.Color;
import java.awt.Graphics;

public class Virus extends Sprite{
    
    private static final Color COLOR = new Color(0, 255, 0);
    private static final int WIDTH = 5;
    private static final int HEIGHT = 5;
    private static final int SPEED = 0;
    
    public Virus(int x, int y) {
        super(SPEED, x, y, WIDTH, HEIGHT, COLOR);
    }
    public void draw(Graphics g) {
        g.setColor(super.getColor());
        g.drawOval(super.getX(), super.getY(), super.getWidth(), super.getHeight());
    }
}
