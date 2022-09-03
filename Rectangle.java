public class Rectangle { //����� � ����� ������
    double x;
    double y;
    //private static int createdRectangles = 0;

    public Rectangle(double x,double y) { //�����������, ����������� �� ���� 2 ����������: ������� ��������������
        this.x = x;
        this.y = y;
        //createdRectangles++;
    }

    public Rectangle(double x) {
        this.x=x;
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
        if (this.x== rec.x && this.y==rec.y) {
            return true;
        }
        else {
            return false;
        }
    }
}
