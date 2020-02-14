package slimecraft;

import java.awt.Color;
import java.awt.Graphics;

public class Slime extends Sprite {
    
    private static final int WIDTH = 10;
    private static final int HEIGHT = 15;
    private int strength;
    private boolean isInfected = false;
    
    
    public Slime(int speed, int x, int y, Color color) {
        super(speed, x, y, WIDTH, HEIGHT, color);
        this.strength = (int) (Math.random() * 20);
    }
    
    public void eat(Food food) {
        if (super.collide(food)) {
            super.setHeight(super.getHeight() + 5);
            super.setWidth(super.getWidth() + 5);
            food.die();
        }
    }
    public void getInfected(Virus virus){
        if(super.collide(virus)){
            isInfected = true;
            this.strength -= 1.4;
            virus.die();
        }
    }
    public void didWin(Slime other) {
        this.strength += this.strength - other.strength;
        super.grow(1.2);
    }
    
    @Override
    public void draw(Graphics g) {
        g.setColor(super.getColor());
        if(this.isInfected == true){
            g.setColor(Color.green);
        }
        g.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
        
    }

    public int getStrength() {
        return strength;
    }
    
}
