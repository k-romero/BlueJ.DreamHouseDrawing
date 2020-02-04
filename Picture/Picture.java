
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square wall1;
    private Square window;
    private Square treetrunk;
    private Triangle roof;
    private Triangle treetop;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(110);
        wall.changeColor("gray");
        wall.makeVisible();
        
        wall1 = new Square();
        wall1.moveVertical(80);
        wall1.changeSize(95);
        wall1.moveHorizontal(7);
        wall1.moveVertical(10);
        wall1.changeColor("white");
        wall1.makeVisible();

        window = new Square();
        window.changeColor("gray");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("gray");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(65);
        roof.moveVertical(70);
        roof.changeColor("pink");
        roof.makeVisible();
        
        treetop = new Triangle();
        treetop.changeSize(50, 65);
        treetop.moveHorizontal(160);
        treetop.moveVertical(130);
        treetop.changeColor("green");
        treetop.makeVisible();
        
        treetrunk = new Square();
        treetrunk.changeColor("black");
        treetrunk.moveHorizontal(135);
        treetrunk.moveVertical(145);
        treetrunk.makeVisible();
        

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
