public class Main {
    public static void main(String[] args) {
        System.out.println("�����: " +Rectangle.printClassName(true));
        System.out.println();

        Rectangle rec1 = new Rectangle(8,2);// ������ ������
        rec1.calculateArea();
        rec1.printArea();
        rec1.printRectangleKind();
        System.out.println();

        Rectangle rec2 = new Rectangle(2,8);//������ ������
        rec2.calculateArea();
        rec2.printArea();
        rec2.printRectangleKind();
        System.out.println ("��������� ��������� 1-�� � 2-�� ��������: " + rec2.isTheSameRectangle(rec1));
        System.out.println();

        Rectangle rec3 = new Rectangle(5);//������ ������
        rec3.calculateArea();
        rec3.printArea();
        rec3.printRectangleKind();
        rec3.isTheSameRectangle(rec2);
        System.out.println ("��������� ��������� 2-�� � 3-�� ��������: " + rec3.isTheSameRectangle(rec2));
        System.out.println("��������� ��������� 1-�� � 3-�� ��������: " + rec3.isTheSameRectangle(rec1));

        System.out.println(Rectangle.printRectanglesCount());
    }
}