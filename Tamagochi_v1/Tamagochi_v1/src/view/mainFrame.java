package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

import static java.awt.GridBagConstraints.PAGE_START;

public class mainFrame extends JFrame {

    private JButton feed,pet,clean;
    private JProgressBar hungerBar,loveBar,smellBar;
    private JLabel imgContainer;
    private JLabel petName;
    private ImageIcon sprite;

    private int love,hunger,smell;

    public mainFrame(int width, int height, String _petName){
        /*
        //init Stats
        love = 100;
        hunger = 100;
        smell = 100;
        */


        setTitle(_petName);
        setLayout(new GridBagLayout());
        setSize(width, height);

        GridBagConstraints gbc = new GridBagConstraints();
        //add Label
        petName = new JLabel(_petName);
        gbc.gridx = 1;
        gbc.gridy = 0;
        //gbc.anchor = PAGE_START;
        gbc.insets = new Insets(10, 10, 10, 10);
        add(petName, gbc);

        //add ImageContainer
        sprite = new ImageIcon("C:\\JAVA\\IntelliJ Projects\\Tamagochi_v1\\Tamagochi_v1\\src\\view\\sprite.png");
        //rescaleImage
        Image originalSprite = sprite.getImage();
        int scaleHeight = (int)(this.getHeight()/2);
        int scaleWidth = (int)(this.getWidth()/2);
        Image resizedSprite = originalSprite.getScaledInstance(scaleWidth, scaleHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledSprite = new ImageIcon(resizedSprite);
        imgContainer = new JLabel(scaledSprite);

        gbc.gridx = 1;
        gbc.gridy = 1;
        //gbc.anchor = PAGE_START;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(10, 10, 10, 10);
        add(imgContainer, gbc);

        //add progressBars
        loveBar = new JProgressBar(0, 100);
        hungerBar = new JProgressBar(0, 100);
        smellBar = new JProgressBar(0, 100);

        // Initialize progress bars
        loveBar.setValue(love);
        hungerBar.setValue(hunger);
        smellBar.setValue(smell);

        gbc.gridy = 6;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.WEST;

        gbc.gridx = 0;
        add(new Label("Hunger: "), gbc);
        gbc.gridx = 1;
        add(hungerBar, gbc);

        gbc.gridy = 7;
        gbc.gridx = 0;
        add(new Label("Happieness: "), gbc);
        gbc.gridx = 1;
        add(loveBar, gbc);

        gbc.gridy = 8;
        gbc.gridx = 0;
        add(new Label("Smell: "), gbc);
        gbc.gridx = 1;
        add(smellBar, gbc);

        //Buttons
        gbc.gridy = 9;
        gbc.gridx = 0;
        feed = new JButton("Feed");
        add(feed, gbc);

        gbc.gridx = 1;
        pet = new JButton("Pet");
        add(pet, gbc);

        gbc.gridx = 2;
        clean = new JButton("Clean");
        add(clean, gbc);


        //final Setup for the mainFrame
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    } // Ende des Konstrutors

    //Update View

    public void updateStats(int love, int hunger, int smell) {
        this.love = love;
        this.hunger = hunger;
        this.smell = smell;

        loveBar.setValue(love);
        hungerBar.setValue(hunger);
        smellBar.setValue(smell);
    }
    public void updateHunger(int hunger) {
        this.hunger = hunger;
        hungerBar.setValue(hunger);
    }
    public void updateLove(int love) {
        this.love = love;
        loveBar.setValue(love);
    }
    public void updateSmell(int smell) {
        this.smell = smell;
        smellBar.setValue(smell);
    }
    public void addFeedButtonListener(ActionListener listener) {
        feed.addActionListener(listener);
    }
    public void addPedButtonListener(ActionListener listener){
        pet.addActionListener(listener);
    }
    public void addCleanButtonListener(ActionListener listener){
        clean.addActionListener(listener);
    }

}


/*
// Create the layered pane
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(400, 300));

        // Load images
        ImageIcon image1 = new ImageIcon("path/to/image1.png");
        ImageIcon image2 = new ImageIcon("path/to/image2.png");

        // Create JLabels to hold the images
        JLabel imageLabel1 = new JLabel(image1);
        JLabel imageLabel2 = new JLabel(image2);

        // Set bounds for the image containers
        imageLabel1.setBounds(0, 0, image1.getIconWidth(), image1.getIconHeight());
        imageLabel2.setBounds(0, 0, image2.getIconWidth(), image2.getIconHeight());

        // Set z-order for the image containers
        layeredPane.setLayer(imageLabel1, JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(imageLabel2, JLayeredPane.PALETTE_LAYER);

        // Add image containers to the layered pane
        layeredPane.add(imageLabel1);
        layeredPane.add(imageLabel2);
*/
