public class Rectangle { //класс с двумя полями
    double x;
    double y;
    //private static int createdRectangles = 0;

    public Rectangle(double x,double y) { //конструктор, принимающий на вход 2 переменные: размеры прямоугольника
        this.x = x;
        this.y = y;
        //createdRectangles++;
    }

    public Rectangle(double x) {
        this.x=x;
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
        if (this.x== rec.x && this.y==rec.y) {
            return true;
        }
        else {
            return false;
        }
    }
}
