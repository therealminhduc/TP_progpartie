/**
 * 
 */
import java.io.*;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.BufferedReader;
import java.lang.String;

public class Affichage extends Thread{
	
	//exercice 1 : synchronized / exclusion mutuelle
	//exclusionMutuelle doit etre static car a chaque instanciation, 1 nouveau objet de type Exclusion est cree
	//static Exclusion exclusionMutuelle = new Exclusion ();
	
	//exercice 2 : semaphoreBinaire
	//si la valeur = 0, on est bloque a syncWait donc faut absolument commencer par 1
	static semaphoreBinaire sem = new semaphoreBinaire (1);
	
	String texte; 
	
	public Affichage (String txt){texte=txt;}
	
	public void run(){
		//exercice 1 : synchronized
		//synchronized (exclusionMutuelle) {
			
			//exerice 2 : semaphoreBinaire (methode wait() et signal())
			sem.syncWait();
			
			//section critique 
			for (int i=0; i<texte.length(); i++){
			    //ressource critique 
				System.out.print(texte.charAt(i));
			    try {sleep(100);} catch(InterruptedException e){};
			}
			
			sem.syncSignal();
		}
	}
//}
