package controller;

import java.util.Timer;
import java.util.TimerTask;

import model.Tama;
import view.mainFrame;
import model.Sprites;


public class tick {
    private Tama gachi;
    private mainFrame view;
    private Sprites sprites;

    //set up the Timer stuff
    // schedule in Constructor
    public tick(Tama gachi, mainFrame view) {
        this.gachi = gachi;
        this.view = view;
        //this.sprites = sprites;

        Timer timer = new Timer();
        TimerTask tickTask = new TimerTask() {
            @Override
            public void run() {
                gachi.setHunger(decay(gachi.getHunger()));
                gachi.setLove(decay(gachi.getLove()));
                gachi.setSmell(decay(gachi.getSmell()));

                //ausgabe an view
                int currentHunger = gachi.getHunger();
                int currentLove = gachi.getLove();
                int currentSmell = gachi.getSmell();
                view.updateStats(currentLove, currentHunger, currentSmell);

                //ausgabe
                System.out.println("Dein Tamagochi: ");
                System.out.println("Hunger: " + gachi.getHunger());
                System.out.println("Liebe: " + gachi.getLove());
                System.out.println("Geruch: " + gachi.getSmell());

            }
        }; // end of tickTask

        // run task repeatedly
        long tickInterval = 1000; // in milliseconds{
        timer.scheduleAtFixedRate(tickTask,1000,tickInterval);
    }
    public int decay(int toDecay) {
        int decay = (int)(Math.random()*10);
        if(decay > 5) {
            return toDecay - 10;
        } else {
            return toDecay;
        }
    }
    public void spritesCheck(){
        int smell = gachi.getSmell();
        int hunger = gachi.getHunger();
        int love = gachi.getLove();

        if(hunger > 30) {
            view.updateMainImage(sprites.getOk());
        }
    }
} // end of tick Class

