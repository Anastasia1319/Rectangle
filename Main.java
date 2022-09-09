public class Main {
    public static void main(String[] args) {
        System.out.println("Class: " +Rectangle.printClassName(true));
        System.out.println();

        Rectangle rec1 = new Rectangle(8,2);// first object
        rec1.calculateArea();
        rec1.printArea();
        rec1.printRectangleKind();
        System.out.println();

        Rectangle rec2 = new Rectangle(2,8);//second object
        rec2.calculateArea();
        rec2.printArea();
        rec2.printRectangleKind();
        System.out.println ("The result of comparing the 1st and 2nd objects: " + rec2.isTheSameRectangle(rec1));
        System.out.println();

        Rectangle rec3 = new Rectangle(5);//third object
        rec3.calculateArea();
        rec3.printArea();
        rec3.printRectangleKind();
        rec3.isTheSameRectangle(rec2);
        System.out.println ("The result of comparing the 2nd and 3rd objects: " + rec3.isTheSameRectangle(rec2));
        System.out.println("The result of comparing the 1st and 3rd objects: " + rec3.isTheSameRectangle(rec1));

        System.out.println(Rectangle.printRectanglesCount());
    }
}