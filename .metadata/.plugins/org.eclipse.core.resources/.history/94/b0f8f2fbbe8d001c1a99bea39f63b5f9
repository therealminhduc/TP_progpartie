import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class UnMobile extends JPanel implements Runnable, ActionListener
{
    int saLargeur, saHauteur, sonDebDessin;
    final int sonPas = 10, sonTemps=50, sonCote=40;

    String[] titresBoutons = {"On", "Off"};
    JButton[] boutons = new JButton[titresBoutons.length];
    JPanel panelSud = new JPanel ();

    UnMobile(int telleLargeur, int telleHauteur)
    {
        super();
        saLargeur = telleLargeur;
        saHauteur = telleHauteur;
        setSize(telleLargeur, telleHauteur);

        setLayout (new BorderLayout (10,10));

        for(int iTitre = 0; iTitre < titresBoutons.length; iTitre++) {
            boutons[iTitre] = new JButton(titresBoutons[iTitre]);
            boutons[iTitre].addActionListener(this);
            panelSud.add(boutons[iTitre]);
        }

        add(panelSud, BorderLayout.SOUTH);
        setBackground (new Color (128,128,128));

    }

    public void run()
    {
        for (sonDebDessin=0; sonDebDessin < saLargeur - sonPas; sonDebDessin += sonPas)
        {
            repaint();
            try{Thread.sleep(sonTemps);}
            catch (InterruptedException telleExcp)
            {telleExcp.printStackTrace();}
        }
        for(sonDebDessin=saLargeur; sonDebDessin < saLargeur + sonPas; sonDebDessin -= sonPas){
            repaint();
            try{Thread.sleep(sonTemps);}
            catch (InterruptedException telleExcp)
            {telleExcp.printStackTrace();}
        }
    }

    public void paintComponent(Graphics telCG)
    {
        super.paintComponent(telCG);
        telCG.fillRect(sonDebDessin, saHauteur/2, sonCote, sonCote);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}