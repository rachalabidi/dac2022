package carrefour;
import java.awt.Color;
public class Feu extends Thread{
	private Color clr;
	private int x,y;
	Feu(Color clr,int x ,int y){
		this.setClr(clr);
		this.setX(x);
		this.setY(y);
	}
	public Color getClr() {
		return clr;
	}
	public void setClr(Color clr) {
		this.clr = clr;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void run() {
	/*	while(true) {
			if(getClr()==Color.green) {
				try {
					testInterface.sf1.acquire();
					setClr(Color.red);
					testInterface.sf2.release();
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else if(getClr()==Color.red) {
				try {
					testInterface.sf2.acquire();
					setClr(Color.green);
					testInterface.sf1.release();
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	*
	*while(true) {
	

	

			try {
				
				sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(getClr()==Color.green) {
			
					//testInterface.f1.acquire();
					setClr(Color.red);
					testInterface.f2.signal();
					
				
			}else {
				
					setClr(Color.green);
					testInterface.f1.signal();
				
			}
		
	}*/
		
	while(true) {
			if(getClr()==Color.green) {
				try {
					testInterface.f1.acquire();
					setClr(Color.red);
					testInterface.f2.release();
					sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				try {
					testInterface.f2.acquire();
					setClr(Color.green);
					testInterface.f1.release();
					sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	
}
}
