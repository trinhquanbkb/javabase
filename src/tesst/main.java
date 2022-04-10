package tesst;
import java.util.*;
public class main {
	public static void main(String[] args) {
		Point a=new Point(5,6);
		Point b=new Point(7,8);
		Line n = new Line(a,b);
		n.Line(5,6,7,8);
		System.out.println(n.getLength());
	}
}
