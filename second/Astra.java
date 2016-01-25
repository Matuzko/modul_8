package lecture8.second;

public class Astra extends Flower {
    public Astra(int size, String color) {
        super(size, color);
    }

    @Override
    protected void smell() {
        System.out.println("Smells like astra");
    }
}
