package Creatures;

import Creatures.Creature;
import Creatures.State;
import Virus.Virus;

public class Creature {
    public Creature Creature;
    public State state;
    public Virus virus;
    public int day;
    public CreatureName creatureName;
    public Creature() {
        this.state = State.HEALTH;
        this.virus = new Virus();
        this.creatureName = null;
    }
    public Virus getVirus() {
        return virus;
    }
    public void setVirus(Virus virus) {
        this.virus = virus;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }
    public CreatureName getCreatureName() {
        return creatureName;
    }
    public void setCreatureName(CreatureName creatureName) {
        this.creatureName = creatureName;
    }
}
