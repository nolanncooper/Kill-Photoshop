/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Exercise 1 */
  public static void testKeepOnlyBlue() {
	  Picture beach = new Picture("beach.jpg");
	    beach.explore();
	    beach.keepOnlyBlue();
	    beach.explore();
  }

  //Exercise to negate
  public static void testNegate() {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.negateThatThing();
	  beach.explore();
  }
  public static void testGrayscale() {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.grayscaleThatThing();
	  beach.explore();
  }

  public static void testFixUnderwater() {
	  Picture water = new Picture("water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  
  public static void testMirrorHorizontal() {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.mirrorHorizontal();
	  beach.explore();
  }
  public static void testMirrorHorizontalBotToTop() {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.mirrorHorizontalBotToTop();
	  beach.explore();
  }
  public static void testMirrorDiagonal() {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.mirrorDiagonal();
	  beach.explore();
  }
  public static void testMirrorArms() {
	  Picture snowman = new Picture("snowman.jpg");
	  snowman.explore();
	  snowman.mirrorArms();
	  snowman.explore();
  }
  
  public static void testMirrorGull() {
	  Picture gull = new Picture("seagull.jpg");
	  gull.explore();
	  gull.mirrorGull();
	  gull.explore();
  }

  
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
//    testZeroBlue();
//    testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
//    testNegate();
//    testGrayscale();
//    testFixUnderwater();
//    testMirrorVerticalRightToLeft();
//	  testMirrorHorizontal();
//	  testMirrorHorizontalBotToTop();
//	  testMirrorDiagonal();
//    testMirrorTemple();
//    testMirrorArms();
	  testMirrorGull();
    
    
    
}
}
