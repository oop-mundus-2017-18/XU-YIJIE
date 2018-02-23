package World;

import Creatures.Creature;

public class Point {
    private Creature creature;
    private int x;
    private int y;
    public Point(Creature creature, int x,int y) {
        this.creature = creature;
        this.x = x;
        this.y = y;
    }
    public Creature getCreature() {
        return creature;
    }
    public void setCreature(Creature c) {
        creature = c;
    }
    public void removeCreature() {
        creature = null;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
