package slimecraft;

import java.awt.Color;

public class Blob extends Slime {
    private static final int SPEED = 5;
    private static final Color COLOR = Color.BLUE;
        
    public Blob(int x, int y) {
        super(SPEED, x, y, COLOR);
    }  
    
    public void fight(Glob glob) {
        if (super.collide(glob)) {
            if (super.getStrength() >= glob.getStrength()) {
                this.didWin(glob);
                glob.die();
            } else {
                glob.didWin(this);
                this.die();
            }
        }
    }
    public Blob reproduce(Blob mate) {
        int newX = super.getX() + (int) (Math.random() * 10 - 5);
        int newY = super.getY() + (int) (Math.random() * 10 - 5);
        Blob baby = new Blob(newX, newY);
        return baby;
    }
}
