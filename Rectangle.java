public class Rectangle {
    double x;
    double y;
    private static int createdRectangles = 0;
    private final static String RUSSIAN_CLASS_NAME = "Прямоугольник";
    private final static String ENGLISH_CLASS_NAME = "Rectangle";

    public Rectangle(double x,double y) { //constructor that takes 2 variables as input: the dimensions of the rectangle
        this.x = x;
        this.y = y;
        createdRectangles++;
    }

    public Rectangle(double x) { //a square is a special case of a rectangle
        this.x=x;
        this.y =x;
        createdRectangles++;
    }

    double calculateArea () { // method for calculating the area of a rectangle
        return x*y;
    }

    public void printArea () { //method for displaying the area of a rectangle
        System.out.println("The area of a rectangle is: " + calculateArea());
    }

    public void printRectangleKind () { //method for displaying the name of the figure
        if (y==x) {
            System.out.println ("It's a square");
        }
        else {
            System.out.println ("It's a rectangle");
        }
    }

    public boolean isTheSameRectangle (Rectangle rec) { // method for comparing two rectangles with each other
        if (this.x== rec.x && this.y==rec.y || this.x == rec.y && this.y == rec.x) {
            return true;
        }
        else {
            return false;
        }
    }
    public static String printRectanglesCount () { //counting rectangles created
        return "Total was created " + createdRectangles + " rectangles";
    }

    public static String printClassName (boolean printInRussian) { //the name of the figure in Russian or English?
        if (printInRussian) {
            return RUSSIAN_CLASS_NAME;
        }
        else {
                return ENGLISH_CLASS_NAME;
        }
    }
}
