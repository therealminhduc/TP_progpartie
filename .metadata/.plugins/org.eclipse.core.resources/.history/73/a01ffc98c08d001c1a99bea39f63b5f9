import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class UneFenetre extends JFrame implements ActionListener
{
	UnMobile sonMobile;
	UnMobile sonMobile2 ;
	static int LARG=500;
	private final int HAUT=250;
	JButton boutonstop = new JButton("ON / OFF");
	JPanel panelEast = new JPanel ();
	Thread laTache;
	Boolean state = true;

    public UneFenetre()
    { 
        // TODO 
        
        // ajouter sonMobile a la fenetre
        // creer une thread laThread avec sonMobile
        // afficher la fenetre
        // lancer laThread 
    	
        sonMobile = new UnMobile(LARG,HAUT);
    
        laTache = new Thread (sonMobile);
        laTache.start();

        
        setContentPane (sonMobile);
        
        setBackground (new Color (230,128,255));
        sonMobile.setBackground (new Color (255,255,255));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500); setVisible(true); setLocation(200,300);
        
        System.out.println("oui");
        setLayout (new BorderLayout (10,10));


        boutonstop.addActionListener(this);
        panelEast.add(boutonstop);    

        add(panelEast, BorderLayout.SOUTH);
        setBackground (new Color (128,128,128));
    }
        
        public void actionPerformed (ActionEvent e){ // (3)
        	
            if (e.getSource () == boutonstop) {
                if(state == true) {
                    laTache.suspend();
                    System.out.println("OFF");
                    state = false;
                }
                
                else {
                    laTache.resume();
                    System.out.println("ON");
                    state = true;
                }
            }
        }
        
        public static void main(String[] args){
            new UneFenetre ();
        }
    }