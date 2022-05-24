public class Bicycle extends Transport implements ServiceTypes {
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {

    }

    @Override
    public void checkTrailer() {

    }
}

