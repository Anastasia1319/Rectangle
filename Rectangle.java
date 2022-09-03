public class Rectangle { //����� � ����� ������
    double x;
    double y;
    private static int createdRectangles = 0;
    private final static String RUSSIAN_CLASS_NAME = "�������������";
    private final static String ENGLISH_CLASS_NAME = "Rectangle";

    public Rectangle(double x,double y) { //�����������, ����������� �� ���� 2 ����������: ������� ��������������
        this.x = x;
        this.y = y;
        createdRectangles++;
    }

    public Rectangle(double x) { //������� - ������� ������ ��������������
        this.x=x;
        this.y =x;
        createdRectangles++;
    }

    double calculateArea () { // ����� ��� ���������� ������� ��������������
        return x*y;
    }

    public void printArea () { //����� ��� ������ �������� ������� ��������������
        System.out.println("������� �������������� ����������: " + calculateArea());
    }

    public void printRectangleKind () { //����� ��� ������ �������� ������
        if (y==x) {
            System.out.println ("��� �������");
        }
        else {
            System.out.println ("��� �������������");
        }
    }

    public boolean isTheSameRectangle (Rectangle rec) { // ����� ��� ��������� ���� ��������������� ����� �����
        if (this.x== rec.x && this.y==rec.y || this.x == rec.y && this.y == rec.x) {
            return true;
        }
        else {
            return false;
        }
    }
    public static String printRectanglesCount () { //������� ��������� ���������������
        return "����� ���� ������� " + createdRectangles + " ��������������";
    }

    public static String printClassName (boolean printInRussian) { //�������� ������ �� ������� ��� ���������� �����?
        if (printInRussian) {
            return RUSSIAN_CLASS_NAME;
        }
        else {
                return ENGLISH_CLASS_NAME;
        }
    }
}
