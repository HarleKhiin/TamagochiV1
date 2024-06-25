package model;

import javax.swing.*;
import java.awt.*;

public class Sprites {
    private final ImageIcon pusheen_ok,pusheen_hungry,tear_icon,poop_icon;

    public Sprites() {

        String ok_path = "/Sprites/pusheen_ok.gif";
        String hungry_path = "C:\\JAVA\\IntelliJ Projects\\Tamagochi_v1\\Tamagochi_v1\\src\\Sprites\\pusheen_hungry.gif";
        String tear_path = "C:\\JAVA\\IntelliJ Projects\\Tamagochi_v1\\Tamagochi_v1\\src\\Sprites\\tears.gif";
        String poop_path = "C:\\JAVA\\IntelliJ Projects\\Tamagochi_v1\\Tamagochi_v1\\src\\Sprites\\tears.gif";

        this.pusheen_ok = new ImageIcon("/Sprites/pusheen_ok.gif");
        this.pusheen_hungry = new ImageIcon(hungry_path);
        this.tear_icon = new ImageIcon(tear_path);
        this.poop_icon = new ImageIcon(poop_path);
    }

    public ImageIcon getOk() {
        System.out.println("getOK initialized: " + this.pusheen_ok);
        return this.pusheen_ok; }
    public ImageIcon getHungry() { return this.pusheen_hungry; }
    public ImageIcon getSad() { return this.tear_icon; }
    public ImageIcon getPoop() { return this.poop_icon; }
}
