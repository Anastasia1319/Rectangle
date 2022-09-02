public class Rectangle { //����� � ����� ������
    double x;
    double y;

    public Rectangle(double x,double y) { //�����������, ����������� �� ���� 2 ����������: ������� ��������������
        this.x = x;
        this.y = y;
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
