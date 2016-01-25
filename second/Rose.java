package lecture8.second;


public class Rose extends Flower {

    public Rose(int size, String color) {
        super(size, color);

    }

    @Override
    protected void smell() {
        System.out.println("Smells like rose!");
    }
}
