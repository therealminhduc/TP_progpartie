import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class UnMobile extends JPanel implements Runnable
{
    int saLargeur, saHauteur, sonDebDessin;
    final int sonPas = 10, sonTemps=50, sonCote=40;
    JPanel panelSud = new JPanel ();

    UnMobile(int telleLargeur, int telleHauteur)
    {
        super();
        saLargeur = telleLargeur;
        saHauteur = telleHauteur;
        setSize(telleLargeur, telleHauteur);    
    }

    public void run()
    {
    	for(int i=0; i<3; i++){
    		for (sonDebDessin=0; sonDebDessin < (UneFenetre.LARG-sonCote) - sonPas; sonDebDessin+= sonPas)
	        {
	            repaint();
	            try{Thread.sleep(sonTemps);}
	            catch (InterruptedException telleExcp)
	            {telleExcp.printStackTrace();}
	        }
	        for(sonDebDessin=UneFenetre.LARG - sonCote; sonDebDessin > 0; sonDebDessin-= sonPas){
	            repaint();
	            try{Thread.sleep(sonTemps);}
	            catch (InterruptedException telleExcp)
	            {telleExcp.printStackTrace();}
	        }
	    }	
    }

    public void paintComponent(Graphics telCG)
    {
        super.paintComponent(telCG);
        telCG.fillRect(sonDebDessin, saHauteur/2, sonCote, sonCote);
    }
    
}