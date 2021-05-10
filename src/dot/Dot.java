/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dot;
import java.lang.Math;
/**
 *
 * @author admin
 */
public class Dot {
        double x;
	double y;
	
	public Dot(double x, double y){
		this.x = x;
		this.y = y;
	}
        
        public double distanceto(Dot dot) {
		double dis = Math.pow(this.x - dot.x, 2) + Math.pow(this.y - dot.y, 2);
		dis = Math.sqrt(dis);
		return dis;
	}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dot tacka = new Dot(7.65,3.42);
        System.out.println(tacka.x);
    }
    
}
