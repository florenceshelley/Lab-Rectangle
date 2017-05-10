/**
 * Rectangle
 * This program calculates the area and perimeter of a rectangle
 * when provided with a width value and a height value
 *
 * @author Florence Shelley
 * @version May 5, 2017
 */
public class Rectangle
{
    
    private int width;
    private int height;

    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(int w, int h)
    {
        // initialise instance variables
        width = w;
        height = h;
    }

    /**
     * Swap the values of the width and the height of the rectangle with each other
     *
     */
    public void flip() 
    {
        // Set width to previous height value and height to previous width value
        int prevWidth = width;
        int prevHeight = height;
        width = prevHeight;
        height = prevWidth;
    }
    
    public int getWidth()
    {
        return this.width;
    }
    
    public int getHeight()
    {
        return this.height;
    }
    
    public int getArea()
    {
        // Calculate the area of the rectangle, given the width and height
        return this.width * this.height;
    }
    
    public int getPerimeter()
    {
        // Calculate the perimeter of the rectangle, given the width and height
        return (this.width * 2) + (this.height * 2);
    }
    
    // public static void main(String[] args) {
    //   Rectangle thin = new Rectangle(1, 2);
    //   int thinW = thin.getWidth();
    //   int thinH = thin.getHeight();
    //   int thinArea = thin.getArea();
    //   int thinPerim = thin.getPerimeter();

    //   System.out.println("Width: " + thinW + "\nHeight: " + thinH + "\nArea: " + thinArea + "\nPerimeter: " + thinPerim)

    //   thin.flip();
    // }
}