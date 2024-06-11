import com.sun.tools.javac.Main;
import model.tick;
import model.Tama;
import view.mainFrame;

import java.awt.event.ActionEvent;

public class MainController {
    private mainFrame view;
    private Tama gochi;
    private tick tick;

    public MainController(){
        gochi = new Tama();
        Tama gochi = new Tama();
        view = new mainFrame(300, 400, "Alucard");
        tick = new tick(gochi, view);

        view.updateStats(gochi.getLove(),gochi.getHunger(),gochi.getSmell());
        view.addFeedButtonListener(this::feedTama);
        view.addPedButtonListener(this::petTama);
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
             newHunger = (100 - newHunger) + currentHunger + 30;
             gochi.setHunger(newHunger);
        } else {
            gochi.setHunger(newHunger);
        }
        view.updateHunger(gochi.getHunger());
        System.out.println("Update nach feed: " + gochi.getHunger());
    }
    private void petTama(ActionEvent e){
        int currentLove = gochi.getLove();
        gochi.setLove(currentLove + 30);
        System.out.println(gochi.getLove());
    }
    private void cleanTama(ActionEvent e){
        int currentSmell = gochi.getSmell();
        gochi.setSmell(currentSmell + 30);
        System.out.println(gochi.getSmell());
    }
}