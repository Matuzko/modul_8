package lecture8.second;


public class Chamomile extends Flower {

    public Chamomile(int size, String color) {
        super(size, color);
    }

    @Override
    protected void smell() {
        System.out.println("Smells like chamomile");
    }
}
