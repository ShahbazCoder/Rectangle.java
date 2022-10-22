import java.io.*;
import java.util.*;

class Driver{
	public static void main (String[] args)throws IOException {
		Scanner sc = new Scanner (new File("input.txt"));
		
		//Or
		//File file = new File("input.txt");
		//Scanner sc=new Scanner(file);
		
		double height = sc.nextDouble();
		double width = sc.nextDouble();
		
		Rectangle rec = new Rectangle(height, width);
		
		System.out.println (rec);
		System.out.println ("Area of Rectanlge is = " + rec.getArea());
		
		height = sc.nextDouble();
		width = sc.nextDouble();
		double depth=sc.nextDouble();
		Cuboid cu=new Cuboid(height,width,depth);
		System.out.println (cu);
		System.out.println ("Surface Area : "+cu.getArea());
		
   }
}