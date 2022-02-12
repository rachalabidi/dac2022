 package carrefour;


 import java.awt.Color;
 import java.awt.Graphics;
 import java.awt.Image;
 import java.io.File; 
 import java.io.IOException;
 import java.util.ArrayList;

 import javax.imageio.ImageIO;
 import javax.swing.JPanel;
 public class put extends JPanel {
 ArrayList<Feu> af=new ArrayList<Feu>();	
 ArrayList<Voiture> av=new ArrayList<Voiture>();	
 private static final long serialVersionUID = 1L;

 	public void paintComponent(Graphics g)
 	  {    try { 
 		  Image imgf1=ImageIO.read(new File("ressources\\feu.png"));
 		  Image imgf2=ImageIO.read(new File("ressources\\green.png"));
 		  Image imgf3=ImageIO.read(new File("ressources\\red.png"));
 		 Image imgf=ImageIO.read(new File("ressources\\feuV.png"));
		  Image imgf2V=ImageIO.read(new File("ressources\\greenV.png"));
		  Image imgf3V=ImageIO.read(new File("ressources\\redV.png"));
 		  Image img = ImageIO.read(new File("ressources\\route.jpg"));
 		 Image imgV = ImageIO.read(new File("ressources\\voiture.png"));
 		 Image imgVG = ImageIO.read(new File("ressources\\bus2.png"));
 		  
 	 
 	g.drawImage(img, 0, 0, this.getWidth(),this.getHeight(),this);  
 	  for(int i=0;i<af.size();i++) {
 	 if(af.get(i).getX()==400) { 
 	  g.drawImage(imgf1,af.get(i).getX(),af.get(i).getY(),30,30,this);
 	  if(af.get(i).getClr()==Color.green) {
 		  g.drawImage(imgf2,af.get(i).getX(),af.get(i).getY(),30,30,this);
 	  }else  if(af.get(i).getClr()==Color.red) {
 		  g.drawImage(imgf3,af.get(i).getX(),af.get(i).getY(),30,30,this);
 	  }
 	  }else {
 		   
 	 	 
 	 	  g.drawImage(imgf,af.get(i).getX(),af.get(i).getY(),30,30,this);
 	 	  if(af.get(i).getClr()==Color.green) {
 	 		  g.drawImage(imgf2V,af.get(i).getX(),af.get(i).getY(),30,30,this);
 	 	  }else  if(af.get(i).getClr()==Color.red) {
 	 		  g.drawImage(imgf3V,af.get(i).getX(),af.get(i).getY(),30,30,this);
 	 	  }
 	 	  }

 	  }
 	  for(int i=0;i<av.size();i++) {
 		// g.setColor(Color.black);
 		 
 		// g.fillRect((int)av.get(i).getX(),(int) av.get(i).getY(), 25, 25);
 		 if(av.get(i).getY()==215) { //140
 	 		  g.drawImage(imgVG,(int)av.get(i).getX(),(int)av.get(i).getY(),80,25,this);
 	 	  }if(av.get(i).getX()== 290) { //330  110
 	 		  g.drawImage(imgV,(int)av.get(i).getX(),(int)av.get(i).getY(),30,60,this);
 	 	  }
 		 }
 	  }
 	  
 	  catch (IOException e) {      e.printStackTrace();   
 	  }}
 	void setaf(ArrayList<Feu> f) {
 		af=f;
 	}
 	void setav(ArrayList<Voiture> v) {
 		av=v;
 	}
 }
