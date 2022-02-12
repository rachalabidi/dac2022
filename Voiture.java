package carrefour;

import java.awt.Color;
import java.util.ArrayList;

//import java.awt.Color;
public class Voiture extends Thread{
	private double x,y;
	int m=0,n=0;
	static ArrayList<Voiture> v = new ArrayList <Voiture>();

	Voiture(double x, double y){
		this.setX(x);
		this.setY(y);
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void move() {
		if(x==290) {
			y=y+0.000001;
		}else {
			if(y==215) {
				x=x+0.000001;
			}
		}
	}
	/*public void run() {
		while(true) {
			//move();
			
			
		
			if(x==290&&getY()<110&&testInterface.f.get(0).getClr().equals(Color.red)) {
				try {
					testInterface.sf1.acquire();
					testInterface.f1.acquire(1);

					//move();
					if(getY()<300&&getY()>100) {
						while(getY()<100) {
							move();
						}
					}testInterface.f1.release(1);
					testInterface.sf1.release();
					

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}else {
				if(y==215&&getX()<220&&testInterface.f.get(1).getClr().equals(Color.red)) {
					try {
						//move();
						testInterface.sf2.acquire();
						testInterface.f2.acquire(1);

						//move();
						if(getX()<400&&getX()>220) {
							while(getY()<220) {
								move();
							}
						}						testInterface.f2.release(1);

						testInterface.sf2.release();

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else {
					move();
				}
			}
		}
	}
	public void run() {
		while(true) {
					 if(x==290) {
						 move();
						 try {
							testInterface.MUTEX.acquire();
						} catch (InterruptedException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						} 
						 m++;
						 System.out.println("car++");
						 if(m>1) {
								testInterface.MUTEX.release();

						try {
							testInterface.sf1.acquire();
							 System.out.println("car ATT VOIE");
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}}
						 testInterface.MUTEX.release();
			//getY()<110&&
			 if(testInterface.f.get(0).getClr().equals(Color.red)) {
					try {
						//voie1.sf1.acquire();
						testInterface.f1.acquire();
						 System.out.println("car ATT FEU");

						//move();
						if(getY()<300&&getY()>100) {
							while(getY()<100) {
								move();
							}
						}testInterface.f1.release();
						 try {
								testInterface.MUTEX.acquire();
							} catch (InterruptedException e2) {
								// TODO Auto-generated catch block
								e2.printStackTrace();
							}
						m--;
						testInterface.MUTEX.release();

						testInterface.sf1.release();
						

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			}else{
				move();
			}
			 move();
	}else
		if(y==215){
			move();
			//y==215&&getX()<220&&
			 try {
					testInterface.MUTEXn.acquire();
				} catch (InterruptedException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			n++;
			 System.out.println("car++ V2");
			if(n>1) {
				testInterface.MUTEXn.release();
			try {
				testInterface.sf2.acquire();
				 System.out.println("car ATT V2");
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
			testInterface.MUTEXn.release();
			if(testInterface.f.get(1).getClr().equals(Color.red)) {
				try {
					//move();
					testInterface.f2.acquire();
					 System.out.println("car ATT FEU V2");

					//move();
					if(getX()<400&&getX()>220) {
						while(getY()<220) {
							move();
						}
					}testInterface.f2.release(1);
					 try {
							testInterface.MUTEXn.acquire();
						} catch (InterruptedException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
					n--;
					testInterface.MUTEXn.release();
                    testInterface.sf2.release(1);

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				move();
			}
		 move();

	}
}
}*/
	public void run() {
		while(true) {
			
			if(getY()<100&&testInterface.f.get(1).getClr().equals(Color.red)) {
				try {
					testInterface.sf1.acquire();
					testInterface.f1.acquire();

					move();
					if(getY()<260&&getY()>100) {
						while(getY()<260) {
							move();
						}
					}
					
					testInterface.f1.release();
					testInterface.sf1.release();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else  
				if(getX()<150&&testInterface.f.get(0).getClr().equals(Color.red)) {
					try {
						testInterface.sf2.acquire();
						testInterface.f2.acquire();

						move();
						if(getX()<350&&getX()>150) {
							while(getY()<350) {
								move();
							}
						}
						
						testInterface.f2.release();
						testInterface.sf2.release();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else {
					move();
				}
			
		}
	}

}
