package lecture8.first;


public class ImageFile extends File {
    public ImageFile(String format, int size, boolean empty) {
        super(format, size, empty);
    }


    @Override
    protected void openFile() {
        super.openFile();
        System.out.println("My type is " + this.getFormat() + " and my size " + this.getSize() + "Kb");
    }

    private int listSort(ImageFile a) {
        return this.getSize();
    }
}
