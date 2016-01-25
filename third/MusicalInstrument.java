package lecture8.third;

public abstract class MusicalInstrument {
    private String color;
    private int numberOfStrings;

    public MusicalInstrument(int numberOfStrings, String color) {
        this.numberOfStrings = numberOfStrings;
        this.color = color;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getColor() {
        return color;
    }
}
