// Ryan McCrory
// rmccrory
// PA4
// due 6/3/18
// VectorTest.java
//angles are in radians

public class testVector extends Vector {

	public static void main (String args[]) {
		
		//initializes vector blank test
		Vector blanktest = new Vector();
		
		//prints empty vector blanktest
		System.out.println("Tests default constructor and print method, all values should be zero.");
		blanktest.print(blanktest);
		
		//initialize test vector
		Vector test1 = new Vector(3, 4);
		
		//tests Vector() method
		System.out.println("Tests Vector() constructor, should print 3, 4, 5, .927.");
		test1.print(test1);
		
		//tests polarVector() method and printpolar()
		System.out.println("Tests polarVector(), should print 20 and 10.");
		Vector polar = polarVector(10, 20);
		polar.printpolar(polar);
		
		//tests getX()
		System.out.println("Tests getX(), with vector with xy coords (3, 4).");
		System.out.println(test1.getX());
		System.out.println();
			
		//tests getY()
		System.out.println("Tests getY(), with vector with xy coords (3, 4).");
		System.out.println(test1.getY());
		System.out.println();
		
		//tests getAngle()
		System.out.println("Tests getAngle(), with vector with polar coords (5, .927).");
		System.out.println(test1.getAngle());
		System.out.println();
		
		//tests getMagnitude()
		System.out.println("Tests getMagnitude(), with vector with polar coords (5, .927).");
		System.out.println(test1.getMagnitude());
		System.out.println();
		
		//initialize test vector
		Vector test3 = new Vector(9, 5);
		
		//tests add() method
		System.out.println("Tests add(), should add vectors with xy coords (3, 4) and (9, 5).");
		Vector add = test1.add(test3);
		add.print(add);
		
		//tests subtract() method
		System.out.println("Tests subtract(), should subtract vector with xy coords (3, 4) from (9, 5).");
		Vector sub = test3.subtract(test1);
		sub.print(sub);		
		
		//tests dotProduct() method
		System.out.println("Tests dotProduct(), should find dot product of vectors with xy coords (3, 4) and (9, 5).");
		System.out.println(test1.dotProduct(test3));
		System.out.println();
		
		//tests scalarMultiply() method
		System.out.println("Tests scalarMultiply(), should scale vector with xy coords (1, 1) by 10.");
		Vector scaletest = new Vector(1, 1);
		Vector sc = scaletest.scalarMultiply(10);
		sc.print(sc);
		
		//tests normalize() method and printpolar()
		System.out.println("Tests normalize(), should normalize vector with polar coords (10.29, .507).");
		Vector norm = test3.normalize();
		norm.printpolar(norm);
		
		//tests compare() method
		System.out.println("Tests compare method, should print vector test3.");
		Vector compare = test1.compare(test3);
		compare.print(compare);
		
		//tests inverse() method
		System.out.println("Tests inverse method, should print (-3, -4)");
		Vector inverse = test1.inverse(test1);
		inverse.print(inverse);
		
		
	}

}
