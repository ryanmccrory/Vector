// Ryan McCrory
// rmccrory
// PA4
// due 6/3/18
// Vector.java
// A class that implements the Vector ADT.

// For this assignment, you must complete this code skeleton.
// You may not change the function prototypes.
// You are expected to fill in the functions to make them work
// as expected, and you can add as much as you need or want.
// We recommend implementing the Vector ADT using x and y coordinates.

// Notes:
// Angles are always in radians, not degrees.

class Vector {

  // Fields
	float xcord;
	float ycord;
	float mag;
	float ang;


  // Constructors

  // The default constructor should create a new Vector with no magnitude.
  public Vector() {
       
	  //initializes vector components as 0
	  xcord = 0;
	  ycord = 0;
	  mag = 0;
	  ang = 0;
	  
  }

  // This constructor takes an x and a y coordinate for the Vector.
  public Vector(float x, float y) {
      
	  //initializes vector V
	  //Vector V = new Vector();
	  
	  //sets xcord to x and ycord to y
	  xcord = x;
	  ycord = y;
	  mag = (float) Math.sqrt(Math.abs(xcord * xcord) + Math.abs(ycord * ycord));
	  ang = (float) Math.atan(ycord / xcord);
  
  }

  // This "constructor" takes an angle and a magnitude for the Vector.
  // It is not a traditional constructor because only one function can have
  //   the signature Vector(float, float).
  public static Vector polarVector(float angle, float magnitude) {
      
	  //initializes polar vector
	  Vector polar = new Vector();
	  
	  //sets ang to angle and mag to magnitude
	  polar.ang = angle;
	  polar.mag = magnitude;
	  
	  //return polar
	  return polar;
	  
  }



  // Access functions

  /** getX
   *  Returns the x coordinate of the Vector.
   */
  public float getX() {
      
	  //returns xcord
	  return this.xcord;
	  
  }

  /** getY
   *  Returns the y coordinate of the Vector.
   */
  public float getY() {
      
	  //returns ycord
	  return ycord;
	  
  }

  /** getAngle
   *  Returns the angle of the Vector.
   */
  public float getAngle() {
      
	  //returns angle
	  return ang;    
	  
  }

  /** getMagnitude
   *  Returns the magnitude of the Vector.
   */
  public float getMagnitude() {
      
	  //returns mag
	  return mag;
	  
  }

  /** add
   *  Returns the sum of this Vector with the given Vector.
   */
  public Vector add(Vector other) {
      
	  //initializes vector add
	  Vector add = new Vector();
	  
	  //does addition
	  add.xcord = this.xcord + other.xcord;
	  add.ycord = this.ycord + other.ycord;
	  
	  //finds mag
	  add.mag = (float) Math.sqrt(Math.abs(add.xcord * add.xcord) + Math.abs(add.ycord * add.ycord));
	  
	  //finds ang
	  add.ang = (float) Math.atan(add.ycord / add.xcord);
	  
	  //returns add
	  return add;
	  
  }

  /** subtract
   *  Returns the difference between this Vector and the given Vector.
   */
  public Vector subtract(Vector other) {
      
	  //initializes vector subtract
	  Vector subtract = new Vector();
	  
	  //does subtraction
	  subtract.xcord = this.xcord - other.xcord;
	  subtract.ycord = this.ycord - other.ycord;
	  
	  //finds mag
	  subtract.mag = (float) Math.sqrt(Math.abs(subtract.xcord * subtract.xcord) + Math.abs(subtract.ycord * subtract.ycord));
	  
	  //finds ang
	  subtract.ang = (float) Math.atan(subtract.ycord / subtract.xcord);
	  
	  //returns subtract
	  return subtract;
	  
  }

  /** dotProduct
   *  Returns the dot product of this Vector and the given Vector.
   */
  
  public float dotProduct(Vector other) {
      
	  //finds dot product
	  float dotp = ((this.xcord * other.xcord) + (this.ycord * other.ycord));
	  
	  //returns dotProduct
	  return dotp;
	  
  }
 

  /** scalarMultiply
   *  Returns this Vector scaled by the given scalar.
   */
  public Vector scalarMultiply(float scalar) {
      
	  //initializes vector scalarMultiply
	  Vector sm = new Vector();
	  
	  //scales this vector by given scalar
	  sm.xcord = this.xcord * scalar;
	  sm.ycord = this.ycord * scalar;
	  sm.mag = this.mag * scalar;
	  sm.ang = this.ang;		 
	  
	  //returns scalarMultiply
	  return sm;
	  
  }

  /** normalize
   *  Returns the normalized version of this Vector, a Vector with the same
   *    angle with magnitude 1.
   */
  public Vector normalize() {
      
	  //initializes vector normalize
	  Vector norm = new Vector();
	  
	  //normalizes this vector
	  norm.ang = this.ang;
	  norm.mag = 1;
			  
	  //returns normalize
	  return norm;
	  
  }

  //compares two vectors and returns the one with the greater magnitude
  public Vector compare(Vector other) {
	  
	  //returns this vector if its magnitude is greater than others
	  if(this.mag > other.mag) {
		  return this;
	  } else {
		  //returns other is other has a greater magnitude
		  return other;
	  }
	  
  }
  
  
  //method for printing
  public void print (Vector in) {
	  
	  //prints x and y cords, magnitude and angle
	  System.out.println("xcord = " + in.xcord + ", ycord = " + in.ycord + ", magnitude = " + in.mag + ", angle = " + in.ang);
	  System.out.println();
	  
  }
  
  //method for printing only the polar coordinates
  public void printpolar (Vector in) {
	  
	  //prints the polar coordinates, being theta and magnitude
	  System.out.println("magnitude = " + in.mag + ", angle = " + in.ang);
	  System.out.println();
	  
  }

  public Vector inverse (Vector in) {
	  
	  //finds the inverse of vector in
	  Vector inverse = new Vector();
	  inverse.xcord = in.xcord*(-1);
	  inverse.ycord = in.ycord*(-1);
	  
	  return inverse;
  }
  
  
}

