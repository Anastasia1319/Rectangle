public class Rectangle { //класс с двумя полями
    double x;
    double y;
    private static int createdRectangles = 0;
    private final static String RUSSIAN_CLASS_NAME = "Прямоугольник";
    private final static String ENGLISH_CLASS_NAME = "Rectangle";

    public Rectangle(double x,double y) { //конструктор, принимающий на вход 2 переменные: размеры прямоугольника
        this.x = x;
        this.y = y;
        createdRectangles++;
    }

    public Rectangle(double x) { //квадрат - частный случай прямоугольника
        this.x=x;
        this.y =x;
        createdRectangles++;
    }

    double calculateArea () { // метод для вычисления площади прямоугольника
        return x*y;
    }

    public void printArea () { //метод для вывода значения площади прямоугольника
        System.out.println("Площадь прямоугольника составляет: " + calculateArea());
    }

    public void printRectangleKind () { //метод для вывода названия фигуры
        if (y==x) {
            System.out.println ("Это квадрат");
        }
        else {
            System.out.println ("Это прямоугольник");
        }
    }

    public boolean isTheSameRectangle (Rectangle rec) { // метод для сравнения двух прямоугольников между собой
        if (this.x== rec.x && this.y==rec.y || this.x == rec.y && this.y == rec.x) {
            return true;
        }
        else {
            return false;
        }
    }
    public static String printRectanglesCount () { //подсчет созданных прямоугольников
        return "Всего было создано " + createdRectangles + " прямоугольника";
    }

    public static String printClassName (boolean printInRussian) { //название фигуры на русском или английском языке?
        if (printInRussian) {
            return RUSSIAN_CLASS_NAME;
        }
        else {
                return ENGLISH_CLASS_NAME;
        }
    }
}
