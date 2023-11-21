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
	public boolean compareLength(Point p2, Point p3, Point p4) {
		double length1 = Math.sqrt( Math.pow((p2.x - this.x), 2) + Math.pow((p2.y - this.y), 2));
		double length2 = Math.sqrt( Math.pow((p3.x - p4.x), 2) + Math.pow((p3.y - p4.y), 2));
		return Double.compare(length1, length2) == 0;
	}
	
	public int compareLengthDifference(Point p2, Point p3, Point p4) {
	    Double length1 = Math.sqrt(Math.pow((p2.x - this.x), 2) + Math.pow((p2.y - this.y), 2));
	    Double length2 = Math.sqrt(Math.pow((p3.x - p4.x), 2) + Math.pow((p3.y - p4.y), 2));
	    return length1.compareTo(length2);
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
		System.out.println("Enter x and y coordinate of third point: ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		Point p3 = new Point(x, y);
		System.out.println("Enter x and y coordinate of fourth point: ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		Point p4 = new Point(x, y);
		System.out.println("Equality check of distance: "+ p1.compareLength(p2, p3, p4));	
		int compareLength = p1.compareLengthDifference(p2, p3, p4);
		if (compareLength == 0) {
		    System.out.println("The lengths are equal.");
		} else if (compareLength > 0) {
		    System.out.println("Length1 is greater than Length2.");
		} else {
		    System.out.println("Length1 is less than Length2.");
		}
	}
}
