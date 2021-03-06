import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class UneFenetre extends JFrame implements ActionListener
{
	static int LARG=500;
	private final int HAUT=250;
	
	UnMobile sonMobile1;
	UnMobile sonMobile2 ;
	
	JButton sonBouton1;
	JButton sonBouton2;
	
	//JPanel panelEast = new JPanel ();
	
	Thread laTache1;
	Thread laTache2;
	
	Boolean state = true;

    public UneFenetre()
    { 
        // TODO 
        
        // ajouter sonMobile a la fenetre
        // creer une thread laThread avec sonMobile
        // afficher la fenetre
        // lancer laThread 
       
        laTache1 = new Thread (sonMobile1);
        laTache1.start();
        
        laTache2 = new Thread (sonMobile2);
        laTache2.start();
        
        Container leConteneur = getContentPane();
    	leConteneur.setLayout(new GridLayout(2,2));
    	leConteneur.setSize(1000, 500);
    	leConteneur.setVisible(true);
    	
        sonMobile1 = new UnMobile(LARG,HAUT);
        sonBouton1 = new JButton("ON/OFF");
        sonBouton1.addActionListener(this);
        leConteneur.add(sonBouton1);
        leConteneur.add(sonMobile1);
        
        sonMobile2 = new UnMobile(LARG,HAUT);
        sonBouton2 = new JButton("ON/OFF");
        sonBouton2.addActionListener(this);
        leConteneur.add(sonBouton2);
        leConteneur.add(sonMobile2);

        /*
        setContentPane (sonMobile1);
        
        setBackground (new Color (230,128,255));
        sonMobile1.setBackground (new Color (255,255,255));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500); setVisible(true); setLocation(200,300);
        
        System.out.println("oui");
        setLayout (new BorderLayout (10,10));

        panelEast.add(sonBouton1);    

        add(panelEast, BorderLayout.SOUTH);
        setBackground (new Color (128,128,128));*/
    }
        
        public void actionPerformed (ActionEvent e){ // (3)
        	
            if (e.getSource () == sonBouton1) {
                if(state == true) {
                    laTache1.suspend();
                    System.out.println("OFF");
                    state = false;
                }
                
                else {
                    laTache1.resume();
                    System.out.println("ON");
                    state = true;
                }
            }
            
            if (e.getSource () == sonBouton2) {
                if(state == true) {
                    laTache2.suspend();
                    System.out.println("OFF");
                    state = false;
                }
                
                else {
                    laTache2.resume();
                    System.out.println("ON");
                    state = true;
                }
            }
        }
        
        public static void main(String[] args){
            new UneFenetre ();
        }
    }