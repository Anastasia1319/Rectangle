public class Main {
    public static void main(String[] args) {
    Rectangle rec1 = new Rectangle(4,6);// ������ ������
    rec1.calculateArea();
    rec1.printArea();
    rec1.printRectangleKind();

    Rectangle rec2 = new Rectangle(2,8);//������ ������
    rec2.calculateArea();
    rec2.printArea();
    rec2.printRectangleKind();
    System.out.println ("��������� ��������� 1-�� � 2-�� ��������: " + rec2.isTheSameRectangle(rec1));


    Square sq = new Square(5);//������ ������
    sq.calculateArea();
    sq.printArea();
    sq.printRectangleKind();
    sq.isTheSameRectangle(rec2);
    System.out.println ("��������� ��������� 2-�� � 3-�� ��������: " + sq.isTheSameRectangle(rec2));
    System.out.println("��������� ��������� 1-�� � 3-�� ��������: " + sq.isTheSameRectangle(rec1));

    }
}