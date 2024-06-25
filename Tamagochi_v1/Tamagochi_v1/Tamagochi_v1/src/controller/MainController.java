package controller;

import model.Tama;
import view.mainFrame;
import model.Sprites;

import java.awt.event.ActionEvent;

public class MainController {
    private mainFrame view;
    private Tama gochi;
    private tick tick;
    private Sprites sprites;

    public MainController(){
        gochi = new Tama();
        sprites = new Sprites();
        view = new mainFrame(300, 400, "Alucard");
        view.updateMainImage(sprites.getOk());
        tick = new tick(gochi, view);

        view.updateStats(gochi.getLove(),gochi.getHunger(),gochi.getSmell());
        view.addFeedButtonListener(this::feedTama);
        view.addPetButtonListener(this::petTama);
        view.addCleanButtonListener(this::cleanTama);
    }

    public static void main(String[] args) {
        MainController TamagochiApp = new MainController();
    }

    //Actions
    private void feedTama(ActionEvent e){
        int currentHunger = gochi.getHunger();
        int newHunger = currentHunger + 30;
        if( newHunger > 100 ) {
             newHunger = currentHunger + (100 - currentHunger);
             gochi.setHunger(newHunger);
        } else {
            gochi.setHunger(newHunger);
        }
        view.updateHunger(gochi.getHunger());
        System.out.println("Update nach feed: " + gochi.getHunger());
    }
    private void petTama(ActionEvent e){
        int currentLove = gochi.getLove();
        int newLove = currentLove + 30;
        if( newLove > 100 ) {
            newLove = currentLove + (100 - currentLove);
            gochi.setLove(newLove);
        } else {
            gochi.setLove(newLove);
        }
        view.updateLove(gochi.getLove());
        System.out.println("Update nach Love: " + gochi.getLove());
    }
    private void cleanTama(ActionEvent e){
        int currentSmell = gochi.getSmell();
        int newSmell = currentSmell + 30;
        if( newSmell > 100 ) {
            newSmell = currentSmell + (100 - currentSmell);
            gochi.setSmell(newSmell);
        } else {
            gochi.setSmell(newSmell);
        }
        view.updateSmell(newSmell);
        System.out.println("Update nach Clean: " + gochi.getSmell());
    }
}