import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class UneFenetre extends JFrame implements ActionListener
{
    UnMobile sonMobile;
    private final int LARG=400, HAUT=250;
    JButton button = new JButton("test");

    public UneFenetre(String fenetre_mere)
    {
        // TODO
        // ajouter sonMobile a la fenetre
        // creer une thread laThread avec sonMobile
        // afficher la fenetre
        // lancer laThread

        setTitle("thread");
        setSize(400, 400);

        sonMobile = new UnMobile(LARG, HAUT);
        Thread laTache = new Thread(sonMobile);

        JFrame uneFenetre = new JFrame();
        uneFenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        uneFenetre.setSize(LARG,HAUT);
        uneFenetre.setVisible(true);
        uneFenetre.add(sonMobile);

        laTache.start();
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub

    }

    public static void main(String[] args){
        new UneFenetre ("Fenetre Mere");
    }

}
