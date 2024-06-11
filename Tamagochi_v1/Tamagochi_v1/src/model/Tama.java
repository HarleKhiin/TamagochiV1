package model;

public class Tama {
    private int hunger;
    private int smell;
    private int love;

    private String[] animation;

    private boolean alive;

    public Tama() {
        hunger = 100;
        smell = 100;
        love = 100;
        alive = true;
    }
    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getSmell() {
        return smell;
    }

    public void setSmell(int smell) {
        this.smell = smell;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }
}
