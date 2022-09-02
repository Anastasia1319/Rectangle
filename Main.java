public class Main {
    public static void main(String[] args) {
    Rectangle rec1 = new Rectangle(4,6);// первый объект
    rec1.calculateArea();
    rec1.printArea();
    rec1.printRectangleKind();

    Rectangle rec2 = new Rectangle(2,8);//второй объект
    rec2.calculateArea();
    rec2.printArea();
    rec2.printRectangleKind();
    System.out.println ("Результат сравнения 1-го и 2-го объектов: " + rec2.isTheSameRectangle(rec1));


    Square sq = new Square(5);//третий объект
    sq.calculateArea();
    sq.printArea();
    sq.printRectangleKind();
    sq.isTheSameRectangle(rec2);
    System.out.println ("Результат сравнения 2-го и 3-го объектов: " + sq.isTheSameRectangle(rec2));
    System.out.println("Результат сравнения 1-го и 3-го объектов: " + sq.isTheSameRectangle(rec1));

    }
}