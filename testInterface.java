package carrefour;

import java.awt.Color;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

import javax.swing.JFrame;

public class testInterface {
	static Semaphore sf1=new Semaphore(1);
	static Semaphore sf2=new Semaphore(1);
	static Semaphore f1=new Semaphore(0);
	static Semaphore f2=new Semaphore(1);
	static ArrayList<Feu> f = new ArrayList <Feu>();
	static ArrayList<Voiture> v = new ArrayList <Voiture>();
		public static void main(String[] args) {
			Feu f1 = new Feu(Color.green,200,300);
			Feu f2 = new Feu(Color.red,400,120);
			put j=new put();
			f.add(f1);
			f.add(f2);
			j.setaf(f);
			Voiture v1=new Voiture(290,50);
			Voiture v2=new Voiture(70,215);
			Voiture v3=new Voiture(290,-70);
			Voiture v4=new Voiture(-240,215);
			Voiture v5=new Voiture(290,-220);
			Voiture v6=new Voiture(-350,215);
			Voiture v7=new Voiture(290,-340);
			Voiture v8=new Voiture(-600,215);
			v.add(v1);
			v.add(v2);
			v.add(v3);
			v.add(v4);
			v.add(v5);
			v.add(v6);
			v.add(v7);
			v.add(v8);
			j.setav(v);
			j.repaint();
			JFrame Fenetre =new JFrame();
			Fenetre.setSize(600,429);
			Fenetre.setResizable(false);
			Fenetre.add(j);
			Fenetre.setVisible(true);
			for(int i=0;i<f.size();i++)
			{
				f.get(i).start();
			}
			for(int i=0;i<v.size();i++)
			{
				v.get(i).start();
			}
			while(true) {
			j.repaint();
			}
		}
	}

