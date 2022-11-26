//Write a program to find the Quadrants in which coordinates lie.
import java.util.*;
class Qudrant{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.println("Enter coordinates:");
		x=sc.nextInt();
		y=sc.nextInt();
		if(x>0 && y>0){
			System.out.println("This ("+x+","+y+") point lies in First quadrant.");
		}
		else if(x<0 && y>0){
			System.out.println("This ("+x+","+y+")  point lies in Second quadrant.");
		}
		else if(x<0 && y<0){
			System.out.println("This ("+x+","+y+")  point lies in Third quadrant.");
		}
		else if(x>0 && y<0){
			System.out.println("This ("+x+","+y+")  point lies in Fourth quadrant.");
		}
	}
}