public class Truck extends Transport {

    @Override
    public void updateTyre() {
        System.out.println("������ ��������");
    }
    @Override
    public void checkEngine() {
        System.out.println("��������� ���������");
    }
    @Override
    public void checkTrailer() {
        System.out.println("��������� ������");
    }
}
