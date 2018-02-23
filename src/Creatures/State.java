package Creatures;

public enum State {
    HEALTH("Health"),
    INFECTED("Infected"),
    SICK("Sick"),
    CONTAGIOUS("Contagious"),
    RECOVERING("Recovering"),
    Dead("Dead");
    private String state;
    State(String state){
        this.state = state;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
}
