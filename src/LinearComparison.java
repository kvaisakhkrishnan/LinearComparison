import java.util.Scanner;
import java.lang.Math;;
class Point{
	int x, y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public double calculateLength(Point p2) {
		double length = Math.sqrt( Math.pow((p2.x - this.x), 2) + Math.pow((p2.y - this.y), 2));
		return length;
	}
}
public class LinearComparison {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Line Comparison Computation Program");
		System.out.println("Enter x and y coordinate of first point: ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		Point p1 = new Point(x, y);
		System.out.println("Enter x and y coordinate of second point: ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		Point p2 = new Point(x, y);
		System.out.println("Calculated Distance between points is: "+ p1.calculateLength(p2));
		
	}
}
