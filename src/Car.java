public class Car extends Transport implements ServiceTypes{
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
        
    }
}
