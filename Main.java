public class Main {
    public static void main(String[] args) {
        System.out.println("Класс: " +Rectangle.printClassName(true));
        System.out.println();

        Rectangle rec1 = new Rectangle(8,2);// первый объект
        rec1.calculateArea();
        rec1.printArea();
        rec1.printRectangleKind();
        System.out.println();

        Rectangle rec2 = new Rectangle(2,8);//второй объект
        rec2.calculateArea();
        rec2.printArea();
        rec2.printRectangleKind();
        System.out.println ("Результат сравнения 1-го и 2-го объектов: " + rec2.isTheSameRectangle(rec1));
        System.out.println();

        Rectangle rec3 = new Rectangle(5);//третий объект
        rec3.calculateArea();
        rec3.printArea();
        rec3.printRectangleKind();
        rec3.isTheSameRectangle(rec2);
        System.out.println ("Результат сравнения 2-го и 3-го объектов: " + rec3.isTheSameRectangle(rec2));
        System.out.println("Результат сравнения 1-го и 3-го объектов: " + rec3.isTheSameRectangle(rec1));

        System.out.println(Rectangle.printRectanglesCount());
    }
}