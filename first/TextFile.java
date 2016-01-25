package lecture8.first;

public class TextFile extends File {
    public TextFile(String format, int size, boolean empty) {
        super(format, size, empty);
    }

    @Override
    protected void openFile() {
        super.openFile();
        System.out.println("My type is "+this.getFormat()+" and my size "+this.getSize()+"Kb");
    }
}
